package com.seliimyilmaaz.landmarkkotlin

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.seliimyilmaaz.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        var view = binding.root
        landmarkList = ArrayList()

        var kizKulesi = Landmark("Kız Kulesi", "The Maiden's Tower, also known as Leander's Tower since the medieval Byzantine period, is a tower on a small islet at the southern entrance of the Bosphorus strait, 200 m from the coast of Üsküdar in Istanbul, Turkey. The tower appeared on the reverse of the Turkish 10 lira banknote from 1966 to 1981",R.drawable.kizkulesi)

        val topkapiSarayi = Landmark(
            "Topkapı Sarayı",
            """
                  Topkapı Sarayı, İstanbul Sarayburnu'nda, Osmanlı İmparatorluğu'nun 600 yıllık tarihinin 400 yılı boyunca, devletin idare merkezi olarak kullanılan ve Osmanlı padişahlarının yaşadığı saraydır.Bir zamanlar içinde 4.000'e yakın insan yaşamıştır.
                  
                  Topkapı Sarayı Fatih Sultan Mehmed tarafından 1478’de yaptırılmış, Abdülmecid’in Dolmabahçe Sarayı’nı yaptırmasına kadar yaklaşık 380 sene boyunca devletin idare merkezi ve Osmanlı padişahlarının resmi ikâmetgâhı olmuştur. Kuruluş yıllarında yaklaşık 700.000 m²'lik bir alanda yer alan sarayın bugünkü alanı 80.000 m²'dir.
                  """.trimIndent(), R.drawable.topkapisarayi
        )


        val sultanAhmet = Landmark(
            "Sultanahmet Camii",
            "Sultan Ahmet Camii veya Sultânahmed Camiî, 1609-1617 yılları arasında Osmanlı Padişahı I. Ahmed tarafından İstanbul'daki tarihî yarımadada, Mimar Sedefkâr Mehmed Ağa'ya yaptırılmıştır.[1] Cami mavi, yeşil ve beyaz renkli İznik çinileriyle bezendiği için ve yarım kubbeleri ve büyük kubbesinin içi de yine mavi ağırlıklı kalem işleri ile süslendiği için Avrupalılarca \"Mavi Camii (Blue Mosque)\" olarak adlandırılır. Ayasofya'nın 1935 yılında camiden müzeye dönüştürülmesiyle, İstanbul'un ana camii konumuna ulaşmıştır.",
            R.drawable.sultanahmet
        )
        val galata = Landmark(
            "Galata Kulesi",
            "Galata Kulesi ya da müze olarak kullanılmaya başlaması sonrasındaki adıyla Galata Kulesi Müzesi, Türkiye'nin İstanbul şehrinin Beyoğlu ilçesinde bulunan bir kuledir. Adını, bulunduğu Galata semtinden alır. Galata Surları dahilinde bir gözetleme kulesi olarak inşa edilen kule, farklı dönemlerde farklı amaçlarla kullanılmasının ardından günümüzde, bir sergi mekânı ve müze olarak hizmet verir. Hem Beyoğlu'nun hem de İstanbul'un sembol yapılarındandır.",
            R.drawable.galata
        )

        landmarkList.add(kizKulesi)
        landmarkList.add(sultanAhmet)
        landmarkList.add(topkapiSarayi)
        landmarkList.add(galata)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdepter = LandMarkAdepter(landmarkList)
        binding.recyclerView.adapter = landMarkAdepter

        setContentView(view)
    }
}