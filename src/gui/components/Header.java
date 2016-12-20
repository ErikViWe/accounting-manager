package gui.components;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Header extends JPanel {
	
	public HeaderInput headerInput;
	public HeaderButtons headerButtons;
	
	public Header() {
		init();
	}
	
	private void init() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		
		headerInput = new HeaderInput();
		headerButtons = new HeaderButtons();
		add(headerInput);
		add(Box.createVerticalStrut(10));
		add(headerButtons);
	}
}
