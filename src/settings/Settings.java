package settings;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import settings.components.SettingsBottomButtons;

public class Settings {
	
	private JFrame settingsFrame;
	private SettingsBottomButtons settingsBottomButtons;
	
	public Settings() {
		init();
	}
	
	private void init() {
		settingsFrame = new JFrame();
		settingsFrame.setSize(700, 600);
		settingsFrame.setTitle("Settings");
		settingsFrame.setLayout(new BorderLayout());
		settingsFrame.setVisible(true);
		
		settingsBottomButtons = new SettingsBottomButtons();
		settingsFrame.add(settingsBottomButtons, BorderLayout.SOUTH);
	}

}
