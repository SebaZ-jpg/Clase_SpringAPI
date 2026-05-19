INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Rolex Daydate Rose Gold 40mm Ombre Black 228235 Oro rosa Negro 40mm 2025',
       'El Rolex Day-Date 40 ref. 228235 en oro rosa con esfera ombré negra es la combinación perfecta de lujo y elegancia. Su exclusivo acabado en oro Everose de 18k y su distintiva esfera degradada lo convierten en una pieza sofisticada y muy deseada.',
       '/img/rolex-day-date.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Rolex Daydate Rose Gold 40mm Ombre Black 228235 Oro rosa Negro 40mm 2025');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Patek Philippe Nautilus',
       'El Patek Philippe Nautilus 5711 es uno de los relojes más icónicos y codiciados del mundo. Su diseño elegante con carácter deportivo, junto a su inconfundible esfera y acabados de alta relojería, lo convierten en una pieza única.',
       '/img/nautilus.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Patek Philippe Nautilus');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Omega Speedmaster Moonwatch',
       'El Omega Speedmaster Moonwatch Moonphase Co-Axial Master Chronometer 44.25 mm Platinum es una obra maestra de la relojería, que combina innovación y tradición en un diseño imponente.',
       '/img/omega-speedmaster.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Omega Speedmaster Moonwatch');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Rolex GMT Master II',
       'El Rolex GMT-Master II es un reloj de lujo diseñado para viajeros y profesionales que necesitan seguir múltiples zonas horarias.',
       '/img/Rolex-GMT.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Rolex GMT Master II');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Hublot Big Bang Unico Dark Green Ceramic',
       'El Hublot Big Bang Unico Dark Green Ceramic destaca por su diseño audaz y su innovación técnica.',
       '/img/hublot.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Hublot Big Bang Unico Dark Green Ceramic');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Jacob and Co. Astronomia Casino Roulette Tourbillon',
       'El Jacob and Co. Astronomia Casino Roulette Tourbillon es pura extravagancia y alta relojería.',
       '/img/jacobco.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Jacob and Co. Astronomia Casino Roulette Tourbillon');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Richard Mille RM 30-01',
       'El Richard Mille RM 30-01 combina resistencia, precisión y estilo en una pieza única.',
       '/img/richard-mille.png'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Richard Mille RM 30-01');

INSERT INTO reloj (titulo, texto, imagen)
SELECT 'Tissot PRX',
       'El Tissot PRX combina estilo y funcionalidad en un diseño atemporal.',
       '/img/reloj1.jpg'
    WHERE NOT EXISTS (SELECT 1 FROM reloj WHERE titulo = 'Tissot PRX');