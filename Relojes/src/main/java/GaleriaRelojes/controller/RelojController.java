package GaleriaRelojes.controller;

import GaleriaRelojes.Service.RelojService;
import GaleriaRelojes.model.Reloj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/relojes")
@CrossOrigin(origins = "*")
public class RelojController {

    @Autowired
    private RelojService relojService;

    @GetMapping
    public ResponseEntity<List<Reloj>> obtenerTodos(
            @RequestParam(required = false) String buscar) {
        if (buscar != null && !buscar.trim().isEmpty()) {
            return ResponseEntity.ok(relojService.buscarPorTitulo(buscar));
        }
        return ResponseEntity.ok(relojService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reloj> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(relojService.obtenerPorId(id));
    }

    @PostMapping
    public ResponseEntity<Reloj> crear(@RequestBody Reloj reloj) {
        return ResponseEntity.status(HttpStatus.CREATED).body(relojService.guardar(reloj));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reloj> actualizar(
            @PathVariable Long id, @RequestBody Reloj reloj) {
        return ResponseEntity.ok(relojService.actualizar(id, reloj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        relojService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}