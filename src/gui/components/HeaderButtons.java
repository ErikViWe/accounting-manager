package gui.components;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HeaderButtons extends JPanel {

	JButton btnAdd;
	JButton btnDisplay;
	JButton btnClear;
	
	public HeaderButtons() {
		init();
	}
	
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
}
