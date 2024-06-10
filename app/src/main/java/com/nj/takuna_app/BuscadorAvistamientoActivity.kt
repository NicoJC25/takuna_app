package com.nj.takuna_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nj.takuna_app.databinding.ActivityBuscadorAvistamientoBinding

class BuscadorAvistamientoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBuscadorAvistamientoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuscadorAvistamientoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()

    }

    private fun initListeners() {
        //Hola
    }
}