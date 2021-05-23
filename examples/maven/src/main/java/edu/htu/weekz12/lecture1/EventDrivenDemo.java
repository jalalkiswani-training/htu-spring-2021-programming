package edu.htu.weekz12.lecture1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;*/

// wild card import
import javax.swing.*;

public class EventDrivenDemo {

	public static void main(String[] args) {
	// 1- window
		JFrame frame=new JFrame();
		// change the size of the frame
		frame.setSize(400, 100);// 400 width, 300 height in pixels
		// to set the frame in the center of the screen
		frame.setLocationRelativeTo(null);
		
		// add title to the frame
		frame.setTitle("Welcome Window");
		
		// to terminate the running frame when close is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 2- container
		JPanel pnl=new JPanel();
		
		// 3- components 
		JLabel lbl=new JLabel("Name");
		final JTextField nameTxt=new JTextField(20);// 20 for the width
		JButton btn=new JButton("say hello");
		
		// starting the implementation of event driven paradigm
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Hello there");
				String name=nameTxt.getText();
				JOptionPane.showMessageDialog(null, "Hello from "+ name);
				
			}
		});
		
		//4-  add components to the panel
		
		pnl.add(lbl);
		pnl.add(nameTxt);
		pnl.add(btn);
		//5- add panel to the frame 
		frame.add(pnl);
		
		
		// Best to be the last statement
		frame.setVisible(true);
	}

}
