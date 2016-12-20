package gui.components;

import java.awt.Dimension;

import helperMethods.CategoryHelper;
import helperMethods.DateHelper;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Contains the input parts for the user interaction.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class HeaderInput extends JPanel {
	
	//private JPanel headerInputPanel;
	private JComboBox<Integer> day;
	private JComboBox month;
	private JComboBox year;
	private JComboBox category;
	private JTextField product;
	private JTextField amount;
	private JTextField price;
	private JRadioButton debit;
	private JRadioButton credit;
	private ButtonGroup rbGroup;
	
	/**
	 * Executes the init-command
	 */
	public HeaderInput() {
		init();
	}
	
	/**
	 * Initializes the menus and text fields for the user input
	 */
	private void init() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		//dropdown menus
		{
			day = DateHelper.generateDay();
			month = DateHelper.generateMonth();
			year = DateHelper.generateYear();
			category = CategoryHelper.generateCategory();
			
			add(day);
			add(Box.createRigidArea(new Dimension(5,0)));
			add(month);
			add(Box.createRigidArea(new Dimension(5,0)));
			add(year);
			add(Box.createRigidArea(new Dimension(10,0)));
			add(category);
			add(Box.createRigidArea(new Dimension(10,0)));
		}
		
		//textfields
		{
			product = new JTextField();
			product.setText("Product");
			amount = new JTextField();
			amount.setText("Amount");
			price = new JTextField();
			price.setText("Price");
			add(product);
			add(Box.createRigidArea(new Dimension(10,0)));
			add(amount);
			add(Box.createRigidArea(new Dimension(10,0)));
			add(price);
			add(Box.createRigidArea(new Dimension(10,0)));
		}
		
		//radio buttons
		{
			debit = new JRadioButton();
			debit.setText("Debit");
			add(Box.createRigidArea(new Dimension(10,0)));
			credit = new JRadioButton();
			credit.setText("Credit");
			add(Box.createRigidArea(new Dimension(10,0)));
			rbGroup = new ButtonGroup();
			rbGroup.add(debit);
			rbGroup.add(credit);
			debit.setSelected(true);
			add(debit);
			add(credit);

		}
		
	}
	
	
}
