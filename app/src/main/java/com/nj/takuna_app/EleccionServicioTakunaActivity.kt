package com.nj.takuna_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nj.takuna_app.databinding.ActivityEleccionServicioTakunaBinding

class EleccionServicioTakunaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEleccionServicioTakunaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEleccionServicioTakunaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.viewAvistamiento.setOnClickListener { irAvistamiento() }
    }

    private fun irAvistamiento() {
        val intent = Intent(this, BuscadorAvistamientoActivity::class.java)
        startActivity(intent)
    }
}