package com.example.spniherni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Jogja {
    private String kabupatenKota;
    private String deskripsi;
    public static final Jogja[] DAFTAR_JOGJA = {
            new Jogja("Kota Yogyakarta",
                    "Bupati: Haryadi Suyuti\nLuas Wilayah: 32,50 km2"),
            new Jogja("Kabupaten Sleman",
                    "Bupati: Kustini Sri Purnomo\nLuas Wilayah: 574,82 km2"),
            new Jogja("Kabupaten Kulon Progo",
                    "Bupati: Sutedjo\nLuas Wilayah: 586,27 km2"),
            new Jogja("Kabupaten Gunungkidul",
                    "Bupati: Sunaryanta\nLuas Wilayah: 1.485,36 km2"),
            new Jogja("Kabupaten Bantul",
                    "Bupati: Abdul Halim Muslih\nLuas Wilayah: 506,86 km2")
    };
}
