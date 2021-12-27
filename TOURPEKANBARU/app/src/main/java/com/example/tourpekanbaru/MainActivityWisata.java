package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityWisata extends AppCompatActivity {
    private ArrayList<String> fotowisata= new ArrayList<>();
    private ArrayList<String> namawisata=new ArrayList<>();
    private ArrayList<String> infowisata=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_wisata);
        getDataFromInternet();
    }
    private void prosesrecyclerView(){

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecylerviewAdapterHotel adapter=new RecylerviewAdapterHotel(fotowisata,namawisata,infowisata,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namawisata.add("Rainbow Hills Rumbai");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/12/Rainbow-Hills-Pekanbaru.jpg");
        infowisata.add("Tempat wisata pertama yang akan dibahas adalah Rainbow Hills Rumbai yang terletak sekitar 10 km dari pusat kota Pekanbaru.\n" +
                "\n" +
                "Nama lain dari tempat ini adalah Bukit Pelangi. Tempat wisata ini pertama kali diketahui oleh seorang traveler terkenal, Marischka Prudence.\n" +
                "\n" +
                "Salah satu keunikan dari tempat wisata ini adalah warnanya yang berubah-ubah di setiap waktu.\n" +
                "\n" +
                "Lokasi: Jl. Kemping, Lembah Sari, Kec. Rumbai Pesisir, Kota Pekanbaru, Riau\n" +
                "Jam Operasional: 07.00 – 18.00 WIB\n" +
                "Harga Tiket: Rp 5.000");
        namawisata.add("Air Terjun batu Dinding");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/12/Air-Terjun-Batu-Dinding.jpg");
        infowisata.add("Membutuhkan waktu kurang lebih dua jam untuk ke kota Pekanbaru dari tempat wisata ini.Tempat ini menyuguhkan keindahan alam dengan udaranya yang sejuk serta aliran air yang ada pada Terjun Batu Dinding.\n" +
                "\n" +
                "Walaupun air terjun ini tidak terlalu tinggi, tetapi kolam alami yang berada di bawahnya sangatlah luas, sehingga kamu bisa bebas berenang sepuasnya.\n" +
                "\n" +
                "Lokasi: 80 km dari Tj. Belit, Kec. Kampar Kiri Hulu, Kab. Kampar, Riau.\n" +
                "Jam Operasional: 24 jam\n" +
                "Harga Tiket: Rp 5.000");
        namawisata.add("Kawah Biru");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-1-Kumparan.jpeg");
        infowisata.add("Kawah Biru yang terletak di Desa Tanah Merah ini sebenarnya adalah lokasi bekas galian yang terisi air hujan sehingga membentuk kawah.\n" +
                "\n" +
                "Warna air biru yang indah pada objek wisata Pekanbaru ini dihasilkan disebabkan oleh galian pasir berwarna putih bening sehingga warna air terlihat jelas berwarna biru.\n" +
                "\n" +
                "Lokasi: Desa Tanah Merah, Kecamatan Siak Hulu, Kabupaten Kampar\n" +
                "Jam Operasional: 24 jam\n" +
                "Harga Tiket: Gratis");
        namawisata.add("Sungai Kampar");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-2-Tribunnews.jpg");
        infowisata.add("Siapa bilang berselancar hanya bisa dilakukan di laut? Di Sungai Kampar, Toppers bisa berselancar karena sungai ini memiliki ombak yang dikenal oleh warga lokal sebagai “Bono”.\n" +
                "\n" +
                "Toppers akan merasakan kecepatan ombak 40 kilometer per jam di tujuan wisata favorit Pekanbaru ini dan ombak inilah yang akan membawamu naik hingga ke ketinggian 4 sampai 6 meter.\n" +
                "\n" +
                "Lokasi: Sungai Kampar, Teluk Meranti, Kabupaten Pelalawan, Riau\n" +
                "Jam Operasional: 24 jam\n" +
                "Harga Tiket: Gratis");

        namawisata.add("Danau Buatan khayangan");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-3-Sportourism.jpg");
        infowisata.add("Tak hanya berfungsi sebagai saluran irigasi, Danau Khayangan juga populer sebagai salah satu destinasi wisata di Pekanbaru.\n" +
                "\n" +
                "Di Danau Khayangan, pengunjung bisa mengelilingi danau dengan menggunakan sampan atau speedboat, dan para pengunjung juga dapat mendaki bukit di sekitar danau.\n" +
                "\n" +
                "Lokasi: Jl. Khayangan, Rumbai Pesisir, Kota Pekanbaru, Riau\n" +
                "Jam Operasional: 24 jam\n" +
                "Harga Tiket: Gratis");

        namawisata.add("Air Terjun Aek Mertua");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-4-Detik.jpg");
        infowisata.add("Hal yang menarik dari Air Terjun Aek Martua adalah karena air terjun ini memiliki tiga tingkatan tempat mengalirnya air, dan ketinggian dari masing-masing tingkatan tersebut berbeda-beda mulai dari 15 hingga 40 meter.\n" +
                "\n" +
                "Selain menikmati pesona alam, Toppers bisa memanfaatkan kamera terbaik untu hunting foto di objek wisata Pekanbaru satu ini.\n" +
                "\n" +
                "Lokasi: Bangun Purba Timur Jaya, Kecamatan Bangun Purba, Kabupaten Rokan Hulu\n" +
                "Jam Operasional: 24 jam\n" +
                "Harga Tiket: Gratis\n");

        namawisata.add("Air Terjun Guruh Gemurai");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-5-Go-Sumatra.jpg");
        infowisata.add("Air terjun ini memiliki dua sumber aliran air yang mana air tersebut akan ditampung di kolam di bawahnya.\n" +
                "\n" +
                "Di kolam inilah para wisatawan melakukan kegiatan bermain air dan berenang yang memang merupakan daya tarik dari tempat wisata di Provinsi Riau satu ini.\n" +
                "\n" +
                "Lokasi: Lubuk Jambi, Kecamatan Kuantan Mudik, Kabupaten Kuantan Singingi\n" +
                "Jam Operasional: 08.00-18.00 WIB\n" +
                "Harga Tiket: Rp. 3000 (Dewasa), Rp. 1000 (Anak-anak)");
        namawisata.add("Taman Wisata Alam mayang");
        fotowisata.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-pekanbaru-8-Tribunnews.jpg");
        infowisata.add("Menjunjung konsep alam, Taman Wisata Alam Mayang adalah tujuan wisata Pekanbaru yang cocok untuk berkumpul bersama keluarga di akhir pekan.\n" +
                "\n" +
                "Kegiatan yang ditawarkan pun bermacam-macam, mulai dari tempat memancing, outbond, area mandi bola, tempat bermain anak-anak, dan lain lain.\n" +
                "\n" +
                "Lokasi:  Jl. H. Imam Munandar, Taman Alam Mayang, Tengkerang Tim., Tenayan Raya, Kota Pekanbaru\n" +
                "Jam Operasional: 07.00-18.00 WIB (Setiap Hari)\n" +
                "Harga Tiket: Rp. 20.000,00/orang");
        namawisata.add("Kebun Binatang sang Kulim");
        fotowisata.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTn6808gp5iTajz3KUg-RF1LeSdp8VkQin0UQ&usqp=CAU");
        infowisata.add("Kebun binatang akan selalu menjadi pilihan tempat wisata yang tepat untuk mengajarkan anak-anak mengenal binatang.\n" +
                "\n" +
                "Tak hanya ada berbagai macam binatang, tempat wisata keluarga di Pekanbaru satu ini juga menyediakan area bermain untuk anak-anak yang menyediakan ayunan, kolam renang anak, dan papan seluncur sehingga anak-anak akan merasa nyaman berada di Kebun Binatang Sang Kulim.\n" +
                "\n" +
                "Lokasi: Jl. Kubang Raya, Kecamatan Siak Hulu, Kabupaten Kampar\n" +
                "Jam Operasional: 08.00-17.00 (Setiap Hari)\n" +
                "Harga Tiket: Rp 20.000,00 (Dewasa), Rp 10.000,00 (Anak-anak)");



        prosesrecyclerView();
    }
}