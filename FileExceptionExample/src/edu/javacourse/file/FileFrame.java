package edu.javacourse.file;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileFrame extends JFrame implements ActionListener
{
    public FileFrame() {
        JButton btn = new JButton("READ FILE");
        btn.addActionListener(this);
        add(btn, BorderLayout.NORTH);
        
        JButton btn2 = new JButton("DOWN");
        add(btn2, BorderLayout.SOUTH);
        
        setBounds(200, 200, 300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileInfoReader fir = new FileInfoReader();
        try {
            String s = fir.readString();
            JOptionPane.showMessageDialog(null, s);
        } catch (FileInfoReaderException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
