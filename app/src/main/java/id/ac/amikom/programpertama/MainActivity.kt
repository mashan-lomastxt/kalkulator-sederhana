package id.ac.amikom.programpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tambah(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.txt_angkapertama)
        val angkaKedua = findViewById<EditText>(R.id.txt_angkakedua)
        val hasil = findViewById<TextView>(R.id.txt_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() + angkaKedua.text.toString().toDouble()

        hasil.text = jumlah.toString()
    }

    fun kurang(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.txt_angkapertama)
        val angkaKedua = findViewById<EditText>(R.id.txt_angkakedua)
        val hasil = findViewById<TextView>(R.id.txt_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() - angkaKedua.text.toString().toDouble()

        hasil.text = jumlah.toString()
    }

    fun bagi(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.txt_angkapertama)
        val angkaKedua = findViewById<EditText>(R.id.txt_angkakedua)
        val hasil = findViewById<TextView>(R.id.txt_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() / angkaKedua.text.toString().toDouble()

        hasil.text = jumlah.toString()
    }

    fun kali(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.txt_angkapertama)
        val angkaKedua = findViewById<EditText>(R.id.txt_angkakedua)
        val hasil = findViewById<TextView>(R.id.txt_hasil)

        val jumlah = angkaPertama.text.toString().toDouble() * angkaKedua.text.toString().toDouble()

        hasil.text = jumlah.toString()
    }

}