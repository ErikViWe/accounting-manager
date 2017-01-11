package settings;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;

import helperMethods.SettingsHelper;
import settings.components.SettingsBottomButtons;

public class Settings {
	
	private JFrame settingsFrame;
	private SettingsBottomButtons settingsBottomButtons;
	private String[] settingsValues;
	
	public Settings() {
		settingsValues = new String[5];
		init();
		initValues();
	}
	
	private void init() {
		settingsFrame = new JFrame();
		settingsFrame.setSize(700, 600);
		settingsFrame.setTitle("Settings");
		settingsFrame.setLayout(new BorderLayout());
		settingsFrame.setVisible(true);
		
		settingsBottomButtons = new SettingsBottomButtons(this, settingsFrame);
		settingsFrame.add(settingsBottomButtons, BorderLayout.SOUTH);
	}
	
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
	
	public String[] getValues() {
		return this.settingsValues;
	}
	
	public void update(String[] settingsValues) {
		this.settingsValues = settingsValues;
	}
	
	public void save() {
		//TODO implement save to file
	}

}
