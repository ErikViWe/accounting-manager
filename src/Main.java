import gui.GUI;
import helperMethods.SettingsFileExistHelper;


public class Main {
	
	/**
	 * Main class for starting the Program only.
	 * @param args
	 * @author Erik Weinstock
	 * @version 1.0
	 */
	public static void main(String[] args) {
		SettingsFileExistHelper.checkForExistence();
		GUI mainGUI = new GUI();
	}

}
