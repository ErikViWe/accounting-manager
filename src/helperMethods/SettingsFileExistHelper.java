package helperMethods;

import java.io.File;
import java.io.IOException;

/**
 * Contains methods to check for existence of settings-file.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class SettingsFileExistHelper {

	/**
	 * Checks if settings-file exists. If not, it will create a new settings-file
	 */
	public static void checkForExistence() {
		//get path to .jar-file
		File f = new File(System.getProperty("java.class.path"));
		File dir = f.getAbsoluteFile().getParentFile();
		String path = dir.toString();
		//check if file exists and create new file if settings are missed
		if (!new File(path + "settings.txt").exists()) {
			createSettingsFile(path);
		}
	}
	
	/**
	 * Creates a new txt-file at the given path.
	 * The settings fill will contain initial values.
	 * @param path
	 * 		path where to place the new settings-file
	 */
	public static void createSettingsFile(String path) {
		File f = new File(path + "/settings.txt");
		f.getParentFile().mkdirs();
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//TODO fill new file with initial values
	}
}
