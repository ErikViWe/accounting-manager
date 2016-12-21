package settings.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Contains the button line from the bottom of the settings interface.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class SettingsBottomButtons extends JPanel {
	
	private JButton btnSave;
	private JButton btnClose;
	
	/**
	 * Executes the init-commands
	 */
	public SettingsBottomButtons() {
		init();
		initActionListener();
	}
	
	/**
	 * Initializes the buttons
	 */
	private void init() {
		btnSave = new JButton("Save");
		add(btnSave);
		btnClose = new JButton("Close");
		add(btnClose);
	}
	
	private void initActionListener() {
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement save action
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement close action
			}
		});
	}

}
