package edu.javacourse.thread;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MovingFrame extends JFrame implements ActionListener 
{
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final int STEP = 5;
    
    private boolean direction = false;
    
    public MovingFrame() {
        JButton left = new JButton(LEFT);
        left.setActionCommand(LEFT);
        left.addActionListener(this);
        add(left, BorderLayout.WEST);
        
        JButton right = new JButton(RIGHT);
        right.setActionCommand(RIGHT);
        right.addActionListener(this);
        add(right, BorderLayout.EAST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 300, 250, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        direction = RIGHT.equals(e.getActionCommand());
    }
    
    public void moveFrame() {
        Rectangle r = getBounds();
        if(direction) {
            r.x += STEP;
        } else {
            r.x -= STEP;
        }
        setBounds(r);
    }
}
