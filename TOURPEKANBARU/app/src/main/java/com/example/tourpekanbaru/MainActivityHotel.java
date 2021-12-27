package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityHotel extends AppCompatActivity {
    private ArrayList<String> fotohotel= new ArrayList<>();
    private ArrayList<String> namahotel=new ArrayList<>();
    private ArrayList<String> infohotel=new ArrayList<>();
    private Context context;
    //Button btnalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hotel);
        getDataFromInternet();
    }
    private void prosesrecyclerView(){

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecylerviewAdapterHotel adapter=new RecylerviewAdapterHotel(fotohotel,namahotel,infohotel,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namahotel.add("Novotel Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/1b/e5/80/a5/guest-room.jpg");
        infohotel.add("Hotel Novotel Pekanbaru\n" +
                "\n" +
                "Hotel yang menjadikan setiap momen begitu penting\n" +
                "\n" +
                "Novotel Pekanbaru adalah hotel bintang 4 yang terletak di Jalan Riau, sekitar 20 menit dari Bandara Internasional Sultan Syarif Kasim II Pekanbaru. " +
                "Menawarkan akomodasi terbaik, hotel ini memiliki 150 kamar dan suite, Grand Ballroom, In Balance Spa, ruang acara yang cukup luas, serta restoran dan bar yang luar biasa.\n" +
                "\n" +
                "Terletak di kawasan bisnis Pekanbaru yang luar biasa, berjarak 20 menit dari Bandara Internasional Sultan Syarif Kasim II Pekanbaru. Dikelilingi oleh Pusat Perbelanjaan Pekanbaru, 5 menit dari Pasar Bawah Wisata");
        namahotel.add("BATIQA Hotel Pekanbaru");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/14/66/c6/46/batiqa-hotel-pekanbaru.jpg");
        infohotel.add("BATIQA Hotel Pekanbaru terletak di kawasan pusat bisnis sangat mudah diakses, Jl. Jenderal Sudirman dan terletak hanya berjarak 2,3 km dari Bandara Internasional Sultan Syarif Kasim II. " +
                "Dikelilingi oleh pusat perbelanjaan, pusat kuliner, Bar karaoke dan pasar lokal, BATIQA Hotel Pekanbaru adalah " +
                "tempat yang tepat bagi Anda untuk tinggal ketika mengunjungi kota.  ");
        namahotel.add("The Zuri Pekanbaru");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/16/b6/53/5a/junior-suite.jpg");
        infohotel.add(" Staycation di The Zuri Hotel berbeda karena hotel ini berada di area Transmart Pekanbaru. Selain itu, " +
                "juga sangat dekat dengan 2 Mall besar, yakni Mall SKA dan Living World.\n" +
                "\n" +
                "Hotel bintang 4 yang berlokasi di Jalan Soekarno Hatta ini, mulai beroperasi sejak bulan Februari 2019. " +
                "Desain interior The Zuri sangat instagrammable, dan berbeda pada setiap lantai.");
        namahotel.add("Grand Zuri Pekanbaru Hotel");
        fotohotel.add("https://dynamic-media-cdn.tripadvisor.com/media/photo-s/02/32/5d/2a/superior.jpg?w=100&h=100&s=1");
        infohotel.add(" Menginap di Grand Zuri Pekanbaru menempatkan di jantung kota Pekanbaru, hanya 3 menit dengan berjalan" +
                " kaki dari Mall Pekanbaru dan hanya 5 menit dengan berkendara dari Masjid Agung An-Nur. " +
                "Fasilitas unggulan antara lain pusat bisnis 24 jam, laundry/dry cleaning, dan resepsionis 24 jam." +
                " Antar-jemput ke bandara disediakan dengan biaya tambahan (tersedia 24 jam), " +
                "dan parkir mandiri gratis tersedia di lokasi.");
        namahotel.add("Labersa Grand Hotel & Convention Center ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/0e/a2/73/57/labersa-grand-hotel-convention.jpg");
        infohotel.add(" Labersa Grand Hotel & Convention Center adalah hotel 5-Bintang di Kota Pekanbaru yang menawarkan akomodasi gabungan untuk bisnis " +
                "dan rekreasi dengan lingkungan yang subur dan hijau dengan pertamanan serta fasilitas rekreasi air dan Golf " +
                "Course dengan 27 Holes.Labersa Grand Hotel & Convention Center terletak di Pekanbaru, Sumatra, 7 km dari Pelabuhan Pelindo. " +
                "Akomodasi ini memiliki kolam renang luar ruangan dan hot tub. Terdapat juga taman rekreasi air dan restoran." +
                "Value for money\t8.2\n" +
                "Distance to city center\t15 Km\n" +
                "Location rating\t7.1\n" +
                "Nearest airport\tSultan Syarif Kasim II International Airport (PKU)\n" +
                "Distance to airport\t4.0 Km");
        namahotel.add("FOX Hotel Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/13/21/54/43/deluxe-room.jpg");
        infohotel.add(" Terletak di kota Pekanbaru, FOX Hotel Pekanbaru hanya beberapa langkah dari Ciputra Seraya Mall dan " +
                "4 menit dengan berkendara dari Mall Pekanbaru. Hotel bintang 4 berjarak 2,8 mi (4,5 km) " +
                "dari Masjid Agung An-Nur dan 3,6 mi (5,9 km) dari Universitas Riau.Bersantailah di spa yang" +
                " menawarkan layanan lengkap ini, di sini Anda bisa menikmati pijat. Fasilitas tambahan di hotel " +
                "ini mencakup akses Internet nirkabel gratis, layanan concierge, dan penitipan bayi/anak gratis." +
                "Puaskan selera makan Anda untuk makan siang atau makan malam di Greens Restaurant, restoran yang memiliki " +
                "spesialisasi masakan internasional, atau tetap tinggal di kamar dan manfaatkan layanan kamar 24 jam." +
                "Hilangkah dahaga dengan minuman favorit Anda di bar tepi kolam renang.Fasilitas unggulan antara " +
                "lain pusat bisnis, koran gratis di lobi, dan laundry/dry cleaning. Antar-jemput ke bandara disediakan" +
                " dengan biaya tambahan (tersedia atas permintaan), dan parkir mandiri gratis tersedia di lokasi." +
                "Nikmati kenyamanan rumah Anda sendiri di salah satu dari 225 kamar berpenyejuk udara yang dilengkapi " +
                "dengan minibar dan televisi LED. Akses Internet nirkabel gratis tersedia untuk menjamin koneksi Anda; " +
                "Untuk hiburan, kabel disediakan. Kamar mandi pribadi dengan shower memiliki perlengkapan mandi gratis dan kloset." +
                " Fasilitas mencakup brankas (dapat memuat laptop) dan meja tulis, dan layanan pembenahan kamar disediakan setiap hari.");
        namahotel.add("PRIME PARK Hotel & Convention Pekanbaru");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/19/da/d0/0b/prime-park-hotel-pekanbaru.jpg");
        infohotel.add(" PRIME PARK Hotel Pekanbaru adalah hotel bintang 4 yang terletak di pusat bisnis dan pemerintahan Pekanbaru." +
                " Terletak 5 menit dari Bandar Udara Sultan Syatif Kasim II, PRIME PARK Hotel Pekanbaru adalah tempat ideal " +
                "bagi tamu dalam perjalanan bisnis dan turis untuk beristirahat bersama kolega, teman atau keluarga.\n" +
                "\n" +
                "Dengan 151 kamar yang nyaman dan luas dilengkapi dengan berbagai fasilitas seperti free Wi-Fi, " +
                "pendingin ruangan, brankas dan minibar yang didesain secara elegan, PRIME PARK Hotel Pekanbaru " +
                "menjadi pilihan yang cocok untuk turis modern.\n" +
                "\n" +
                "Nikmati berbagai fasilitas seperti kolam renang, restoran dan pool bar yang menyediakan makanan " +
                "khas Asia maupun Internasional, spa, lapangan parkir yang luas, ruang rapat dan ballroom.\n" +
                "\n" +
                "Rasakan Keramahan Indonesia di PRIME PARK Hotel Pekanbaru.");
        namahotel.add("Zuri Express Hotel Pekanbaru");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/07/93/88/80/zuri-express-hotel-pekanbaru.jpg");
        infohotel.add(" Berlokasi strategis di jantung kota Pekanbaru, Zuri Express Hotel Pekanbaru menawarkan " +
                "akomodasi bintang 2 untuk pelancong bisnis dan liburan. Para tamu dapat menikmati akses mudah ke " +
                "destinasi yang wajib dikunjungi di kota ini. Sangat dekat dengan Masjid Agung An-Nur, Mall Pekanbaru " +
                "dan gedung perkantoran pemerintah, hotel ini dirancang untuk mereka yang menghargai kenyamanan, " +
                "kemudahan dan nilai yang baik. Dirancang secara efisien untuk menjadi modern dan minimalis, " +
                "hanya 20 menit dari Bandara Internasional Sultan Syarif Kasim II.");
        namahotel.add("Ayola First Point Hotel Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/0e/6b/d6/0b/ayola-first-point-hotel.jpg");
        infohotel.add(" Dengan menginap di Ayola First Point Hotel Pekanbaru di kota Pekanbaru, " +
                "Anda akan berada 5,8 mi (9,3 km) dari Universitas Riau dan 6,4 mi (10,3 km) dari Ciputra Seraya Mall." +
                " Hotel ini berada 6,6 mi (10,6 km) dari Masjid Agung An-Nur dan 6,9 mi (11,1 km) dari Mall Pekanbaru." +
                "Manfaatkan sarana rekreasi seperti kolam renang outdoor, atau fasilitas lainnya, seperti akses Internet " +
                "nirkabel gratis dan layanan concierge. Tamu bisa bepergian dengan layanan antar-jemput gratis yang " +
                "beroperasi dalam radius 5 km.Nikmati hidangan lezat di Ayola yang melayani tamu dari Ayola First Point " +
                "Hotel Pekanbaru.Fasilitas unggulan antara lain koran gratis di lobi, resepsionis 24 jam, dan staf multibahasa." +
                " Antar-jemput ke bandara disediakan dengan biaya tambahan (tersedia atas permintaan), " +
                "dan parkir mandiri gratis tersedia di lokasi.Nikmati kenyamanan rumah Anda sendiri " +
                "di salah satu dari 100 kamar berpenyejuk udara yang dilengkapi dengan lemari es dan televisi LED." +
                " Akses Internet nirkabel gratis tersedia untuk menjamin koneksi Anda; Untuk hiburan, satelit disediakan. " +
                "Kamar mandi pribadi dengan shower memiliki perlengkapan mandi gratis dan sandal. " +
                "Fasilitas mencakup brankas dan meja tulis, dan layanan pembenahan kamar disediakan setiap hari.");
        namahotel.add("Hotel Dafam Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/05/0f/7a/49/the-arowana-hotel.jpg");
        infohotel.add(" Suasana dan layanan eksklusif untuk bisnis dan liburan. Berlokasi strategis di pusat kota Pekanbaru," +
                " hotel ini berada di lokasi yang ideal karena kami hanya berjarak 5 menit berjalan kaki ke tempat-tempat " +
                "perbelanjaan utama Mall Pekanbaru, Masjid Raya An-Nur yang terkenal dan kawasan bisnis di " +
                "kawasan jalan Sudirman.\n" +
                "Hotel ini berjarak kurang dari 9 km dari Bandara Internasional Sultan Syarif Kasim II yang dapat dicapai " +
                "dalam waktu 15-20 menit berkendara saja. Hotel Dafam Pekanbaru adalah hotel bintang tiga dengan 107 kamar" +
                " yang menawarkan suasana eksklusif yang cocok untuk keperluan bisnis dan perjalanan keluarga. Kebebasan " +
                "untuk memilih lantai merokok atau bebas rokok merupakan keuntungan bagi para tamu. Beberapa ruang pertemuan " +
                "yang tersedia di hotel menambah lebih banyak pilihan untuk mengadakan acara khusus di sini.");
        namahotel.add("Swiss-Belinn SKA Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/20/75/a6/e1/deluxe-room.jpg");
        infohotel.add(" Swiss-Belinn SKA Pekanbaru merupakan hotel bintang 3 bertaraf international," +
                " terletak di lokasi yang strategis dalam lingkungan Mal ska, sebuah pusat perbelanjaan terkemuka di Pekanbaru," +
                " serta 10 menit dari Bandar Udara Internasional Sultan Syarif Kasim II, memberikan kemudahan akses menuju pusat" +
                " bisnis dan pemerintahan.\n" +
                "Swiss-Belinn SKA Pekanbaru menawarkan akomodasi yang terjangkau dengan fasilitas dan pelayanan yang lengkap. " +
                "Terletak di dalam kompleks pusat perbelanjaan terkemuka, Mall ska, Swiss-Belinn ska Pekanbaru menyediakan" +
                " ragam hiburan, fasilitas belanja dan pilihan restoran.");
        namahotel.add("Aryaduta Pekanbaru ");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/03/85/b4/d2/hotel-ibis-pekanbaru.jpg");
        infohotel.add(" Hotel Aryaduta Pekanbaru menawarkan kamar-kamar classic dan fasilitas rekreasi terbaik yang " +
                "mencakup lapangan tenis, pusat kebugaran, dan kolam renang lanskap yang besar. Terletak di jantung kota " +
                "Pekanbaru, hotel ini menyediakan Wi-Fi gratis di area umum dan kamar Anda. Kamar-kamar ber-AC-nya memadukan " +
                "desain kontemporer dengan aksen Indonesia. Semua kamar dilengkapi dengan fasilitas modern seperti TV satelit" +
                " dan minibar. Anda dapat menikmati kenyamanan area tempat duduk dan lantai berkarpet. Kamar mandi pribadinya" +
                " memiliki perlengkapan mandi dan shower air panas. Untuk melepas lelah, Aryaduta Hotel menawarkan layanan " +
                "pijat dan memiliki lapangan sepak bola mini. Hotel ini menyediakan layanan pramutamu dan antar-jemput " +
                "bandara untuk kenyamanan Anda. Tempat parkir di hotel tersedia gratis. Santapan sepanjang hari dengan" +
                " berbagai macam hidangan Asia dan internasional tersedia di Tirta Ayu Restaurant, yang juga menawarkan " +
                "layanan kamar 24 jam. Nikmati spesialisasi steak dan teh sore dalam suasana santai di Arya Lounge. " +
                "Terletak di kawasan pusat pemerintahan di Pekanbaru, Hotel Aryaduta Pekanbaru berjarak 15 menit " +
                "berkendara dari Bandara Sultan Syarif Kasim II.");
        namahotel.add("Hotel Pangeran");
        fotohotel.add("https://media-cdn.tripadvisor.com/media/photo-s/03/6a/95/d6/hotel-pangeran.jpg");
        infohotel.add("Hotel Pangeran menawarkan layanan concierge dan layanan kamar, sehingga pengalaman menginap " +
                "Anda lebih spesial. Properti juga menyediakan kolam renang dan lounge. Jika Anda mengemudi ke Hotel " +
                "Pangeran, parkir gratis tersedia.\n" +
                "\n" +
                "Pada saat di Pekanbaru jangan lupa menikmati hidangan thai di Abege Cafe atau Khun Aroy.\n" +
                "\n" +
                "Jika Anda mencari hal yang dapat dilakukan, Masjid Al-Falah Darul Muttaqin (0,7 km) " +
                "dan Monumen Perjuangan Rakyat Riau (1,6 km) merupakan ide yang bagus untuk menghabiskan waktu, " +
                "dan dapat dicapai dengan berjalan kaki dari Hotel Pangeran.\n" +
                "\n" +
                "Hotel Pangeran menampilkan yang terbaik dari Pekanbaru dalam genggaman tangan anda, " +
                "membuat masa menginap anda semakin sempurna. ");
        prosesrecyclerView();
    }

}