package com.nj.takuna_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nj.takuna_app.databinding.ActivityRegistroTakunaBinding

class RegistroTakunaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroTakunaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroTakunaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()

    }

    private fun initListeners() {
        binding.tvIniciarSesion.setOnClickListener { onBackPressed() }
    }
}