package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionPanel extends JPanel {

	private JButton btnInit;
	private JButton btnPoll;
	private JButton btnAdd;
	private JButton btnLock;
	private JButton btnUnLock;
	private JButton btnRestart;
	private JButton btnExit;

	public ActionPanel(JFrame window) {

		btnInit = new JButton("Iniciar");
		add(btnInit);

		btnPoll = new JButton("Atender");
		add(btnPoll);

		btnAdd = new JButton("Agregar");
		add(btnAdd);

		btnLock = new JButton("Bloquear");
		add(btnLock);

		btnUnLock = new JButton("Desbloquear");
		add(btnUnLock);

		btnRestart = new JButton("Reiniciar");
		add(btnRestart);

		btnExit = new JButton("Salir");
		add(btnExit);

		setVisible(true);
	}

	public JButton getBtnInit() {
		return btnInit;
	}

	public void setBtnInit(JButton btnInit) {
		this.btnInit = btnInit;
	}

	public JButton getBtnPoll() {
		return btnPoll;
	}

	public void setBtnPoll(JButton btnPoll) {
		this.btnPoll = btnPoll;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnLock() {
		return btnLock;
	}

	public void setBtnLock(JButton btnLock) {
		this.btnLock = btnLock;
	}

	public JButton getBtnUnLock() {
		return btnUnLock;
	}

	public void setBtnUnLock(JButton btnUnLock) {
		this.btnUnLock = btnUnLock;
	}
	
	public JButton getBtnRestart() {
		return btnRestart;
	}

	public void setBtnRestart(JButton btnRestart) {
		this.btnRestart = btnRestart;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}
}
