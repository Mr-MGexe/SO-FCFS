package Vista;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GanttPanel extends TablePanel {

	public GanttPanel(JFrame window, String title) {
		super(window, title);
		getTable().setShowGrid(false);
		getTable().setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		setTableModel(new DefaultTableModel(new Object[]{"PID"}, 0));
		TableCellRedendererColor cellRenderer = new TableCellRedendererColor();
		cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		getTable().setDefaultRenderer(Object.class , cellRenderer);
	}

	public void paintProcess(Object[] process) {
		int row = getTableModel().getRowCount();
		getTableModel().addRow(new Object[]{process[0]});
		paintBurstTime(row, (int) process[3], (int) process[4]);
		paintWaitTime(row, (int) process[1], (int) process[3]);
	}
	
	private void paintWaitTime(int row, int arrivalTime, int startTime) {
		for (int i = arrivalTime; i < startTime; i++)
			getTableModel().setValueAt("  ", row, i + 1);
	}
   
       private void paintBurstTime(int row, int startTime, int finalTime) {
    int delay = 1000; // 1000 milisegundos (1 segundo) de espera entre iteraciones
    Timer timer = new Timer(delay, new ActionListener() {
        int current = startTime;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (current < finalTime) {
                getTableModel().addColumn(String.valueOf(current));
                getTableModel().setValueAt(" ", row, current + 1);
                current++;
            } else {
                ((Timer) e.getSource()).stop(); // Detener el temporizador cuando haya terminado
            }
        }
    });

    // Iniciar el temporizador
    timer.start();
}
/*private void paintBurstTime(int row, int startTime, int finalTime){
		for (int i = startTime; i < finalTime; i++) {
                        
			getTableModel().addColumn(String.valueOf(i));
			getTableModel().setValueAt(" ", row, i + 1);
		}
	}*/		
}
