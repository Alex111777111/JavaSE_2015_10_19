package edu.javacourse.graph;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComponent;

public class GraphComponent extends JComponent
{
    private int[] x;
    private int[] y;

    public GraphComponent() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("coordinates.txt"));
            String line = null;
            int num = 0;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] xy = line.split("\\s*,\\s*");
                if (xy.length != 2) {
                    num = Integer.parseInt(line);
                } else {
                    if (x == null) {
                        x = new int[num];
                        y = new int[num];
                    }
                    x[count] = Integer.parseInt(xy[0]);
                    y[count] = Integer.parseInt(xy[1]);
                    count++;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (x[i] > maxX) {
                maxX = x[i];
            }
            if (y[i] > maxY) {
                maxY = y[i];
            }
            if (x[i] < minX) {
                minX = x[i];
            }
            if (y[i] < minY) {
                minY = y[i];
            }
        }

        double coeffX = ((double) getWidth()) / ((double) (maxX - minX));
        double coeffY = ((double) getHeight()) / ((double) (maxY - minY));

        int[] gx = new int[x.length];
        int[] gy = new int[y.length];
        
        for(int i=0; i<x.length; i++) {
            gx[i] = (int)((x[i] - minX) * coeffX);
            gy[i] = (int)((y[i] - minY) * coeffY);
        }

        g.drawPolygon(gx, gy, x.length);
    }
}
