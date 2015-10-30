package edu.javacourse.inter;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleFrame extends JFrame
{
    public SimpleFrame() {
        JButton btn = new JButton("PRESS ME");
        btn.addActionListener(new FirstClass());
        btn.addActionListener(new SecondClass());
        btn.addActionListener(new SecondClass());
        btn.addActionListener(new SecondClass());
        
        add(btn, BorderLayout.NORTH);
        
        setBounds(200, 200, 500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
