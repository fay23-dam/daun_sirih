package com.example.sispak_kel_9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class daftar_penyakit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_penyakit);

        // Bercak Daun Sirih
        TextView bercakdaunsirih = findViewById(R.id.bercakdaunsirih);
        bercakdaunsirih.setText("" +
                "Bercak Daun Sirih adalah penyakit tanaman yang disebabkan oleh infeksi jamur Cercospora spp. " +
                "atau patogen serupa yang menyerang daun. Penyakit ini biasanya ditandai dengan bercak coklat atau hitam pada daun, " +
                "yang lama-kelamaan dapat menyebabkan daun menguning, mengering, dan rontok.\n\n" +
                "Penyebab:\n" +
                "- Infeksi jamur Cercospora spp.\n" +
                "- Kondisi kelembapan tinggi.\n\n" +
                "Cara Mengatasi:\n" +
                "- Pangkas daun yang terinfeksi dan buang dengan cara dibakar.\n" +
                "- Semprotkan fungisida berbahan aktif mancozeb atau chlorothalonil.\n" +
                "- Pastikan sirkulasi udara yang baik di sekitar tanaman.");

        // Layu Bakteri
        TextView layubakteri = findViewById(R.id.layubakteri);
        layubakteri.setText("" +
                "Layu Bakteri adalah penyakit yang disebabkan oleh bakteri Ralstonia solanacearum. " +
                "Penyakit ini menyerang sistem vaskular tanaman, menyebabkan daun layu secara tiba-tiba meskipun tanah cukup lembap.\n\n" +
                "Penyebab:\n" +
                "- Infeksi bakteri Ralstonia solanacearum.\n" +
                "- Drainase tanah yang buruk.\n\n" +
                "Cara Mengatasi:\n" +
                "- Lakukan rotasi tanaman untuk mengurangi risiko infeksi.\n" +
                "- Cabut dan musnahkan tanaman yang terinfeksi.\n" +
                "- Gunakan bakterisida berbahan aktif streptomisin sesuai dosis.");

        // Busuk Pangkal Batang
        TextView busukpangkalbatang = findViewById(R.id.busukpangkalbatang);
        busukpangkalbatang.setText("" +
                "Busuk Pangkal Batang adalah penyakit yang disebabkan oleh jamur Fusarium oxysporum. " +
                "Penyakit ini menyerang pangkal batang tanaman, menyebabkan busuk yang berwarna coklat kehitaman dan sering kali menimbulkan bau busuk.\n\n" +
                "Penyebab:\n" +
                "- Infeksi jamur Fusarium oxysporum.\n" +
                "- Kondisi tanah yang terlalu basah.\n\n" +
                "Cara Mengatasi:\n" +
                "- Gunakan fungisida berbahan aktif trichoderma untuk menghambat pertumbuhan jamur.\n" +
                "- Pastikan drainase tanah yang baik untuk mencegah kelembapan berlebih.\n" +
                "- Pangkas bagian tanaman yang terinfeksi dan bakar.");
    }
}
