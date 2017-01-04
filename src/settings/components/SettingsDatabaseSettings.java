package settings.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Contains text-fields to save the database connection data.
 * @author Erik Weinstock
 * @version 1.0
 */
public class SettingsDatabaseSettings {
	
	private JFrame frame;
	private JLabel lblUser;
	private JLabel lblPassword;
	private JLabel lblIP;
	private JLabel lblPort;
	private JTextField tfUser;
	private JPasswordField tfPassword;
	private JTextField tfIP;
	private JTextField tfPort;
	private JButton btnCancel;
	private JButton btnSave;
	
	public SettingsDatabaseSettings() {
		init();
		initActionListener();
	}
	
	
	/**
	 * Initializes the labels and text-fields as well as the buttons
	 */
	private void init() {
		frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLayout(new BoxLayout(frame, BoxLayout.X_AXIS));
		frame.setTitle("Database settings");
		lblUser = new JLabel("Username:");
		frame.add(lblUser);
		tfUser = new JTextField();
		frame.add(tfUser);
		lblPassword = new JLabel("Password:");
		frame.add(lblPassword);
		tfPassword = new JPasswordField();
		frame.add(tfPassword);
		lblIP = new JLabel("IP:");
		frame.add(lblIP);
		tfIP = new JTextField();
		frame.add(tfIP);
		lblPort = new JLabel("Port:");
		frame.add(lblPort);
		tfPort = new JTextField();
		frame.add(tfPort);
		btnCancel = new JButton("Cancel");
		frame.add(btnCancel);
		btnSave = new JButton("Save");
		frame.add(btnSave);
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
				//TODO implement Save
			}
		});
	}
}
