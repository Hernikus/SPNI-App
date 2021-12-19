package com.example.spniherni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Jakarta {
    private String kabupatenKota;
    private String deskripsi;
    public static final Jakarta[] DAFTAR_JAKARTA = {
            new Jakarta("Kota Administrasi Jakarta Utara",
                    "Bupati: Haryadi Suyuti\nLuas Wilayah: 32,50 km2"),
            new Jakarta("Kota Administrasi Jakarta Selatan",
                    "Bupati: Kustini Sri Purnomo\nLuas Wilayah: 574,82 km2"),
            new Jakarta("Kota Administrasi Jakarta Barat",
                    "Bupati: Sutedjo\nLuas Wilayah: 586,27 km2"),
            new Jakarta("Kota Administrasi Jakarta Timur",
                    "Bupati: Sunaryanta\nLuas Wilayah: 1.485,36 km2"),
            new Jakarta("Kota Administrasi Jakarta Pusat",
                    "Bupati: Abdul Halim Muslih\nLuas Wilayah: 506,86 km2"),
            new Jakarta("Kepulauan Seribu",
                    "Bupati: Abdul Halim Muslih\nLuas Wilayah: 506,86 km2")
    };
}
