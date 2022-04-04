package edu.sdccd.cisc191.template;

import java.net.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/**
 * This program opens a connection to a computer specified
 * as the first command-line argument.  If no command-line
 * argument is given, it prompts the user for a computer
 * to connect to.  The connection is made to
 * the port specified by LISTENING_PORT.  The program reads one
 * line of text from the connection and then closes the
 * connection.  It displays the text that it read on
 * standard output.  This program is meant to be used with
 * the server program, DateServer, which sends the current
 * date and time on the computer where the server is running.
 */
abstract class customerInput {
    public void input() {
        /**
         * Declaring Socket for intercommunication between server and client
         *
         * Declaring I/O streams for efficient data reads and writes
         *      - Using Buffered reader
         */

        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            /**
             * Declaring Socket object for communication in server
             *
             * Connecting I/O streams to socket
             *
             * Wrapping I/O streams into buffer
             *
             * Declaring scanner for user input using keyboard
             */

            socket = new Socket("localhost", 4444);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                /**
                 * Allowing user input to buffer through while loop
                 *
                 * Message sends after user inputs keyboard data
                 *
                 * Prints user input data
                 */
                String userOrd = scanner.nextLine();
                bufferedWriter.write(userOrd);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("Server: " + bufferedReader.readLine());
                if (userOrd.equalsIgnoreCase("close"))
                    break;
            }
        }
        /**
         * Catches any errors
         */
        catch (IOException e) {e.printStackTrace();}
        finally {
            try {
                if (socket != null)
                    socket.close();
                if (inputStreamReader != null)
                    inputStreamReader.close();
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
                if (bufferedReader != null)
                    bufferedReader.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * Class to extend abstract class
 *
 * Interface for question to user
 *
 * Second class to display interface message
 */
class orders extends customerInput {}
interface welcomePrompt {}
class prompt implements welcomePrompt {
    public void welcome() {
        System.out.println("What would you like to order?\n");
    }
}

/**
 * Main Client class for objects, display message, and user input
 */
public class Client {
    public static void main(String[] args) {
        orders o = new orders();
        prompt p = new prompt();
        p.welcome();
        o.input();
    }
}
 //end class Client