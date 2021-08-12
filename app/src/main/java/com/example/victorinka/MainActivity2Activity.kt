package com.example.victorinka

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.victorinka.databinding.MainActivity2Binding
import javax.security.auth.DestroyFailedException
import kotlin.system.exitProcess

class MainActivity2Activity : AppCompatActivity() {
    lateinit var binding: MainActivity2Binding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var count=0
        var intent = intent.getLongExtra("1",0)

        binding.balli.text= intent.toString()


        binding.cnopk1.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zvuk)
            mediaPlayer.start()

           binding.balli.visibility = TextView.GONE
            binding.Voprosy.visibility = TextView.GONE
            binding.dopmenu.visibility = LinearLayout.VISIBLE
            binding.anima.visibility = View.GONE
            binding.cnop3.setEnabled(false)
            binding.cnop2.setEnabled(false)
        }
        binding.cnop2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zvuk)
            mediaPlayer.start()
            binding.balli.visibility = TextView.GONE
            binding.Voprosy.visibility = TextView.GONE
            binding.dopmenu.visibility = LinearLayout.VISIBLE
            binding.anima.visibility = View.GONE
            binding.cnopk1.setEnabled(false)
            binding.cnop3.setEnabled(false)
        }
        binding.cnop3.setOnClickListener {
        intent+=500
            binding.balli.text=intent.toString()


            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("1", binding.balli.text.toString().toULong())
            startActivity(intent)
        }

        binding.newPlay.setOnClickListener {
            var intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

            binding.exit.setOnClickListener {
                finishAffinity()

            }



        }
        }

private fun Intent.putExtra(s: String, toULong: ULong) {

}





