package GaleriaRelojes.controller;

import GaleriaRelojes.model.Reloj;
import GaleriaRelojes.service.RelojService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relojes")
@CrossOrigin("*")
public class RelojController {

    @Autowired
    private RelojService relojService;

    // GET
    @GetMapping
    public List<Reloj> obtenerTodos() {
        return relojService.obtenerTodos();
    }

    // POST
    @PostMapping
    public Reloj guardar(@RequestBody Reloj reloj) {
        return relojService.guardar(reloj);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        relojService.eliminar(id);
    }
}