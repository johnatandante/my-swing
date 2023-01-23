package it.volta.ts.swingapp.ui;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MySwingFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MySwingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton b1 = new JButton("Bottone1");
		contentPane.setLayout(new FlowLayout());
		contentPane.add(b1);
		b1.setVisible(true);
		
		
		setContentPane(contentPane);
	}

}
