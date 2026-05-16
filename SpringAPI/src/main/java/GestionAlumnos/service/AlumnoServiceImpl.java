package GestionAlumnos.service;

import GestionAlumnos.entify.Alumno;
import GestionAlumnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> obtenerTodos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno obtenerPorId(Long id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado con id: " + id));
    }

    @Override
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno actualizar(Long id, Alumno alumnoActualizado) {
        Alumno alumnoExistente = obtenerPorId(id);

        alumnoExistente.setNombre(alumnoActualizado.getNombre());
        alumnoExistente.setApellido(alumnoActualizado.getApellido());
        alumnoExistente.setEmail(alumnoActualizado.getEmail());
        alumnoExistente.setEdad(alumnoActualizado.getEdad());

        return alumnoRepository.save(alumnoExistente);
    }

    @Override
    public void eliminar(Long id) {
        Alumno alumno = obtenerPorId(id);
        alumnoRepository.delete(alumno);
    }
}
