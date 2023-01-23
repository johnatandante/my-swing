package it.volta.ts.swingapp;

import java.awt.EventQueue;

import it.volta.ts.swingapp.ui.MySwingFrame;

public class MySwingApp {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwingFrame frame = new MySwingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
