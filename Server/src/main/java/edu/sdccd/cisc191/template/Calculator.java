package edu.sdccd.cisc191.template;


//helped me for syntax: https://bit.ly/36Kh213
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;



public class Calculator {
    //declaring window components
    //declaring buttons for operators
    JButton additionB;
    JButton subtractionB;
    JButton divisionB;
    JButton multiplicationB;
    JButton equalB;
    //decimal button
    JButton decimalB;

    //initialize button array
    JButton buttons[];

    //initializing containers to store components
    JPanel content;
    JPanel panel;

    //initialize text field
    JTextField textField;


    //declare constructor method to create components
    Calculator() {

        //initialize array of 10 buttons for 10 digits
        buttons = new JButton[10];
        //constructs container for layout
        content = new JPanel();

        //construct layout manager
        BorderLayout bl = new BorderLayout();
        content.setLayout(bl);

        //construct display field and place it in the top area of the window
        textField = new JTextField(30);
        content.add("North",textField);

        //create array of buttons using for-loop
        for(int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }
        //create buttons for operators
        additionB = new JButton("+");
        subtractionB = new JButton("-");
        divisionB = new JButton("/");
        multiplicationB = new JButton("*");
        decimalB = new JButton(".");
        equalB = new JButton("=");



        //constructing panel with specific grid
        panel = new JPanel ();
        GridLayout gl = new GridLayout(4,4);
        panel.setLayout(gl);


        //initialize for-loop to add all 10 digit buttons to panel
        for(int i = 0; i < 10; i++) {
            panel.add(buttons[i]);
        }

        //adding all operator buttons to panel
        panel.add(additionB);
        panel.add(subtractionB);
        panel.add(divisionB);
        panel.add(multiplicationB);
        panel.add(decimalB);
        panel.add(equalB);


        //Add the panel to window
        content.add(panel);
        //Construct frame and set content pane
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(content);
        //automatically size window to fit all the components
        frame.pack();
        //display window
        frame.setVisible(true);
    }

    //main method to run Calculator
    @Test
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}

