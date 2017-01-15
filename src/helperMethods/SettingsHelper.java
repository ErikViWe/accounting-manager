package helperMethods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Contains methods to check for existence of settings-file.
 * @author Erik Weinstock
 * @version 1.0
 *
 */
public class SettingsHelper {

	/**
	 * Checks if settings-file exists. If not, it will create a new settings-file
	 */
	public static void checkForExistence() {
		String path = getSettingsFilePath();
		//check if file exists and create new file if settings are missed
		if (!new File(path).exists()) {
			createSettingsFile(path);
		}
	}
	
	/**
	 * Creates a new txt-file at the given path
	 * The settings fill will contain initial values
	 * @param path
	 * 		path where to place the new settings-file
	 */
	public static void createSettingsFile(String path) {
		File f = new File(path);
		f.getParentFile().mkdirs();
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		resetSettingsFile();
	}
	
	/**
	 * Fills the settings-file with initial values
	 */
	public static void resetSettingsFile() {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(getSettingsFilePath());
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("username\n");
			bufferedWriter.write("password\n");
			bufferedWriter.write("Database name\n");
			bufferedWriter.write("000.000.000.000\n");
			bufferedWriter.write("3306");
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets the current path of the settings-file
	 * @return
	 * 		path to settings-file
	 */
	public static String getSettingsFilePath() {
		//get path to .jar-file
		File f = new File(System.getProperty("java.class.path"));
		File dir = f.getAbsoluteFile().getParentFile();
		return dir.toString() + "/settings.txt";
	}
}
