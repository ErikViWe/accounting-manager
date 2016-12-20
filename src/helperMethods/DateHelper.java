package helperMethods;

import javax.swing.JComboBox;

public class DateHelper {
	
	public static JComboBox<Integer> generateDay() {
		JComboBox<Integer> days = new JComboBox<Integer>();
		for (int i = 0; i <= 31; i++) {
			days.addItem(i);
		}
		return days;
	}
	
	public static JComboBox<Integer> generateMonth() {
		JComboBox<Integer> month = new JComboBox<Integer>();
		for (int i = 0; i <= 12; i++) {
			month.addItem(i);
		}
		return month;
	}
	
	public static JComboBox<Integer> generateYear() {
		JComboBox<Integer> year = new JComboBox<Integer>();
		year.addItem(0);
		for (int i = 2016; i <= 2025 ; i++) {
			year.addItem(i);
		}
		return year;
	}

}
