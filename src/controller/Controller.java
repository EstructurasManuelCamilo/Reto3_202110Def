package controller;

import java.util.Iterator;
import java.util.Scanner;

import model.data_structures.ArregloDinamico;
import model.data_structures.ILista;
import model.data_structures.ListaEncadenada;
import model.logic.Modelo;
import model.logic.Video;
import model.logic.Video.ComparadorXLikes;
import model.utils.Ordenamientos;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	private Ordenamientos<Video> ordenamientos;

	private ComparadorXLikes comparar;

	private boolean cargados;
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
		ordenamientos = new Ordenamientos<Video>();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){

			case 1:
				if(!cargados)
				{
					view.printMessage("Inicio de lectura de los archivos.\n----------------"); 
					modelo.leerDatosTablaSimbolos();
					view.printMessage("El total de videos cargados es: " + modelo.darCantidadVideos());
					view.printMessage("El total de duplas es: " + modelo.darDuplas());
					view.printMessage("El tiempo de ejecución promedio del método put() es: "+ modelo.darTiempoEjecucionPromedio());
				}
				cargados = true;
				break;

			case 2:
				//REQ 1
				view.printMessage("El título es: ");
				view.printMessage("El número de views son: ");
				view.printMessage("El número de likes son: ");
				view.printMessage("El número de dislikes son: ");
				view.printMessage("No se puede reportar una respuesta ");

				break;
			case 3:
				view.printMessage("El tiempo promedio es:");
					
				break;
				
			case 4: 
				view.printMessage("--------- \n Hasta pronto !! \n---------"); 
				lector.close();
				fin = true;
				break;
				
			default: 
				view.printMessage("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}

	}	
}
