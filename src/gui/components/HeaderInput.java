package gui.components;

import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	private JComboBox<Integer> month;
	private JComboBox<Integer> year;
	private JComboBox<String> category;
	private JTextField product;
	private JTextField amount;
	private JTextField price;
	private JRadioButton debit;
	private JRadioButton credit;
	private ButtonGroup rbGroup;
	
	/**
	 * Executes the init-commands
	 */
	public HeaderInput() {
		init();
		initMouseListener();
		initDate();
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
	
	/**
	 * Initializes the MouseListeners to remove text-field text on click
	 */
	private void initMouseListener() {
		product.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                product.setText("");
            }
        });
		
		amount.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                amount.setText("");
            }
        });
		
		price.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                price.setText("");
            }
        });
	}
	
	/**
	 * Gets the current date and displays it in the JComboBoxes
	 */
	private void initDate() {
		LocalDate localDate = LocalDate.now();
        String[] date = String.valueOf(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate)).split("/");
        year.setSelectedItem(Integer.parseInt(date[0]));
        month.setSelectedItem(Integer.parseInt(date[1]));
        day.setSelectedItem(Integer.parseInt(date[2]));
	}
	
	
}
