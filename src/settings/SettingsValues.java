package settings;

/**
 * This class represents a settingsfile and contains all settings needed for this program.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class SettingsValues {
	
	private String user;
	private String password;
	private String ip;
	private String port;
	
	/**
	 * Generates the SettingsValuse object
	 */
	public SettingsValues() {
		//Nothing to do
	}
	
	/**
	 * Sets the username
	 * @param user
	 * 		user set username
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * Sets the password
	 * @param password
	 * 		user set password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Sets the ip
	 * @param ip
	 * 		user set ip
	 */
	public void setIP(String ip) {
		this.ip = ip;
	}
	
	/**
	 * Sets the port
	 * @param port
	 * 		user set port
	 */
	public void setPort(String port) {
		this.port = port;
	}
	
	/**
	 * Returns the user set username
	 * @return
	 * 		username
	 */
	public String getUser() {
		return this.user;
	}
	
	/**
	 * Returns the user set password
	 * @return
	 * 		password
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * Returns the user set ip
	 * @return
	 * 		ip
	 */
	public String getIP() {
		return this.ip;
	}
	
	/**
	 * Returns user set port
	 * @return
	 * 		port
	 */
	public String getPort() {
		return this.port;
	}

}
