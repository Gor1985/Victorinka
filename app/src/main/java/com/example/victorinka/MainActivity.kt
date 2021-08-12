package com.example.victorinka

import android.app.Instrumentation
import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.victorinka.databinding.MainActivityLayotBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: MainActivityLayotBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityLayotBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cnop3 = binding.cnop3 as Button

        var count: Long = 0


        binding.cnopk1.setOnClickListener {

            count = count + 500
            binding.balli.text = "$count"
            val intent = Intent(this, MainActivity2Activity::class.java)
            intent.putExtra("1", count)
            startActivity(intent)
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
            cnop3.setOnClickListener {
                var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.zvuk)
                mediaPlayer.start()
                binding.balli.visibility = TextView.GONE
                binding.Voprosy.visibility = TextView.GONE
                binding.dopmenu.visibility = LinearLayout.VISIBLE
                binding.anima.visibility = View.GONE
                binding.cnopk1.setEnabled(false)
                binding.cnop2.setEnabled(false)
                Log.d("22222", "все ок")
            }



            binding.newPlay.setOnClickListener {
                var intent = Intent(this@MainActivity, MainActivity2Activity::class.java)
                startActivity(intent)
            }

            binding.exit.setOnClickListener {
                finish()
            }
        }
    }










