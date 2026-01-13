package oopmodeling.gradingsystem;

import java.util.Scanner;

//Clase principal que contiene el menú de la aplicación
public class App {

	public static void main(String[] args) {

		// Scanner para leer datos del usuario
		Scanner scanner = new Scanner(System.in);

		// Objeto gestor que maneja los alumnos
		GestorAlumnos gestor = new GestorAlumnos();

		int opcion;

		// Menú principal
		do {
			System.out.println("\n--- GESTIÓN DE NOTAS DE ALUMNOS ---");
			System.out.println("1. Agregar alumno");
			System.out.println("2. Listar alumnos");
			System.out.println("3. Actualizar nota");
			System.out.println("4. Eliminar alumno");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				// Agregar alumno
				System.out.print("ID: ");
				int id = scanner.nextInt();

				System.out.print("Nombre: ");
				String nombre = scanner.next();

				System.out.print("Apellido: ");
				String apellido = scanner.next();

				System.out.print("Nota: ");
				double nota = scanner.nextDouble();

				gestor.agregarAlumno(new Alumno(id, nombre, apellido, nota));
				break;

			case 2:
				// Listar alumnos
				gestor.listarAlumnos();
				break;

			case 3:
				// Actualizar nota
				System.out.print("ID del alumno: ");
				int idActualizar = scanner.nextInt();

				System.out.print("Nueva nota: ");
				double nuevaNota = scanner.nextDouble();

				gestor.actualizarNota(idActualizar, nuevaNota);
				break;

			case 4:
				// Eliminar alumno
				System.out.print("ID del alumno: ");
				int idEliminar = scanner.nextInt();

				gestor.eliminarAlumno(idEliminar);
				break;

			case 0:
				// Salir del programa
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);

		// Cerrar el scanner
		scanner.close();
	}
}
