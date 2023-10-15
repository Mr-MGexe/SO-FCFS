package Controlador;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Modelo.Model;
import Vista.Window;

public class Main {

	private final static String[] COLUMN_NAME = { "Proceso", "T. Llegada", "T. Rafaga", "T. Comienzo", "T. Final",
			"T. Retorno", "T. Espera" };

	public static void main(String[] args) {

		// Unifica la interfaz para Mac y para Windows.
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		Controller controller = new Controller(new Model(), new Window("Algoritmo FCFS"));
		controller.initController(COLUMN_NAME);
	}

}
