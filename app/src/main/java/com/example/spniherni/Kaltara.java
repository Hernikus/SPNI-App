package com.example.spniherni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Kaltara {
    private String kabupatenKota;
    private String deskripsi;
    public static final Kaltara[] DAFTAR_KALTARA = {
            new Kaltara("Kabupaten Bulungan",
                    "Walikota: Syarwani\nLuas Wilayah: 13.925,72 km2"),
            new Kaltara("Kabupaten Malinau",
                    "Bupati: Wempi Wellem Mawa\nLuas Wilayah: 42.620,70 km2"),
            new Kaltara("Kabupaten Nunukan",
                    "Walikota: Asmin Laura\nLuas Wilayah: 13.841,90 km2"),
            new Kaltara("Kabupaten Tana Tidung",
                    "Walikota: Ibrahim Ali\nLuas Wilayah: 4.828,58 km2"),
            new Kaltara("Kota Tarakan",
                    "Walikota: Khairul\nLuas Wilayah: 250,80 km2")
    };
}
