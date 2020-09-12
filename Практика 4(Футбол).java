package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
class MyMouse extends JFrame
{
    int Milan=0;
    int Madrid=0;
    String winner;
    JLabel lbl = new JLabel("Result: 0 X 0");
    JLabel lbl1 = new JLabel("Last Scorer: N/A");
    JLabel lbl2 = new JLabel("Winner: DRAW");
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JButton but3 = new JButton("End Game");


    public MyMouse()
    {
        super("Результат матча между командами Милан и Мадрид");
        setSize(700,400);
        setLayout(new BorderLayout());
        but1.setBounds(15,30,150,20);
        but2.setBounds(200,30,150,20);
        lbl.setBounds(140,60,150,20);
        lbl1.setBounds(140,90,150,20);
        lbl2.setBounds(140,120,150,20);
        but3.setBounds(140,200,150,20);
        add(but1);
        add(but2);
        add(but3);
        add(lbl);
        add(lbl1);
        add(lbl2);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Milan++;
                lbl.setText("Result: "+Milan+" X "+Madrid);
                lbl1.setText("Last Scorer:  AC Milan");
            }
        });
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                lbl.setText("Result: "+Milan+" X "+Madrid);
                lbl1.setText("Last Scorer:  Real Madrid");
            }
        });
        but3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(Milan>Madrid)
                {
                    winner="AC Milan";
                }
                else if(Madrid>Milan)
                {
                    winner="Real Madrid";
                }
                else
                {
                    winner="DRAW";
                }
                but1.setEnabled(false);
                but2.setEnabled(false);
                but3.setEnabled(false);
                lbl2.setText("Winner: "+winner);
            }
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}
