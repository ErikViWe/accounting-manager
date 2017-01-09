package helperMethods;

import javax.swing.JComboBox;

/**
 * Contains methods to generate and handle the categories.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class CategoryHelper {
	
	/**
	 * Generate a JComboBox with initial values
	 * @return
	 * 			new JComboBox filled with values
	 */
	public static JComboBox<String> generateCategory() {
		JComboBox<String> category = new JComboBox<String>();
		category.addItem("Category");
		category.addItem("Taxes");
		category.addItem("Donation");
		category.addItem("Leisure");
		category.addItem("Food");
		category.addItem("Education");
		category.addItem("Finance");
		category.addItem("Health");
		category.addItem("Salary");
		category.addItem("Law");
		category.addItem("Games");
		category.addItem("Telecommunication");
		category.addItem("Apartement");
		category.addItem("Network");
		category.addItem("Insurance");
		category.addItem("Clothes");
		category.addItem("Look");
		category.addItem("Hygiene");
		category.addItem("Electronics");
		category.addItem("Transportation");
		category.addItem("Waste");
		category.addItem("Find");
		return category;
	}

}
