package com.example.tugasfrontend.data

import com.example.tugasfrontend.R


object DataMotors{
    val motor =
        Motor(
            id = 1,
            title = "K Ninja H2R",
            description = "Inilah motor tercepat di dunia yang diproduksi secara massal. Kawasaki Ninja H2R bisa berlari mencapai 400 km/jam saat di test oleh pembalap World Superbike asal Turki, Kenan Sofuoğlu. Kehebatan motor ini tidak lepas dari pemakaian mesin 4-stroke, 4-cylinder, DOHC, 4-valve, liquid-cooled, supercharged yang memiliki kapasitas sebesar 998cc. Sayangnya kita tidak bisa menggunakan Ninja H2R di jalan raya, jadi bagi sobat yang berutung bisa membelinya harus ke sirkuit untuk membutuhkan kehebatan motor sport tercepat ini.",
            motorImage = R.drawable.h2
        )
    val motorList = listOf(
        motor,
        Motor(
            id = 2,
            title = "BMW M 1000 RR",
            description = "Mesin 4 Silinder DOHC berkapasitas 999cc mengantarkan BMW S1000RR HP4 meraih top speed mencapai 350 km/jam. Mesin yang dipakainya sanggup mengeluarkan tenaga maksimal sebesar 215 Horsepower pada putaran 13.900 rpm. Sedangkan torsi maksimumnya mencapai 120 Nm pada 10.000 rpm. Bodinya terbuat dari material berbahan karbon yang membuatnya memiliki bobot sangat ringan, sehingga bisa berlari lebih cepat dibandingkan motor sekelasnya yang masih menggunakan bodi berbahan plastik.",
            motorImage = R.drawable.bmw
        ),
        Motor(
            id = 3,
            title = "Damon HS",
            description = "Damon HyperSport Premier disebut memiliki kecepatan maksimal 200 mil per jam atau 321 km per jam.Meski memiliki kecepatan yang luar biasa, Damon tetap mengutamakan kecanggihan teknologi dan keamanan pada motor yang memiliki tampilan futuristik ini. Salah satu fitur unggulannya ada pada sistem keamanan Co-Pilot yang memiliki sensor 360 derajat dan dapat memberikan peringatan potensi kecelakaan kepada pengendara. ",
            motorImage = R.drawable.damon
        ),
        Motor(
            id = 4,
            title = "Suzuki Hayabusa",
            description = "Motor buatan Suzuki ini selalu masuk ke dalam daftar motor tercepat di dunia, karena bisa berlari hingga kecepatan 334 km/jam berkat mesin 4-stroke, 4-cylinder, DOHC, 4-valve, liquid-cooled berkapasitas 1.441cc. Selain mengandalkan mesin bertenaga, Suzuki Hayabusa juga memiliki bodi aerodinamis yang membuatnya bisa berlari sangat cepat. Sayangnya Suzuki tidak melakukan perubahan desain pada motor ini, sehingga masih terlihat sama dengan tahun-tahun sebelumnya.",
            motorImage = R.drawable.haya1
        ),
        Motor(
            id = 5,
            title = "Yamaha YZF-R1",
            description = "YZF-R1 M merupakan superbike andalan Yamaha yang diturunkan dari MotoGP. Motor ini punya mesin 998 cc, sehingga mampu menjanjikan performa yang mengesankan sejak kopling dilepas.\n" +
                    "Memiliki 197 tenaga kuda dan 83 pound-feet , yang cukup baik untuk sprint 0 hingga 62 mph hanya dalam 2,56 detik.\n",
            motorImage = R.drawable.yzf
        ),
        Motor(
            id = 6,
            title = "ZX-10RR",
            description = "Kawasaki ZX-10RR. R ekstra bisa menjadi pilihan superbike yang menjanjikan, karena memiliki performa lebih dari mesin 998cc, inline-four, total 214 tenaga kuda serta 82 pound-feet.\n" +
                    "Batang titanium dan piston yang lebih ringan (daripada 10R) menjadi kelebihan dari motor ini. Selain itu, kita juga bisa mendapatkan sistem asupan variabel baru untuk tahun 2024.\n",
            motorImage = R.drawable.zx10
        ),
        Motor(
            id = 7,
            title = "CBR1000RR-R",
            description = "Honda CBR1000RR-R Fireblade SP memiliki mesin 999 cc inline-four yang dirombak untuk performa maksimal, dengan injeksi dua tahap dan punya kaleng Akrapovic khusus sebagai standar.\n" +
                    "Superbike ini memiliki 215 tenaga kuda dan 83 pound-feet dengan berat hanya 443 pon (201 kg).\n",
            motorImage = R.drawable.cbr
        ),
        Motor(
            id = 8,
            title = "MV Agusta",
            description = "MV Agusta juga memiliki motor tercepat di dunia, yakni MV Agusta F4 RR. Motor ini mengusung mesin 4 Silinder berkapaitas 998cc yang bisa menyemburkan tenaga sebesar 201 Horsepoer pada 13.600 rpm dan torsi 111 Nam pada 9.600 rpm. Mesin tersebut berhasil membuat MV Agusta F4 RR berlari sangat cepat dengan top speed mencapai 312 km/jam. Desainnya juga sangat keren dan ditunjang bodi aerodinamis yang memiliki lekukan indah khas motor asal Italia.",
            motorImage = R.drawable.mv
        ),
        Motor(
            id = 9,
            title = "Aprilia RSV4",
            description = "Top Speed 297 km/jam menempatkan Aprilia RSV4 RF sebagai salah satu motor tercepat di dunia. Motor ini ditenagai mesin Aprilia V4 longitudinal 65° berkapasitas 999.6cc yang bisa mengeluarkan tenaga sebesar 201 Horsepower pada 13.000 rpm dan torsi 115 Nm pada 10.500 rpm. Mesin 4 silinder yang dipakainya juga dilengkapi sistem pendingin cairan dan gearbox 6 percepatan yang membuat performa Aprilia RSV4 RF semakin optimal.",
            motorImage = R.drawable.april1
        ),
        Motor(
            id = 10,
            title = "Ducati Vaniagale",
            description = "Motor sport asal Italia ini bisa berlari hingga keceaptan 325 km/jam. Kemampuan ini tidak lepas dari mesin Ducati Panigale 1199 R yang mengusung mesin Superquadro L-Twin berkapasitas 1.198cc. Tenaga yang dikeluarkan juga sangat besar, jadi wajar apabila bisa berlari melebihi 300 km/jam. Dimana tenaga maksimumnya mencapai 205 Horsepoer pada 11.500 rpm dan torsi puncak sebesar 136.2 Nm pada 10.250 rpm. Sebelumnya motor ini pernah dipajang di IIMS 2016 dengan harga hampir 2 Miliar Rupiah.",
            motorImage = R.drawable.ducati
        )
    )
}