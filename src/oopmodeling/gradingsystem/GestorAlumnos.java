package oopmodeling.gradingsystem;

import java.util.ArrayList;

//Clase encargada de gestionar la lista de alumnos
public class GestorAlumnos {

	// Lista donde se almacenan los alumnos
	private ArrayList<Alumno> alumnos = new ArrayList<>();

	// Agrega un nuevo alumno a la lista
	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
		System.out.println("Alumno agregado correctamente.");
	}

	// Muestra todos los alumnos registrados
	public void listarAlumnos() {
		if (alumnos.isEmpty()) {
			System.out.println("No hay alumnos registrados.");
		} else {
			for (Alumno a : alumnos) {
				System.out.println(a);
			}
		}
	}

	// Busca un alumno por su ID
	public Alumno buscarPorId(int id) {
		for (Alumno a : alumnos) {
			if (a.getId() == id) {
				return a;
			}
		}
		return null; // Si no se encuentra el alumno
	}

	// Actualiza la nota de un alumno usando su ID
	public void actualizarNota(int id, double nuevaNota) {
		Alumno alumno = buscarPorId(id);
		if (alumno != null) {
			alumno.setNota(nuevaNota);
			System.out.println("Nota actualizada correctamente.");
		} else {
			System.out.println("Alumno no encontrado.");
		}
	}

	// Elimina un alumno de la lista usando su ID
	public void eliminarAlumno(int id) {
		Alumno alumno = buscarPorId(id);
		if (alumno != null) {
			alumnos.remove(alumno);
			System.out.println("Alumno eliminado correctamente.");
		} else {
			System.out.println("Alumno no encontrado.");
		}
	}
}
