package GaleriaRelojes.service;

import GaleriaRelojes.model.Reloj;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelojService {

    private List<Reloj> relojes = new ArrayList<>();

    public RelojService() {

        relojes.add(new Reloj(
                1L,
                "Rolex Daydate Rose Gold 40mm Ombre Black 228235 Oro rosa Negro 40mm 2025",
                "El Rolex Day-Date 40 ref. 228235 en oro rosa con esfera ombré negra es la combinación perfecta de lujo y elegancia. Su exclusivo acabado en oro Everose de 18k y su distintiva esfera degradada lo convierten en una pieza sofisticada y muy deseada.",
                "/img/rolex-day-date.png"
        ));

        relojes.add(new Reloj(
                2L,
                "Patek Philippe Nautilus",
                "El Patek Philippe Nautilus 5711 es uno de los relojes más icónicos y codiciados del mundo. Su diseño elegante con carácter deportivo, junto a su inconfundible esfera y acabados de alta relojería, lo convierten en una pieza única.",
                "/img/nautilus.png"
        ));

        relojes.add(new Reloj(
                3L,
                "Omega Speedmaster Moonwatch",
                "El Omega Speedmaster Moonwatch Moonphase Co-Axial Master Chronometer 44.25 mm Platinum es una obra maestra de la relojería, que combina innovación y tradición en un diseño imponente.",
                "/img/omega-speedmaster.png"
        ));

        relojes.add(new Reloj(
                4L,
                "Rolex GMT Master II",
                "El Rolex GMT-Master II es un reloj de lujo diseñado para viajeros y profesionales que necesitan seguir múltiples zonas horarias.",
                "/img/Rolex-GMT.png"
        ));

        relojes.add(new Reloj(
                5L,
                "Hublot Big Bang Unico Dark Green Ceramic",
                "El Hublot Big Bang Unico Dark Green Ceramic destaca por su diseño audaz y su innovación técnica.",
                "/img/hublot.png"
        ));

        relojes.add(new Reloj(
                6L,
                "Jacob and Co. Astronomia Casino Roulette Tourbillon",
                "El Jacob and Co. Astronomia Casino Roulette Tourbillon es pura extravagancia y alta relojería.",
                "/img/jacobco.png"
        ));

        relojes.add(new Reloj(
                7L,
                "Richard Mille RM 30-01",
                "El Richard Mille RM 30-01 combina resistencia, precisión y estilo en una pieza única.",
                "/img/richard-mille.png"
        ));

        relojes.add(new Reloj(
                8L,
                "Tissot PRX",
                "El Tissot PRX combina estilo y funcionalidad en un diseño atemporal.",
                "/img/reloj1.jpg"
        ));
    }

    // GET
    public List<Reloj> obtenerTodos() {
        return relojes;
    }

    // POST
    public Reloj guardar(Reloj reloj) {
        relojes.add(reloj);
        return reloj;
    }

    // DELETE
    public void eliminar(Long id) {
        relojes.removeIf(r -> r.getId().equals(id));
    }
}