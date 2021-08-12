package com.example.victorinka

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewCompat.animate
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.victorinka.databinding.AnimBinding
import com.example.victorinka.databinding.MainActivityLayotBinding
import java.util.*
import java.util.logging.Handler as Handler1


class Anima : AppCompatActivity() {
    lateinit var binding: AnimBinding
    var Image: Boolean = false
    lateinit var handler: Handler1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AnimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var zoac = binding.zayac
        zoac.animate().scaleX(1F).scaleY(1F).alpha(1F).rotation(3600F).setDuration(3000)



        Timer().schedule(object : TimerTask() {
            override fun run() {
                var intent = Intent(this@Anima, MainActivity::class.java)
                startActivity(intent)

            }
        }, 5000)

    }
}






