package settings;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;

import helperMethods.SettingsHelper;
import settings.components.SettingsBottomButtons;

/**
 * Contains components for the Settings Window and methods to load and store settings.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class Settings {
	
	private JFrame settingsFrame;
	private SettingsBottomButtons settingsBottomButtons;
	private SettingsValues settingsValues;
	
	/**
	 * Executes the init commands
	 */
	public Settings() {
		settingsValues = new SettingsValues();
		init();
		initValues();
	}
	
	/**
	 * Initializes the frame and its components
	 */
	private void init() {
		settingsFrame = new JFrame();
		settingsFrame.setSize(700, 600);
		settingsFrame.setTitle("Settings");
		settingsFrame.setLayout(new BorderLayout());
		settingsFrame.setVisible(true);
		
		settingsBottomButtons = new SettingsBottomButtons(this, settingsFrame);
		settingsFrame.add(settingsBottomButtons, BorderLayout.SOUTH);
	}
	
	/**
	 * Loads settings into the settings array
	 */
	private void initValues() {
		String path = SettingsHelper.getSettingsFilePath();
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			settingsValues.setUser(bufferedReader.readLine());
			settingsValues.setPassword(bufferedReader.readLine());
			settingsValues.setDatabaseName(bufferedReader.readLine());
			settingsValues.setIP(bufferedReader.readLine());
			settingsValues.setPort(bufferedReader.readLine());
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the current settings
	 * @return
	 * 		current settings
	 */
	public SettingsValues getValues() {
		return this.settingsValues;
	}
	
	/**
	 * Update the settings
	 * @param settingsValues
	 * 		new settings values
	 */
	public void update(SettingsValues settingsValues) {
		this.settingsValues = settingsValues;
	}
	
	/**
	 * Writes the settings on the settings.txt file
	 */
	public void save() {
		String path = SettingsHelper.getSettingsFilePath();
		try {
			FileWriter fileWriter = new FileWriter(path);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(settingsValues.getUser() + "\n");
			bufferedWriter.write(settingsValues.getPassword() + "\n");
			bufferedWriter.write(settingsValues.getDatabaseName() + "\n");
			bufferedWriter.write(settingsValues.getIP() + "\n");
			bufferedWriter.write(settingsValues.getPort() + "\n");
			bufferedWriter.close();
			fileWriter.close();
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
