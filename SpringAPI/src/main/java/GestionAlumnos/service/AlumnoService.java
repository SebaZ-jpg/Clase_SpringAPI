package GestionAlumnos.service;


import GestionAlumnos.entify.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> obtenerTodos();

    Alumno obtenerPorId(Long id);

    Alumno guardar(Alumno alumno);

    Alumno actualizar(Long id, Alumno alumno);

    void eliminar(Long id);
}
