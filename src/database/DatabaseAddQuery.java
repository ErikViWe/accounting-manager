package database;

/**
 * Contains all values needed for a valid addQuery to add a transaction to the database.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class DatabaseAddQuery {
	
	private String date;
	private String category;
	private String product;
	private int amount;
	private double debit;
	private double credit;
	
	/**
	 * Just generates the object
	 */
	public DatabaseAddQuery() {
		//values will be set by setter-methods
	}
	
	/**
	 * Sets the date
	 * @param date
	 * 		given date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/**
	 * Sets the product
	 * @param product
	 * 		given product
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	
	/**
	 * Sets the category
	 * @param category
	 * 		given category
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	
	/**
	 * Sets the amount
	 * @param amount
	 * 		given amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	/**
	 * Sets the debit
	 * @param debit
	 * 		given debit
	 */
	public void setDebit(double debit) {
		this.debit = debit;
	}
	
	/**
	 * Sets the credit
	 * @param credit
	 * 		given credit
	 */
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	/**
	 * Generates a String containing all values
	 * this String is a valid parameter for the SQL-Update command
	 * @return
	 * 		valid parameter containing all values
	 */
	public String getValues() {
		return "(0,STR_TO_DATE('" + date + "', '%d-%m-%Y'),'" + category + "','" + product + "'," + amount + "," + debit + "," + credit + ")";
	}
	
}
