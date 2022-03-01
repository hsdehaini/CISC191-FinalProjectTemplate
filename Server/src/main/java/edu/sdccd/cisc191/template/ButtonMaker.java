package edu.sdccd.cisc191.template;

import javax.swing.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;


public class ButtonMaker {
    public static void main(String[] args) {
        JButton buttons[];
        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }
    }
}
