package src.com.test ;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String name = JOptionPane.showInputDialog("Enter your name") ;
        JOptionPane.showMessageDialog(null, "hello " + name + " !") ;
    }
}
