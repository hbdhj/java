package com.javawindows;

import java.awt.*;
import javax.swing.*;

public class HelloWorldSwing {
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
	    // Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello My first Swing Windows!");
        frame.getContentPane().add(label);

        // adjust to need.
        Dimension dim = new Dimension(400,300);
        frame.setPreferredSize(dim);
        frame.setLocationByPlatform(true);
        
        // Display the window.
        frame.pack();
	    frame.setVisible(true);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
