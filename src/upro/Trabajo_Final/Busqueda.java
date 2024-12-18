package upro.Trabajo_Final;

import javax.swing.JOptionPane;

public class Busqueda {
public static void main(String[] args) {
		
		
	MainTrabajoFinal llamada = new MainTrabajoFinal();
	MainTrabajoFinal llamada2 = new MainTrabajoFinal();
	MainTrabajoFinal llamada3 = new MainTrabajoFinal();
	MainTrabajoFinal llamada4 = new MainTrabajoFinal();
	MainTrabajoFinal llamada5_6 = new MainTrabajoFinal();
	MainTrabajoFinal llamada7 = new MainTrabajoFinal();
	byte opcion = 0;
			do {
				opcion =Byte.parseByte(JOptionPane.showInputDialog( 
						"Menu Principal\n"
						+"1 - Navegar entre carpetas\n"
						+"2 - Validar el archivo csv\n"
						+"3 - Actualizar el csv\n"
						+"4 - Buscar Registros\n"
						+"5 - Generar archivos - Mayor promedio\n"
						+"6 - Generar archivos - Menor Promedio\n"
						+"7 - Mostrar el nombre de archivo, la fecha, y la hora\n"));
				
				switch (opcion) {
				case 1:
					llamada.metodo1();
					break;
				case 2:
					llamada2.metodo2();
					break;
				case 3:
					llamada3.metodo3();
					break;
				case 4:
					llamada4.metodo4();
					break;
				case 5:
					llamada5_6.metodo5();
					break;
				case 6:
					llamada5_6.metodo6();
					break;
				case 7:
					llamada7.metodo7();
					break;

				default:
					break;
				}
			} while (opcion != 7);

	}

}


