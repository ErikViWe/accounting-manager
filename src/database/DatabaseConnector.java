package database;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import settings.SettingsValues;

/**
 * Contains methods to connect to the database and to execute queries.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class DatabaseConnector {
	
	private SettingsValues settings;
	private Connection connection;
	private String driver;
	
	/**
	 * Generates a new Databaseconnector
	 */
	public DatabaseConnector(SettingsValues settings) {
		this.settings = settings;
	}
	
	/**
	 * Initializes a new connection to the given database
	 */
	public void connect() {
        if (this.connection == null) {
            try {
            	String database = "jdbc:mysql://" + settings.getIP() + ":" + settings.getPort() + "/" + settings.getDatabaseName();
            	String user = settings.getUser();
            	String password = settings.getPassword();
                Class.forName(this.driver);
                this.connection = (Connection) DriverManager.getConnection(database, user, password);
                System.out.println("Connected!");
            }
            catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }
	
	/**
	 * Closes the current connection to the database
	 */
	public void disconnect() {
        if (this.connection != null) {
            try {
                this.connection.close();
                this.connection = null;
                System.out.println("Disconnected!");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
	

}
