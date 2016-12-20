package helperMethods;

/**
 * Contains methods to handle the CentralResulttable.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class TableHelper {
	
	/**
	 * Initializes an empty String[][] to display a new table
	 * at program start
	 * @return
	 * 		Empty String[][]
	 */
	public static Object[][] initTable() {
		return new String[][] {{"", "", "", "", "", ""}};
	}
	
	/**
	 * Initializes the column names line.
	 * @return
	 * 		String[] containing the column names
	 */
	public static String[] initColumnNames() {
		return new String[] {"Date", "Product", "Amount", "Price", "Credit", "Debit"};
	}

}
