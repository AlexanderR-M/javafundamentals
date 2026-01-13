package oopmodeling.gradingsystem;

//Clase que representa a un alumno
public class Alumno {

	// Atributos del alumno
	private int id;
	private String nombre;
	private String apellido;
	private double nota;

	// Constructor para crear un alumno
	public Alumno(int id, String nombre, String apellido, double nota) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
	}

	// Devuelve el ID del alumno
	public int getId() {
		return id;
	}

	// Devuelve la nota del alumno
	public double getNota() {
		return nota;
	}

	// Permite modificar la nota del alumno
	public void setNota(double nota) {
		this.nota = nota;
	}

	// Devuelve los datos del alumno en formato texto
	@Override
	public String toString() {
		return "ID: " + id + " | Nombre: " + nombre + " | Apellido: " + apellido + " | Nota: " + nota;
	}
}
