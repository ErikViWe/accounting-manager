package settings;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import settings.components.SettingsBottomButtons;

public class Settings {
	
	private JFrame settingsFrame;
	private SettingsBottomButtons settingsBottomButtons;
	private String[] settingsValues;
	
	public Settings() {
		settingsValues = new String[5];
		init();
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
	
	public String[] getValues() {
		return this.settingsValues;
	}

}
