package settings.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import settings.Settings;

/**
 * Contains the button line from the bottom of the settings interface.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class SettingsBottomButtons extends JPanel {
	
	private JFrame frame;
	private JButton btnDatabase;
	private JButton btnSave;
	private JButton btnClose;
	private Settings settings;
	private SettingsDatabaseSettings databaseSettingsWindow;
	
	/**
	 * Executes the init-commands
	 */
	public SettingsBottomButtons(Settings settings, JFrame frame) {
		this.frame = frame;
		this.settings = settings;
		init();
		initActionListener();
	}
	
	/**
	 * Initializes the buttons
	 */
	private void init() {
		btnDatabase = new JButton("Database-Settings");
		add(btnDatabase);
		btnSave = new JButton("Save");
		add(btnSave);
		btnClose = new JButton("Close");
		add(btnClose);
	}
	
	/**
	 * Initializes the ActionListeners for each button
	 */
	private void initActionListener() {
		btnDatabase.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				databaseSettingsWindow = new SettingsDatabaseSettings(settings);
			}
		});
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				settings.save();
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
	}

}
