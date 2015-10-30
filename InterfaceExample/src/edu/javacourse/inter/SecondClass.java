package edu.javacourse.inter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SecondClass extends InterfaceExample implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Second Class:" + this.hashCode());
    }

}
