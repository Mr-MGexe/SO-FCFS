package Vista;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel {

	private JTable table;
	private DefaultTableModel tableModel;
 
	public TablePanel(JFrame window, String title) {
		setBorder(BorderFactory.createTitledBorder(title));
		setLayout(new BorderLayout());

		table = new JTable();
		JScrollPane scrollJTable = new JScrollPane(table);
		table.setFillsViewportHeight(true);

		DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
		cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		table.setDefaultRenderer(Object.class, cellRenderer);

		add(table.getTableHeader(), BorderLayout.PAGE_START);
		add(scrollJTable, BorderLayout.CENTER);

		table.setEnabled(false);
		setVisible(true);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
		table.setModel(tableModel);
	}
}
