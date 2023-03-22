package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class panel extends JPanel{
         int x =650;
         int y = 600;
         int width = 40;
         int height = 60;
         int  stepsize =10;
         int temp=1;
         int step=0;
         int tp=1;
         int a=40, b=40, c=100, d=40;
         int a1=40, b1=40,c1=30, d1=20;
         int a2=40, b2=40, c2=30, d2=60;
         int a3=100, b3=40, c3=90, d3=20;
         int a4=100, b4=40, c4=90, d4=60;
    int max_x,max_y;
     public    panel(int w,int h) {
         this.max_x = w;
         this.max_y = h+250;
     }
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(x, y, width, height);

        g.setColor(Color.green);
        g.fillOval(700, y, width, height);

        g.setColor(Color.red);
        g.fillOval(750, y, width, height);

        g.setColor(Color.yellow);
        g.fillOval(800, y, width, height);


        g.setColor(Color.white);
        g.drawLine(a, b, c, d);

        g.setColor(Color.white);
        g.drawLine(a1, b1, c1, d1);


        g.setColor(Color.white);
        g.drawLine(a2, b2, c2, d2);


        g.setColor(Color.white);
        g.drawLine(a3, b3, c3, d3);


        g.setColor(Color.white);
        g.drawLine(a4, b4, c4, d4);
            try {

               if (y + width > max_y || y < 0)
              //  while(1==1) {
                  //  if (y > 0 && y > 650) {
                        stepsize = -stepsize;
                        y = y - stepsize;

                     Thread.sleep(5);
                     a += step;
                          // b += step;
                          c += step;
                          //   d += step;

                          a1 += step;
                          //     b1 += step;
                          c1 += step;
                          // d1 += step;

                          a2 += step;
                          //   b2 += step;
                          c2 += step;
                          //  d2 += step;

                          a3 += step;
                          // b3 += step;
                          c3 += step;
                          //  d3 += step;

                          a4 += step;
                          // b4 += step;
                          c4 += step;
                          //  d4 += step;
                       //  tp +=step;


                  //*    }
                //  }
                JButton shot = new JButton("SHOT");
                setLayout(null);
                shot.setBounds(10, 400, 80, 30);
                add(shot);
                shot.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        step = step + 10;
                        if(step<500){

                             a=40; c=100;
                             a1=40;c1=30;
                             a2=40; c2=30;
                             a3=100; c3=90;
                            a4=100; c4=90;
                        }
                            else{    step = step + 10;}
                    }
                });

                JButton reshot = new JButton("RESHOT");
                setLayout(null);
                reshot.setBounds(10, 500, 100, 30);
                add(reshot);
                reshot.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        step= 0;
                    }
                });

            } catch (InterruptedException e) {
                      e.printStackTrace();
            }
            repaint();
        }
}


