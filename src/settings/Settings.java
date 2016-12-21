package settings;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Settings {
	
	private JFrame settingsFrame;
	
	public Settings() {
		init();
	}
	
	private void init() {
		settingsFrame = new JFrame();
		settingsFrame.setSize(700, 600);
		settingsFrame.setTitle("Settings");
		settingsFrame.setLayout(new BorderLayout());
		settingsFrame.setVisible(true);
	}

}
