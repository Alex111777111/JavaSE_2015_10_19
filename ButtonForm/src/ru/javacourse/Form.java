package ru.javacourse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame
{
    public Form() {
        JButton btn = new JButton("PRESS ME");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button is pressed");
            }
        });

        add(btn);
    }

    public static void main(String[] args) {
        Form f = new Form();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 200, 200);
        f.setVisible(true);
    }
}
