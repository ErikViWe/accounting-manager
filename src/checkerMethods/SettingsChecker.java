package checkerMethods;

/**
 * Contains methods to check if the given settings-value is valid.
 * @author Erik Weinstock
 * @version 1.0
 */
public class SettingsChecker {

	/**
	 * Checks if the given name is allowed for use as username or password
	 * @param name
	 * 			name to check
	 * @return
	 * 			true, if name is a valid username or password
	 */
	public static boolean checkString(String name) {
		if (name.length() > 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the given String is an ip
	 * @param ip
	 * 		given ip to check
	 * @return
	 * 		true, if ip is a valid ip
	 */
	public static boolean checkIP(String ip) {
		try {
	        if ( ip == null || ip.isEmpty() ) {
	            return false;
	        }

	        String[] parts = ip.split( "\\." );
	        if ( parts.length != 4 ) {
	            return false;
	        }

	        for ( String s : parts ) {
	            int i = Integer.parseInt( s );
	            if ( (i < 0) || (i > 255) ) {
	                return false;
	            }
	        }
	        if ( ip.endsWith(".") ) {
	            return false;
	        }

	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}
	
	/**
	 * Checks if the given port is a valid port
	 * @param port
	 * 			port to check
	 * @return
	 * 			true, if the given port is a valid port
	 */
	public static boolean checkPort(String port) {
		try {
			int number = Integer.parseInt(port);
			if (number < 65536) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
        return false;
    }

}
