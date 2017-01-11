package settings;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;

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
	private String[] settingsValues;
	
	/**
	 * Executes the init commands
	 */
	public Settings() {
		settingsValues = new String[5];
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
			settingsValues[0] = bufferedReader.readLine();
			settingsValues[1] = bufferedReader.readLine();
			settingsValues[2] = bufferedReader.readLine();
			settingsValues[3] = bufferedReader.readLine();
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the current settings
	 * @return
	 * 		array with current settings
	 */
	public String[] getValues() {
		return this.settingsValues;
	}
	
	/**
	 * Update the settings
	 * @param settingsValues
	 * 		new settings values
	 */
	public void update(String[] settingsValues) {
		this.settingsValues = settingsValues;
	}
	
	/**
	 * Writes the settings on the settings.txt file
	 */
	public void save() {
		//TODO implement save to file
	}

}
