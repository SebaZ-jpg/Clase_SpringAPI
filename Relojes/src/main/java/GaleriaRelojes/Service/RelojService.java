package GaleriaRelojes.Service;

import GaleriaRelojes.model.Reloj;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class RelojService {

    private final List<Reloj> relojes = new ArrayList<>();
    private final AtomicLong contadorId = new AtomicLong(1);

    public RelojService() {
        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Rolex Daydate Rose Gold 40mm",
                "El Rolex Day-Date 40 ref. 228235 en oro rosa con esfera ombré negra es la combinación perfecta de lujo y elegancia. Su exclusivo acabado en oro Everose de 18k lo convierten en una pieza sofisticada.",
                "static/img/rolex-day-date.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Patek Philippe Nautilus",
                "El Patek Philippe Nautilus 5711 es uno de los relojes más icónicos y codiciados del mundo. Su diseño elegante con carácter deportivo lo convierten en una pieza única.",
                "static/img/nautilus.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Omega Speedmaster Moonwatch",
                "El Omega Speedmaster Moonwatch Moonphase Co-Axial Master Chronometer es una obra maestra de la relojería que combina innovación y tradición en un diseño imponente.",
                "static/img/omega-speedmaster.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Rolex GMT Master II",
                "El Rolex GMT-Master II es un reloj de lujo diseñado para viajeros que necesitan seguir múltiples zonas horarias. Un símbolo de prestigio y funcionalidad.",
                "static/img/Rolex-GMT.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Hublot Big Bang Unico Dark Green Ceramic",
                "El Hublot Big Bang Unico Dark Green Ceramic destaca por su diseño audaz y su innovación técnica con caja de cerámica y movimiento Unico de manufactura propia.",
                "static/img/hublot.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Jacob and Co. Astronomia Casino Roulette Tourbillon",
                "Pura extravagancia y alta relojería llevadas al extremo. Su diseño tridimensional con ruleta funcional y tourbillon lo convierten en una pieza única.",
                "static/img/jacobco.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Richard Mille RM 30-01",
                "El Richard Mille RM 30-01 está diseñado para resistir las condiciones extremas del tenis profesional con caja de titanio, carbono y movimiento tourbillon.",
                "static/img/richard-mille.png"));

        relojes.add(new Reloj(contadorId.getAndIncrement(),
                "Tissot PRX",
                "El Tissot PRX combina estilo y funcionalidad en un diseño atemporal. Con su caja de acero inoxidable y movimiento automático es una elección perfecta.",
                "static/img/reloj1.jpg"));
    }

    public List<Reloj> obtenerTodos() {
        return relojes;
    }

    public List<Reloj> buscarPorTitulo(String texto) {
        return relojes.stream()
                .filter(r -> r.getTitulo().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Reloj obtenerPorId(Long id) {
        return relojes.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Reloj no encontrado con id: " + id));
    }

    public Reloj guardar(Reloj reloj) {
        reloj.setId(contadorId.getAndIncrement());
        relojes.add(reloj);
        return reloj;
    }

    public Reloj actualizar(Long id, Reloj actualizado) {
        Reloj existente = obtenerPorId(id);
        existente.setTitulo(actualizado.getTitulo());
        existente.setTexto(actualizado.getTexto());
        existente.setImagen(actualizado.getImagen());
        return existente;
    }

    public void eliminar(Long id) {
        relojes.removeIf(r -> r.getId().equals(id));
    }
}