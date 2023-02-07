package it.volta.ts.swingapp.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import it.volta.ts.swingapp.ui.components.*;

public class MySwingFrame extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane2;

	/**
	 * Create the frame.
	 */
	public MySwingFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setMinimumSize(new Dimension(500, 400));

		JComponent container = new JPanel();
		container.setLayout(new FlowLayout());

		contentPane = new TestoEBottoneComponent("Etichetta per il bottone 1", "Do Nothing");
		contentPane2 = new InputEBottoneCercaComponent("Cerca il file");
		
		container.add(contentPane);
		container.add(contentPane2);
		setContentPane(container);

		// pack();

	}

}
