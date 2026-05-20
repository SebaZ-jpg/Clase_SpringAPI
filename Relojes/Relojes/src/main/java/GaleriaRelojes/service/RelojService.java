package GaleriaRelojes.service;

import GaleriaRelojes.model.Reloj;
import GaleriaRelojes.respository.RelojRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelojService {

    @Autowired
    private RelojRepository relojRepository;

    public List<Reloj> obtenerTodos() {
        return relojRepository.findAll();
    }

    public Reloj obtenerPorId(Long id) {
        return relojRepository.findById(id).orElse(null);
    }

    public Reloj guardar(Reloj reloj) {
        return relojRepository.save(reloj);
    }

    public void eliminar(Long id) {
        relojRepository.deleteById(id);
    }
}