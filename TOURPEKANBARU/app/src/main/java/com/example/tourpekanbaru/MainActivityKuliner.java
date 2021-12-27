package com.example.tourpekanbaru;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivityKuliner extends AppCompatActivity {
    private ArrayList<String> fotokuliner= new ArrayList<>();
    private ArrayList<String> namakuliner=new ArrayList<>();
    private ArrayList<String> infokuliner=new ArrayList<>();
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kuliner);
        getDataFromInternet();
    }
    private void prosesrecyclerView(){

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecyclerViewAdapterKuliner adapter=new RecyclerViewAdapterKuliner(fotokuliner,namakuliner,infokuliner,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){
        namakuliner.add("Kimteng");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Kimteng.jpg");
        infokuliner.add("Pernahkah mendengar tagline, belum ke Pekanbaru kalau belum ke Kimteng? Rasanya hal ini benar adanya karena kedai ini sangat legendaris karena berdiri sejak 5 tahun sejak merdekanya Indonesia. Kedai ini menjadi salah satu kedai kopi legendaris di kota Madani ini. Mengenai rasa tidak perlu diragukan karena itu menjadi bukti masih banyak pengunjung yang ke tempat ini. Bukan hanya soal rasa, tempat yang telah memiliki cabang lain ini mematok hanya yang murah.\n" +
                "\n" +
                "Kedai legendaris bukan berarti tidak dapat mengikuti perkembangan zaman, Kimteng telah memperluas jangkauannya dengan membuka sekitar 6 cabang. Beberapa cabang berada di pusat perbelanjaan sehingga mampu menjangkau masyarakat modern saat ini. Menu andalan di tempat ini adalah roti bakar selai srikaya yang dipadu dengan secangkir kopi. Menu berat yang dapat kamu cicipi, yaitu mie yamin, dimsum, bubur ayam, mie ayam, dan lain lain.\n" +
                "\n" +
                "Lokasi: Jl. Senapelan No 22 A-B-C, Kampung Bandar, Kec. Senapelan, Kota Pekanbaru.");

        namakuliner.add("Kedai Kopi Indah Ria");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Kedai-Kopi-Indah-Ria.jpg");
        infokuliner.add("Ingin sarapan di kedai kopi dengan menu yang khas Melayu? Kedai satu ini sangat cocok untuk awali pagi lebih baik dengan seduhan kopi yang sangat enak. Teman minum kopi yang ada, antara lain nasi lemak, kwetiau goreng, mie pangsit, dan masih banyak menu lainnya. Menu yang wajib kamu coba adalah kwetiau goreng karena dipadukan dengan udang dan telur, tetapi harganya sangat terjangkau. Awali sarapanmu di kota Pekanbaru dengan rasa yang luar biasa.\n" +
                "\n" +
                "Lokasi: Jl. Ir. H. Juanda No.108, Kampung Dalam, Kec. Senapelan, Kota Pekanbaru.");

        namakuliner.add("Soto Bude Cemara");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Soto-Bude-Cemara.jpg");
        infokuliner.add("Menjadi salah satu makanan legendaris yang ada di Pekanbaru, soto Bude Cemara tetap digemari hingga saat ini. Kuliner legendaris ini telah berdiri sekitar 70 tahun, sehingga usaha ini telah dijalankan secara turun temurun. Tidak hanya itu, resep yang dipakai juga tetap dipegang teguh, sehingga rasanya tidak pernah berubah. Suasana rumah makan ini seperti berada di rumah dan jalannya tidak terlalu lebar, sehingga area parkir mobil cukup jauh di jalan utama.\n" +
                "\n" +
                "Konsep yang diusung adalah makanan rumahan agar para pengunjung nyaman dan betah. Oleh karena itu, makanan yang ditawarkan juga hanya satu jenis yaitu soto. Cara penyajian soto ini dengan suwiran ayam, tauge, bawang goreng, dan terakhir disiram kuah yang gurih serta sedap. Soto juga disajikan dengan bihun dan sayuran serta paduan kuah bening yang sangat segar. Jika kamu ingin tambah nasi, maka harus membayar lebih karena tidak dijual satu paket.\n" +
                "\n" +
                "Lokasi: Jl. Ronggo Warsito No.55, Kel. Suka Maju, Kec. Sail, Kota Pekanbaru.");

        namakuliner.add("Rujak Aniu Teng Teng");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Rujak-Aniu-Teng-Teng.jpg");
        infokuliner.add("Bagi para pecinta paduan rasa manis dan pedas dari rujak dengan bahan utama buah, tempat ini wajib dikunjungi. Pekanbaru memiliki rekomendasi rujak terbaik karena bahan yang dipakai juga pasti segar dan rasanya tidak pernah berubah sejak 40 tahun lalu. Buah yang dipakai, yaitu semangka, nangka, nanas, bengkuang, pepaya, melon, dan beberapa buah lainnya. Yang unik, kamu dapat memilih paket mini atau paket jumbo dengan jumlah buah yang lebih banyak.\n" +
                "\n" +
                "Lokasi: Jl. Dr. Sam Ratulangi No.33, Sago, Kec. Senapelan, Kota Pekanbaru.");

        namakuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Nasi-Kapau-Asli.jpg");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Nasi-Kapau-Asli.jpg");
        infokuliner.add("Rumah makan satu ini memberikan rekomendasi untuk makan berat yang sangat enak untuk masyarakat lokal ataupun luar kota. Kamu yang datang ke Pekanbaru wajib berkunjung ke rumah makan Nasi Kapau Asli ini. Cita rasa dari masakannya mampu menggoyang lidah banyak orang dan tidak berubah sejak 70 tahun lalu. Penggemarnya tidak pernah kecewa karena harganya sangat terjangkau dan dipastikan kamu tidak akan puas dengan satu porsi.\n" +
                "\n" +
                "Menu andalannya adalah rendang yang dibandrol dengan harga mulai dari 20 ribu rupiah. Makan siangmu akan lebih lengkap jika ditambah dengan kerupuk jangek yang disiram dengan kuah santan yang kental. Kuah ini juga menjadi kunci cita rasa yang enak karena banyaknya rempah rempah yang dipakai. bagi para pecinta pedas, telah tersedia sambal merah di setiap meja pelanggan. Seporsi nasi rendang ini dapat membuatmu nambah nasi terus menerus.\n" +
                "\n" +
                "Lokasi: Jl. Umban Sari, Umban Sari, Kec. Rumbai, Kota Pekanbaru.");

        namakuliner.add("Sate Cun");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/Sate-Cun.jpg");
        infokuliner.add("Telah beroperasi sejak tahun 1978 membuat sate padang cun ini ramai oleh pembeli setiap harinya. Tidak hanya itu, rasa yang ditawarkan tidak pernah berubah dan tetap memakai arang untuk membakar setiap satenya. Terdapat dua menu yang mampu menggoyang lidahmu, yaitu daging dan lidah. Satu porsi dibandrol dengan harga yang sangat terjangkau dan satu paket dengan kerupuk cabe. Kerupuk cabe yang disajikan sebagai pelengkap ini juga disiram dengan bumbu sate.\n" +
                "\nLokasi: Lembah Damai, Kec. Rumbai Pesisir, Kota Pekanbaru.");
        namakuliner.add("RM Inyiak Sanang");
        fotokuliner.add("https://www.libur.co/wp-content/uploads/2020/08/RM-Inyiak-Sanang.jpg");
        infokuliner.add("Makanan legendaris yang satu ini juga telah lama berdiri di kota Madani dan tetap ramai dikunjungi. Menu yang paling banyak dipesan, yaitu dendeng bakar batokok dan soto minang. Soto minang dijual sudah satu paket dengan nasi, sehingga harganya tergolong terjangkau. Jika kamu ingin menu yang awet dan dapat dijadikan oleh oleh, dendeng batokok adalah pilihan tepat. Dikemas dengan sangat aman, sehingga bisa bertahan hingga berhari hari.\n" +
                "\n" +
                "Lokasi: Jl. Yos Sudarso, Limbungan Baru, Kec. Rumbai Pesisir, Kota Pekanbaru.");

        namakuliner.add("Pondok Gurih");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekanbaru-1-Seputar-Riau.jpg");
        infokuliner.add("Hampir semua wisatawan yang berkunjung menjadikan Pondok Gurih sebagai tempat makan di Pekanbaru yang wajib dikunjungi. Pondok Gurih menawarkan beragam sajian menu khas nusantara.\n" +
                "\n" +
                "Nama yang terkenal dan harganya yang sangat murah hingga sekarang tetap membuatnya menjadi destinasi wisata kuliner favorit para pelancong yang berkunjung ke Pekanbaru.\n" +
                "\n" +
                "Lokasi: Jln. Jendral Sudirman No. 202, Kota Pekanbaru 28113, Indonesia\n" +
                "Jam Operasional: Senin-Minggu 10.30 – 22.00\n" +
                "Kisaran Harga: Mulai Rp 3.000 – Rp 70.000");

        namakuliner.add("Rumah Makan Pondok Asam Pedas Baung");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekanbaru-2-FULL-RIAU.jpg");
        infokuliner.add("Berkunjung ke Kota Pekanbaru rasanya takkan lengkap bila belum mencicipi menu khas Pekanbaru satu ini. Maka dari itu, RM Pondok Asam Pedas Baung menjadi destinasi jitu untuk merasakan resep-resep tradisional ala Melayu. RM Pondok Asam Pedas Baung menyajikan aneka jenis citarasa masakan Melayu yang kaya akan bumbu rempah-rempah.\n" +
                "\n" +
                "Lokasi: Jl. Jend Sudirman, Kota Pekanbaru, Indonesia\n" +
                "Jam Operasional: Senin-Minggu 10.30-22.00\n" +
                "Kisaran Harga: Mulai Rp 3.000 – Rp 130.000");

        namakuliner.add("Rumah Makan Padang Kota Buana\n");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekanbaru-3-Wikipedia.jpg");
        infokuliner.add("Kamu pecinta kuliner pedas? Tenang, Pekanbaru punya jawaban untuk kebutuhanmu akan makanan penggoyang lidah, yaitu “RM Padang Kota Buana”! RM Kota Buana menawarkan aneka varian menu masakan Minang yang dipadukan dengan citarasa lokal khas Melayu. Soal kepedasan, bisa dijamin, destinasi wisata kuliner di Pekanbaru satu ini tidak akan mengecewakan para pecinta kuliner pedas.\n" +
                "\n" +
                "Lokasi: Jl. HOS. Cokroaminoto No. 16, Sukaramai, Pekanbaru Kota, Kota Pekanbaru, Riau 10350\n" +
                "Jam Operasional: Senin-Minggu 06.30 – 20.30\n" +
                "Kisaran Harga: Mulai Rp 15.000");

        namakuliner.add("Bakmie Api Vs Sambel Api");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/Wisata-kuliner-pekanbaru-4-Bertuah-Pos.jpg");
        infokuliner.add("Kata “api” dimaksudkan pada api yang terdapat di dalam kuali memasak. Cara memasak unik itulah yang membuat kata Api disematkan pada nama salah satu tempat makan di Pekanbaru populer satu ini.\n" +
                "\n" +
                "Soal “Sambel Api”, ada 2 makna berbeda. Selain itu, kata “Api” di sini juga mengacu pada rasanya yang luar biasa pedas. Mengetahui keranjingan warga Pekanbaru akan hidangan pedas, maka destinasi wisata kuliner Pekanbaru ini menghadirkan Sambel Api yang super pedas untuk memanjakan selera Toppers akan rasa pedas\n" +
                "\n" +
                "Lokasi: Jalan Sisingamangaraja No.67, Kota Pekanbaru, Riau 28156\n" +
                "Jam Operasional: Senin – Minggu 11.00 – 23.00\n" +
                "Kisaran Harga: Mulai Rp 10.000");

        namakuliner.add("Mr. Brewok Dining Room");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekanbaru-5-Xplora.jpg");
        infokuliner.add("Hal yang menjadikan Mr. Brewok tujuan wisata kuliner populer di Pekanbaru adalah dekorasi restaurant yang unik, penuh dengan ciri khas ala lelaki macho dengan berbagai ilustrasi brewok, kumis, serta janggut. Resto di Pekanbaru ini sangat cocok untuk mereka yang ingin berlama-lama, sejenak santai menikmati suasana Kota Pekanbaru.\n" +
                "\n" +
                "Lokasi: Jl. Jenderal Sudirman No.321, Cinta Raja, Sail, Kota Pekanbaru, Riau 28128\n" +
                "Jam Operasional: Senin – Minggu 11.00 – 23.00\n" +
                "Kisaran Harga: Mulai Rp 10.000 – Rp 50.000");

        namakuliner.add("Putu Bambu");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekanbaru-8-Infomakan.jpg");
        infokuliner.add("Putu adalah kue kukus tradisional yang berbahan dasar beras. Cemilan tradisional ini sampai sekarang masih bertahan sebagai salah satu jajanan pasar favorit masyarakat. Di Pekanbaru, Putu Bambu inilah yang paling terkenal sebagai salah satu destinasi wisata kuliner di Pekanbaru favorit pelancong.\n" +
                "\n" +
                "Lokasi: Simpang Jalan Melur – Jalan Cempaka, Sukajadi, Kota Pekanbaru, Riau\n" +
                "Jam Operasional: Senin – Minggu 17.00 – 23.00\n" +
                "Kisaran Harga: Mulai Rp 5.000");
        namakuliner.add("Klapper Pie");
        fotokuliner.add("https://ecs7.tokopedia.net/blog-tokopedia-com/uploads/2018/07/wisata-kuliner-pekan-baru-10-Ombolot.jpg");
        infokuliner.add("Tidak jauh dari cake, tempat kuliner Pekanbaru lain yang menyajikan jajanan manis adalah Klapper Pie. Di Klapper Pie tersedia segala jenis klappertaart serta berbagai jenis pie yang enak. Ukuran kecilnya sangat cocok untuk traveling, pas untuk dijadikan oleh-oleh.\n" +
                "\n" +
                "Lokasi: Jl. Sumatera No.66 dan SPBU Hang Tuah (depan BRI), Kota Pekanbaru, Riau\n" +
                "Jam Operasional: Senin – Minggu 07.00 – 21.00\n" +
                "Kisaran Harga: Mulai Rp 6.000");
        namakuliner.add(" Rumah Makan Koki Sunda");
        fotokuliner.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/09/koki-sunda-restauran-pekanbaru.jpg");
        infokuliner.add("Berdasarkan namanya, rumah makan ini menyediakan berbagai macam masakan Sunda yang cocok dinikmati bersama keluarga. Tempat makan keluarga di Pekanbaru ini menyediakan berbagai macam olahan seafood, sayuran, daging, dan olahan nikmat lainnya.\n" +
                "\n" +
                "Rumah Makan Koki Sunda berada di Tengkerang Tengah, Marpoyan Damai, Kota Pekanbaru, Riau. Rumah Makan Koki Sunda ini merupakan tempat makan keluarga di Pekanbaru yang cukup populer. Selain tempatnya yang sangat nyaman, rumah makna ini terjamin cita rasa olahan Sundanya.");
        namakuliner.add("Kampung Bakaran (Teras Kayu Resto)");
        fotokuliner.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/09/kampung-bakaran-teras-kayu-resto.jpg");
        infokuliner.add("Tempat makan keluarga di Pekanbaru ini termasuk tempat makan yang baru saja hadir di Kota Pekanbaru dan beralamat di Jl. HR. Soebrantas di simpang Jl. Marsan Sejahtera. Meskipun tergolong baru, tetapi tempat makan ini juga menjadi salah satu resto yang populer di Pekanbaru.\n" +
                "Tempat makan ini menyediakan berbagai macam menu yang lezat. Harga yang dipatok juga sangat terjangkau, yaitu mulai dari Rp 15.000 kita bisa mendapatkan nasi putih, lalapan, aneka sambel sesuai selera, dan berbagai macam lauk yang bisa kita pilih, seperti lele bakar, lel goreng, ikan kembung crispy, dan ikan kembung bakar.");

        namakuliner.add("Sky Garden Lounge and Resto");
        fotokuliner.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/09/sky-garden-lounge-and-resto.jpg");
        infokuliner.add("Sky Garden Lounge and Resto berhasil menjadi salah satu tempat makan keluarga di Pekanbaru yang sangat populer karena menyuguhkan arsitektur tempat makan yang sangat unik. Lokasinya yang berada di lantai 12 Apartemen The Peak Jalan Ahmad Yani, Sky Garden Lounge and Resto juga menyuguhkan pemandangan Kota Pekanbaru yang sangat indah jika dilihat dari ketinggian.\n" +
                "\n" +
                "Selain konsep tempat makan yang indah, Sky Garden Longue and Resto menyediakan berbagai macam menu makanan yang lezat. Pengunjung dapat memilih menu makanan mulai dari masakan lokal, westren, chinese, dan lainnya. Mulai dari makanan-makanan sehat hingga berbagai macam cita rasa kopi dapat dinikmati di Sky Garden Lounge and Resto ini.");
        namakuliner.add("Klapper Pie Pekanbaru");
        fotokuliner.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/09/klapper-pie-pekanbaru.jpg");
        infokuliner.add("Beralamat di Jl. Kinibalu, No. 3/5, Sekip, Lima Puluh, Kota Pekanbaru, Riau, Klapper Pie menjadi salah satu tempat makan keluarga di Pekanbaru yang sangat enak dan populer. Hal ini terbukti dari konsumennya yang tidak hanya berasal dari Kota Pekanbaru, tetapi juga berasal dari luar kota yang setia datang ke Klapper Pie.\n" +
                "\n" +
                "Menu yang paling populer dan disukai oleh konsumen adalah klapper pie dengan berbagai macam topping, seperti buah, coklat, keju, kacang almond, coklat pisang, coklat kacang, apple pie, coklat strawberry, dan blueberry cheese. Selain klapper pie yang sangat lezat, harga yang terjangkau juga menjadi salah satu alasan pengunjung untuk datang kembali.");
        namakuliner.add("Rumah Makan Serba Nikmat");
        fotokuliner.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/09/rumah-makan-serba-nikmat.jpg");
        infokuliner.add("Tempat makan keluarga di Pekanbaru ini berada di Jl. Riau No. 147 Pekanbaru, Riau. Menu andalan Rumah Makan Serba Nikmat ini adalah gurami bakar yang diolah dengan berbagai macam jenis masakan, seperti gurami bakar santan, gurami bakar cabai, dan gurami bakar lada hitam.\n" +
                "10. Mie Ayam Pakde\n" +
                "\n" +
                "Tempat makan keluarga di Pekanbaru yang sangat populer adalah Mie Ayam Pakde. Tempat makan di Pekanbaru ini tekenal dengan olahan mie yang sangat lezat dan cocok untuk menjadi tujuan makan bersama keluarga. Terkenal dengan bumbu gurih dan mie yang kenyal, tempat makan ini tak pernah sepi pengunjung.");
        namakuliner.add(" Krema Koffie");
        fotokuliner.add("https://kulinerkota.com/wp-content/uploads/2020/04/Krema-Koffie.jpg");
        infokuliner.add("Cari tempat makan di Samarinda yang cocok untuk nongkrong? Kamu bisa datang ke Krema Koffie. Merupakan pilihan tempat makan sekaligus nongkrong bersama teman dan pasangan dengan suguhan berbagai camilan serta variasi kopi bercita rasa nikmat. Tidak hanya itu, konsep tempat yang cozy bakal bikin kamu betah berlama-lama berada di tempat ini. Tempat ini bisa jadi tujuan ngopi cantik sekaligus menikmati suasana malam dan kulineran saat di Pekanbaru. Tertarik untuk nongkrong di tempat ini?\n" +
                "\n" +
                "Alamat: Jalan Gardenia No.24C, Harjosari, Kec. Sukajadi, Kota Pekanbaru\n" +
                "Jam Buka: 07.00 – 23.30 WIB\n" +
                "Harga: Sekitar Rp25.000");

        namakuliner.add(" Local Pantry Cafe Pekanbaru");
        fotokuliner.add("https://kulinerkota.com/wp-content/uploads/2020/04/Local-Pantry-Cafe-Pekanbaru.jpg");
        infokuliner.add("Tidak hanya itu, suasana tempat yang nyaman bakal bikin kamu betah berlama-lama berwisata kuliner disini. Selain itu tempatnya yang strategis memudahkanmu untuk menemukan tempat makan satu ini. Tertarik mampir untuk makan siang disini?\n" +
                "\n" +
                "Alamat: Komplek Riau Business Center Blok C-3 No. 11-12a, Jl. Riau, Air Hitam, Pekanbaru\n" +
                "Jam Buka: 08.00 – .00.00 WIB\n" +
                "Harga: Mulai Rp20.000");







        prosesrecyclerView();
    }
}