package gui.components;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Contains buttons for PDF-Export and exit.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class BottomButtons extends JPanel {
	
	private JButton btnPdfExport;
	private JButton btnExit;
	
	public BottomButtons() {
		init();
	}
	
	private void init() {
		setAlignmentX(CENTER_ALIGNMENT);
		setBorder(new EmptyBorder(10, 10, 10, 10));
		
		//Buttons
		{
			btnPdfExport = new JButton("PDF Export");
			add(btnPdfExport);
			add(Box.createRigidArea(new Dimension(10,0)));
			btnExit = new JButton("Exit");
			add(btnExit);
		}
	}
}
