package it.volta.ts.swingapp.ui.components;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import it.volta.ts.swingapp.ui.listeners.FileChooserButtonListener;

public class InputEBottoneCercaComponent extends JPanel {

    public InputEBottoneCercaComponent(String testoLabel) {
        super();

		this.setMinimumSize(new Dimension(70, 35));
        this.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel l1 = new JLabel(testoLabel);
		JTextField tf = new JTextField();
		tf.setText("...");
		tf.setEditable(false);
		Dimension d = new Dimension(170, 35);
		tf.setPreferredSize(d);
		tf.setMinimumSize(d);

		JButton b1 = new JButton("Cerca");

		ActionListener actionListener = new FileChooserButtonListener(tf); 
		b1.addActionListener(actionListener);

		this.setLayout(new FlowLayout());
		this.add(l1);
		this.add(tf);
		this.add(b1);

    }
    
}
