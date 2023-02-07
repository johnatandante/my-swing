package it.volta.ts.swingapp.ui.components;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class TestoEBottoneComponent extends JPanel {

    public TestoEBottoneComponent(String testoLabel, String testoBottone) {
        super();

        this.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel l1 = new JLabel(testoLabel);
		JButton b1 = new JButton(testoBottone);
		this.setLayout(new FlowLayout());
		this.add(l1);
		this.add(b1);

    }
    
}
