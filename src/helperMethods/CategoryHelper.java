package helperMethods;

import javax.swing.JComboBox;

public class CategoryHelper {
	
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
