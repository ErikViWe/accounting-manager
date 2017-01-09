package helperMethods;

import javax.swing.JComboBox;

/**
 * Contains methods to deal with the dates.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class DateHelper {
	
	/**
	 * Generates a new day-JComboBox
	 * @return
	 * 		JComboBox containing all days
	 */
	public static JComboBox<Integer> generateDay() {
		JComboBox<Integer> days = new JComboBox<Integer>();
		for (int i = 0; i <= 31; i++) {
			days.addItem(i);
		}
		return days;
	}
	
	/**
	 * Generates a new month-JComboBox
	 * @return
	 * 		JComboBox containing all months
	 */
	public static JComboBox<Integer> generateMonth() {
		JComboBox<Integer> month = new JComboBox<Integer>();
		for (int i = 0; i <= 12; i++) {
			month.addItem(i);
		}
		return month;
	}
	
	/**
	 * Generates a new year-JComboBox
	 * @return
	 * 		JComboBox containing all years to choose from
	 */
	public static JComboBox<Integer> generateYear() {
		JComboBox<Integer> year = new JComboBox<Integer>();
		year.addItem(0);
		for (int i = 2016; i <= 2025 ; i++) {
			year.addItem(i);
		}
		return year;
	}

}
