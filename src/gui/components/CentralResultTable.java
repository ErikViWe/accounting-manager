package gui.components;

import helperMethods.TableHelper;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTable;

public class CentralResultTable extends JPanel{
	
	private JTable table;
	
	public CentralResultTable() {
		init();
	}
	
	private void init() {
		setLayout(new BoxLayout(this, 1));
		setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
		table = new JTable(TableHelper.initTable(), TableHelper.initColumnNames());
		add(table);
	}
	

}
