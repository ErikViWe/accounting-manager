package settings.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import checkerMethods.SettingsChecker;
import helperMethods.SettingsHelper;
import settings.Settings;
import settings.SettingsValues;

/**
 * Contains text-fields to save the database connection data.
 * @author Erik Weinstock
 * @version 1.0
 */
public class SettingsDatabaseSettings {
	
	private JFrame frame;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JLabel lblDBName;
	private JLabel lblIP;
	private JLabel lblPort;
	private JTextField tfUser;
	private JTextField tfPassword;
	private JTextField tfDBName;
	private JTextField tfIP;
	private JTextField tfPort;
	private JButton btnCancel;
	private JButton btnSave;
	private SettingsValues settingsValues;
	
	public SettingsDatabaseSettings(Settings settings) {
		this.settingsValues = settings.getValues();
		init();
		initActionListener();
		displayValues();
	}
	
	
	/**
	 * Initializes the labels and text-fields as well as the buttons
	 */
	private void init() {
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		frame.setTitle("Database settings");
		
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		lblUser = new JLabel("Username:");
		frame.add(lblUser);
		tfUser = new JTextField();
		frame.add(tfUser);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		lblPassword = new JLabel("Password:");
		frame.add(lblPassword);
		tfPassword = new JTextField();
		frame.add(tfPassword);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		lblDBName = new JLabel("Database name");
		frame.add(lblDBName);
		tfDBName = new JTextField();
		frame.add(tfDBName);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		lblIP = new JLabel("IP:");
		frame.add(lblIP);
		tfIP = new JTextField();
		frame.add(tfIP);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		lblPort = new JLabel("Port:");
		frame.add(lblPort);
		tfPort = new JTextField();
		frame.add(tfPort);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		btnCancel = new JButton("Cancel");
		frame.add(btnCancel);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		btnSave = new JButton("Save and close");
		frame.add(btnSave);
		frame.add(Box.createRigidArea(new Dimension(10, 10)));
		
		frame.setVisible(true);
	}
	
	/**
	 * Initializes the ActionListener for each button
	 */
	private void initActionListener() {
		btnCancel.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		btnSave.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (SettingsChecker.checkString(tfUser.getText()) 
						&& SettingsChecker.checkString(tfPassword.getText()) 
							&& SettingsChecker.checkIP(tfIP.getText()) 
								&& SettingsChecker.checkPort(tfPort.getText())
									&& SettingsChecker.checkString(tfDBName.getText())) {
					settingsValues.setUser(tfUser.getText());
					settingsValues.setPassword(tfPassword.getText());
					settingsValues.setDatabaseName(tfDBName.getText());
					settingsValues.setIP(tfIP.getText());
					settingsValues.setPort(tfPort.getText());
					frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				} else {
					JOptionPane.showMessageDialog(frame,
							"Error, invalid input.",
							"Input error",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
	/**
	 * Displays all database-settings on the text-fields
	 */
	private void displayValues() {
		tfUser.setText(settingsValues.getUser());
		tfPassword.setText(settingsValues.getPassword());
		tfDBName.setText(settingsValues.getDatabaseName());
		tfIP.setText(settingsValues.getIP());
		tfPort.setText(settingsValues.getPort());
	} 
	
}
