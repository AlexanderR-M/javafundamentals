package oopmodeling.gradingsystem;

import java.util.ArrayList;

public class GestorAlumnos {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void listarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (Alumno a : alumnos) {
                System.out.println(a);
            }
        }
    }

    public Alumno buscarPorId(int id) {
        for (Alumno a : alumnos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void actualizarNota(int id, double nuevaNota) {
        Alumno alumno = buscarPorId(id);
        if (alumno != null) {
            alumno.setNota(nuevaNota);
            System.out.println("Nota actualizada.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    public void eliminarAlumno(int id) {
        Alumno alumno = buscarPorId(id);
        if (alumno != null) {
            alumnos.remove(alumno);
            System.out.println("Alumno eliminado.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}

