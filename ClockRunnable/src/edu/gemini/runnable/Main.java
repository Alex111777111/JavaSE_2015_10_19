package edu.gemini.runnable;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASaburov
 */
public class Main
{

    public static void main(String[] args) {
        // Создать форму
        final Clock cl = new Clock();
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run() {
                cl.setVisible(true);
            }
        });
    }
}
