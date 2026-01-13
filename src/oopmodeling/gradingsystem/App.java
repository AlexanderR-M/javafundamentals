package oopmodeling.gradingsystem;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAlumnos gestor = new GestorAlumnos();
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE NOTAS ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Actualizar nota");
            System.out.println("4. Eliminar alumno");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
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
                    gestor.listarAlumnos();
                    break;

                case 3:
                    System.out.print("ID del alumno: ");
                    int idActualizar = scanner.nextInt();
                    System.out.print("Nueva nota: ");
                    double nuevaNota = scanner.nextDouble();
                    gestor.actualizarNota(idActualizar, nuevaNota);
                    break;

                case 4:
                    System.out.print("ID del alumno: ");
                    int idEliminar = scanner.nextInt();
                    gestor.eliminarAlumno(idEliminar);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}

