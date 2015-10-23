
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphicsExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        JButton btn = new JButton("TEXT 1");
        frame.add(btn, BorderLayout.NORTH);
        
        JButton btn1 = new JButton("TEXT 2");
        frame.add(btn1, BorderLayout.SOUTH);
        
        frame.setBounds(200, 200, 400, 200);
        frame.setTitle("Simple title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
