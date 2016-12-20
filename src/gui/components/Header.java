package gui.components;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Header combines the headerInput and the headerButtons.
 * @author Erik Weinstock
 * @version 1.0
 */
public class Header extends JPanel {
	
	public HeaderInput headerInput;
	public HeaderButtons headerButtons;
	
	/**
	 * Executes the init-command
	 */
	public Header() {
		init();
	}
	
	/**
	 * Initializes and places the headerInput and the header Buttons
	 */
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
