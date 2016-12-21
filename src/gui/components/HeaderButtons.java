package gui.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Contains the header buttons for interaction with the user.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class HeaderButtons extends JPanel {

	JButton btnAdd;
	JButton btnDisplay;
	JButton btnClear;
	
	/**
	 * Executes the init-command
	 */
	public HeaderButtons() {
		init();
	}
	
	/**
	 * Initializes the layout and buttons
	 */
	private void init() {
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		//Buttons
		{
			btnAdd = new JButton("Add");
			btnDisplay = new JButton("Display");
			btnClear = new JButton("Clear");
			
			add(btnAdd);
			add(Box.createRigidArea(new Dimension(10,0)));
			add(btnDisplay);
			add(Box.createRigidArea(new Dimension(10,0)));
			add(btnClear);
		}
	}
	
	private void initActionListener() {
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement add command
			}
		});
		
		btnDisplay.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement display
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement clear
			}
		});
	}
}
