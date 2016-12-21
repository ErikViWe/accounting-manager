package gui.components;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import settings.Settings;

/**
 * Contains buttons for PDF-Export and exit.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class BottomButtons extends JPanel {
	
	private JButton btnPdfExport;
	private JButton btnSettings;
	private JButton btnExit;
	
	/**
	 * Executes all init commands
	 */
	public BottomButtons() {
		init();
		initActionListener();
	}
	
	/**
	 * Initializes all buttons
	 */
	private void init() {
		setAlignmentX(CENTER_ALIGNMENT);
		setBorder(new EmptyBorder(10, 10, 10, 10));
		
		//Buttons
		{
			btnPdfExport = new JButton("PDF Export");
			add(btnPdfExport);
			add(Box.createRigidArea(new Dimension(10,0)));
			btnSettings = new JButton("Settings");
			add(btnSettings);
			add(Box.createRigidArea(new Dimension(10,0)));
			btnExit = new JButton("Exit");
			add(btnExit);
		}
	}
	
	/**
	 * Initializes all action listeners
	 */
	private void initActionListener() {
		btnPdfExport.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//TODO implement PDF-Export
			}
		});
		
		btnSettings.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Settings settings = new Settings();
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
