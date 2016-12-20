package gui.components;

import helperMethods.TableHelper;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 * CentralResultTable class contains the JTable and the methods to operate on it.
 * @author Erik Weinstock
 * @version 1.0
 */
public class CentralResultTable extends JPanel{
	
	private JTable table;
	
	/**
	 * Executes the init-command
	 */
	public CentralResultTable() {
		init();
	}
	
	/**
	 * Initializes the layout and the JTable
	 */
	private void init() {
		setLayout(new BoxLayout(this, 1));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		table = new JTable(TableHelper.initTable(), TableHelper.initColumnNames());
		add(table);
	}
	

}
