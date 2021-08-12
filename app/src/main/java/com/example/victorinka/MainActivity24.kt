package com.example.victorinka

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.victorinka.databinding.ActivityMain24Binding

class MainActivity24 : AppCompatActivity() {
    lateinit var binding: ActivityMain24Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain24Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent.getLongExtra("1",0)
        binding.balli.text= intent.toString()

        binding.cnop3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zvuk)
            mediaPlayer.start()
            binding.balli.visibility = TextView.GONE
            binding.Voprosy.visibility = TextView.GONE
            binding.dopmenu.visibility = LinearLayout.VISIBLE
            binding.anima.visibility = View.GONE
            binding.cnopk1.setEnabled(false)
            binding.cnop2.setEnabled(false)
        }
        binding.cnop2.setOnClickListener {
            intent+=500
            binding.balli.text=intent.toString()
            val intent = Intent(this, MainActivity25::class.java)
            intent.putExtra("1", binding.balli.text.toString().toLong())
            startActivity(intent)
        }
        binding.cnop2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zvuk)
            mediaPlayer.start()
            binding.balli.visibility = TextView.GONE
            binding.Voprosy.visibility = TextView.GONE
            binding.dopmenu.visibility = LinearLayout.VISIBLE
            binding.anima.visibility = View.GONE
            binding.cnop3.setEnabled(false)
            binding.cnopk1.setEnabled(false)
        }
        binding.newPlay.setOnClickListener {
            var intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        binding.exit.setOnClickListener {
            finishAffinity()

        }
    }
}