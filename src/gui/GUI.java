package gui;

import gui.components.CentralResultTable;
import gui.components.Header;
import gui.components.HeaderButtons;
import gui.components.HeaderInput;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JFrame;


/**
 * 
 * @author Erik Weinstock
 *
 */
public class GUI {
	public JFrame mainFrame;
	public Header header;
	public CentralResultTable table;
	
	public GUI() {
		
	}
	
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
		mainFrame.setVisible(true);
		
	}
}
