package gui;

import gui.components.BottomButtons;
import gui.components.CentralResultTable;
import gui.components.Header;
import gui.components.HeaderButtons;
import gui.components.HeaderInput;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JFrame;


/**
 * Gui class combines and displays all gui-components.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class GUI {
	public JFrame mainFrame;
	public Header header;
	public CentralResultTable table;
	public BottomButtons bottom;
	
	/**
	 * Executes the init-command.
	 */
	public GUI() {
		init();
	}
	
	/**
	 * Initializes the mainFrame and places the components on it.
	 */
	public void init() {
		mainFrame = new JFrame();
		mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mainFrame.setUndecorated(true);
		mainFrame.setVisible(true);
		mainFrame.setTitle("Accounting Manager");
		mainFrame.setLayout(new BorderLayout());
		
		header= new Header();
		mainFrame.add(header, BorderLayout.NORTH);
		table = new CentralResultTable();
		mainFrame.add(table, BorderLayout.CENTER);
		bottom = new BottomButtons();
		mainFrame.add(bottom, BorderLayout.SOUTH);
		mainFrame.setVisible(true);
		
	}
}
