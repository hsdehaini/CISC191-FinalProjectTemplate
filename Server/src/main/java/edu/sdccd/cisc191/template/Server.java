package edu.sdccd.cisc191.template;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        /**
         * Declaring Socket for intercommunication between server and client
         *
         * Declaring I/O streams for efficient data reads and writes
         *      - Using Buffered reader
         * Declaring Socket object to listen for connection
         */
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(4444);
        while (true) {
            try {
                /**
                 * Declares a Socket object once server is connected
                 *
                 * Connecting I/O streams to Socket
                 *
                 * Declaring the buffer reader and writer
                 */
                socket = serverSocket.accept();
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while(true) {
                    /**
                     * Receives User input and outputs the data
                     *
                     * Finally, it states that the order was received in no errors were found
                     */
                    String ord = bufferedReader.readLine();
                    System.out.println("Customer: " + ord);
                    bufferedWriter.write("Order received");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                    if (ord.equalsIgnoreCase("close"));
                    break;
                }
                /**
                 * Closing everything once all algorithms succeed
                 */
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedReader.close();
                bufferedWriter.close();

            }
            /**
             * Catches any errors
             */
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
 //end class Server