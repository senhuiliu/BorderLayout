/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
//Header file declarations

import java.awt.*;

import javax.swing.*;

//Create class BorderLayout and it extends from JFrame

public class BorderLayoutDemo extends JFrame

{

     //declare required buttons

     private JButton btn1, btn2, btn3, btn4, btn5, btn6;

     //main method

     public static void main(String[] args)

     {

          //create an object of type BorderLayoutDemo

          BorderLayoutDemo frame = new BorderLayoutDemo();

          //pack the frame

          frame.pack();

          //set the title to the window

          frame.setTitle("BorderLayout");

          //close the window

          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          //Center the frame

          frame.setLocationRelativeTo(null);

          frame.setVisible(true);

     }

     //constructor definition

     public BorderLayoutDemo()

     {

          //create panel1 and add three buttons

          JPanel panel1 = new JPanel();

          //set the layout to flow layout

          panel1.setLayout(new FlowLayout());

          //add buttons to the panel

          panel1.add(btn1 = new JButton("Button 1"));

          panel1.add(btn2 = new JButton("Button 2"));

          panel1.add(btn3 = new JButton("Button 3"));

          //create panel2 and add three buttons

          JPanel panel2 = new JPanel();

          panel2.setLayout(new FlowLayout());

          panel2.add(btn4 = new JButton("Button 4"));

          panel2.add(btn5 = new JButton("Button 5"));

          panel2.add(btn6 = new JButton("Button 6"));

          // Place panel1 and panel2 in the frame

          setLayout(new BorderLayout());

          add(panel1, BorderLayout.SOUTH);

          add(panel2, BorderLayout.CENTER);

     }

}

