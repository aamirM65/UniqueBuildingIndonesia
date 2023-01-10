package com.dicoding.lesson1.uniquebuildingindonesia

object BuildingData {
    private val buildingNames = arrayOf("Menara Pinisi",
        "Binus Alam Sutera",
        "New media Tower",
        "Bakrie Tower",
        "Regatta Towers",
        "Menara UOB Buana",
        "Menara Palma",
        "Menara Karya",
        "Wisma BNI 46",
        "Gama Tower")

    private val buildingDetails = arrayOf("Bangunan tinggi yang unik di Indonesia memang didominasi oleh gedung perkantoran. Akan tetapi, ada beberapa bangunan kampus yang juga ikonik. Salah satunya adalah Universitas Negeri Makassar (UNM). Bangunan kampus ini terinspirasi dari perahu pinisi, simbol khas masyarakat Bugis. Gedung yang nama lainnya Tellu Cappa (tiga puncak) ini, merupakan hasil rancangan Yu Sing. Dengan tinggi 17 lantai, kampus ini didesain dengan konsep utama yang identik dengan pendalaman kearifan lokal yang dipadukan dengan teknologi modern terkini. Kampus UNM menjadi gedung tertinggi pertama di Indonesia dengan menggunakan sistem fasade Hiperbolic Paraboloid. Pada malam hari lampu-lampu pada menara gedung di lantai 17 akan berkerlap-kerlip indah dengan 12 warna berbeda yang mewakili jumlah fakultas yang ada di kampus UNM.",
        "Gedung Kampus Bina Nusantara setinggi 22 lantai ini, memiliki konsep dan bentuk yang tidak kalah unik. Zonasi teratur, ramah lingkungan, dan hemat energi menjadi konsep yang digagas Budiman Hendropurnomo, sang arsiteknya.  Gagasan ini dituangkan lewat desain kotak-kotak pada gedung dengan banyak jendela besar untuk memaksimalkan pencahayaan alami. Kampus ini juga memiliki sistem penampungan air hujan yang bisa dimanfaatkan untuk pengairan lanskap, toilet, dan sebagai kontribusi dalam mengatasi krisis air tanah.",
        "Pada tahun 2013, Gedung New Media Tower berhasil menjadi pemenang pertama kategori gedung baru hemat energi dalam ajang Penghargaan Efisiensi Energi Nasional (PEEN). Berbentuk unik menyerupai cangkang telur, dengan penonjolan warna abu-abu dari perforated metal selubungnya. Lewat konsep arsitektur ramah lingkungan dan teknologi tinggi yang diterapkannya, gedung setinggi 12 lantai ini mampu menghemat energi hingga 53,25 kWH per tahun per meter persegi. Pengaplikasian double skin facade menggunakan aluminium panel mampu mereduksi panas hingga 70 persen sehingga dapat menghemat penggunaan pendingin ruangan (AC). Dindingnya berpori dengan ukuran diameter tiap lubang berbeda, untuk menghasilkan cahaya maksimal. Campuran super foam dengan beton membuat dinding bisa mereduksi panas dan mampu meredam suara.",
        "Bakrie Tower menghadirkan gedung perkantoran grade A+ dengan arsitektur twist style yang unik, asimetris, dan artistik. Penggunaan kaca berwarna biru gelap menyerupai sisik membuat fasade gedung ini terlihat sangat eksotis, dengan tampak depan yang lebar, tetapi ramping di sampingnya.\n" +
                "\n" +
                "Bangunan ini terintegrasi dengan kompleks Rasuna Epicentrum, sebuah kawasan yang mengaplikasikan konsep baru ‘integrated basement’, artinya seluruh basement saling berhubungan, jadi jika terjadi kemacetan di satu kawasan, masih bisa menggunakan jalan lain. Inovasi konsep ini juga menghemat ruang untuk kendaraan di lantai dasar. Bakrie Tower sengaja didesain untuk menjadi sebuah ikon unik di pusat Kota Jakarta. Bangunan 48 lantai setinggi 216 meter ini, sengaja dipuntir 3 kali sehingga membentuk silhouette bangunan yang sangat unik dari tiap sudut yang berbeda.\n" +
                "\n" +
                "Dari lantai 1 hingga 17, tiap lantai bangunan ini berputar searah jarum jam. Kemudian dari lantai 18 hingga 34 berbalik arah dan kembali lagi sesuai arah jarum jam dari lantai 35 hingga lantai 48. Semua pergeseran mempunyai sudut konstan sebesar 4,950, sebagai hasil analisa dan permodelan untuk fasade bangunannya.\n" +
                "\n" +
                "Setelah melalui serangkaian uji coba modul frame, gedung ini menerapkan frame berbentuk segitiga dengan sudut yang saling berbeda antara satu dan yang lainnya. Satu modul frame memiliki bentuk trapesium yang terdiri dari beberapa segitiga yang tidak memiliki sudut yang sama karena perputaran lantai. Tidak ada modul yang berulang sehingga bila satu lantai membutuhkan 100 modul lebih, untuk 48 lantai dibutuhkan lebih dari 4800-5000 modul yang saling berbeda ukurannya.",
        "Lahir dari hasil karya Tom Wright (WS Atkins Consultants, Inggris) dengan konsep sederhana bertemakan bahari tetapi dinamis, Regatta Towers mampu menjadi ikon di tepi Teluk Jakarta. Gugusan bangunan apartemen menjadi perlambang kapal dengan layar terkembang yang berangkat mengikuti arah kompas, sambil menyajikan panorama Laut Jawa.\n" +
                "\n" +
                "Keunikan desain Regatta hasil kerjasama PT Intiland Development Tbk dan PT Global Ekabuana ini mendapat penghargaan Prix d'Excellence tahun 2010, yang diberikan oleh Federasi Real Estate Internasional, FIABCI. Kompleks yang masih dalam tahap pengembangan ini memiliki 10 tower apartemen setinggi 24 lantai dan 1 hotel. Uniknya, setiap lobby tower memiliki desain yang berbeda-beda sesuai nama tiap-tiap tower (Dubai, Miami, Monte Carlo, Rio de Jaineiro, dan New York). Bentuk Regatta Hotel yang menyerupai huruf O sangat unik dan berpotensi menjadi ikon tingkat dunia.",
        "Meski berada di tengah-tengah bangunan megah lainnya di sekitar Bundaran Hotel Indonesia, Menara UOB Buana tetap tampil mencolok, menunjukkan keunikan dari bentuknya yang sangat berbeda. Fasade nya tampil sejuk dari pemanfaatan kaca berwarna biru kehijauan. Terinpirasi dari susunan lego, bangunan ini tersusun dari gabungan balok-balok dengan permainan penonjolan bentuk di sana-sini. Konsep arsitektur yang mengingatkan kita akan pengaturan bentuk dasar yang sederhana untuk menciptakan karya yang luar biasa.",
        "Menara Palma adalah hasil rancangan DCM Architect yang mencerminkan konsep manajemen modern dari perusahaan yang bergerak di bidang perkebunan. Keunikannya terletak pada bentuk towernya yang menyerupai huruf A, seolah-olah menjadi kaki langit Jakarta. Fasade sisi miring terbentuk dari kaca berwarna biru dan sisi trapesium di tengahnya menggunakan kaca hitam dengan penonjolan garis horizontal. Kesan asimetris ditonjolkan lewat salah satu tower yang lebih tinggi dari lainnya dan seolah-olah bersandar pada tower yang lebih rendah. Bentuk huruf A menunjukkan bentuk dasar yang paling kokoh dan tak tergoyahkan.",
        "Masih di kawasan Rasuna Said, sejak 2006, gedung Menara Karya setinggi 26 lantai dengan tambahan 4 lantai basement, tampak seperti sculpture yang tidak konvensional. Gedung ini menawarkan desain yang sangat unik nan elegan sebagai perkantoran, dengan bagian bawah lebih kecil dibandingkan atasnya. Kemudian pada satu lantai di bagian atas dibuat seperti keluar. Pada lantai 23 dan 24 sengaja dibuat menyembul, seperti ‘uno stacko’ yang sedang ditarik keluar.",
        "Wisma BNI 46 sukses menjadi ikon bangunan tertinggi di Indonesia selama 2 dekade. Landmark yang ikonik berbentuk unik menyerupai pena setinggi 261,9 meter dengan 48 lantai. Hasil rancangan Zeidler Robets Partnership dan DP Architects ini berdiri di Jl. Sudirman sejak tahun 1996. Gedung yang pernah menduduki peringkat bangunan tertinggi ke-147 di dunia dan ke-2 di belahan bumi selatan ini, memiliki 23 elevator dengan kecepatan 360 meter per menit. Keindahan eksteriornya terlihat mulai dari dasar sampai puncaknya  yang menyerupai layar pinisi, perahu tradisional kebanggaan Indonesia yang sudah dikenal dunia.",
        "Ini dia bangunan yang sukses menyandang gelar pencakar langit tertinggi di Indonesia menggantikan posisi Wisma BNI 46 sejak 26 Agustus 2016. Gama Tower hasil rancangan PT Sekawan Design Inc berlokasi di Jalan HR. Rasuna Said, Jakarta. Gama Tower yang dikenal juga sebagai Cemindo Tower, memiliki 63 lantai yang difungsikan sebagai perkantoran, hotel dan restoran mewah. Gama Tower dengan ketinggian 288,6 meter menduduki peringkat ke-64 untuk gedung tertinggi se-Asia dan peringkat ke-126 sedunia!")

    private val buildingImages = intArrayOf(R.drawable.pinisi,
        R.drawable.binus,
        R.drawable.newmedia,
        R.drawable.bakrie,
        R.drawable.regata,
        R.drawable.buana,
        R.drawable.palma,
        R.drawable.karya,
        R.drawable.wisma,
        R.drawable.gama)

    val listData: ArrayList<Building>
        get() {
            val list = arrayListOf<Building>()
            for (position in buildingNames.indices) {
                val building = Building()
                building.name = buildingNames[position]
                building.detail = buildingDetails[position]
                building.photo = buildingImages[position]
                list.add(building)
            }
            return list
        }

}