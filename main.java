package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main {

   // int temp =1;
    public static void main(String[] args) {


            JFrame jf = new JFrame("ARROW AND BALLON ");
            jf.setSize(900, 1000);
           // jf.setLocation(500, 250);
            jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
           // jf.setContentPane(new panel());
              JLabel jl = new JLabel("ARROW AND BALLON");
              jl.setBounds(350,8,500,30);
              jl.setBackground(Color.red);
            //  jl.setSize(100,80);
              // jl.setText("ARROW AND BALLON");


        JLabel jl1 = new JLabel("Score    0 ");
        jl1.setBounds(10,30,60,30);


        JLabel jl2 = new JLabel("Level 1 ");
        jl2.setBounds(10,50,50,30);

              JPanel jp =new JPanel();
              jp.setBackground(Color.cyan);
              jp.setBounds(0,0,900,100);



            panel p = new panel(580,570);

           p.setBackground(Color.black);
           p.setBounds(0,100,900,800);


        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\Saved Pictures\\archer1.jpg"));
        label.setBounds(5,20,191,105);
           p.add(label);
        JButton b = new JButton("START");
        b.setBackground(Color.green);
        b.setBounds(10,280,80,40);

        p.setLayout(null);
        p.setVisible(true);
        jf.setLayout(null);
        jp.setLayout(null);
        p.add(b);
        jf.add(jp);
      //  jf.add(new panel());
        jf.add(p);
        jp.add(jl);
        jp.add(jl1);
        jp.add(jl2);


      //  ImageIcon im = new ImageIcon("sisteca.png");
        jf.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

        }
        });
    }
}


