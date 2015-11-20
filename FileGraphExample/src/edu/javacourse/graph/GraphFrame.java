package edu.javacourse.graph;

import javax.swing.JFrame;

public class GraphFrame extends JFrame
{
    public GraphFrame() {
        
        GraphComponent graph = new GraphComponent();
        add(graph);
        
        setBounds(200, 50, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
