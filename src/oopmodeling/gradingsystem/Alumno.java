package oopmodeling.gradingsystem;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private double nota;

    public Alumno(int id, String nombre, String apellido, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Nombre: " + nombre +
               " | Apellido: " + apellido +
               " | Nota: " + nota;
    }
}

