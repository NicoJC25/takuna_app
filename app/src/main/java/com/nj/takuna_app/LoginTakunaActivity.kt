package com.nj.takuna_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nj.takuna_app.databinding.ActivityLoginTakunaBinding

class LoginTakunaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginTakunaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginTakunaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
        initUI()
    }

    private fun initListeners() {
        binding.tvOlvidarClave.setOnClickListener {
            //LLevar a pagina para recuperar clave
        }

        binding.tvRegistrarse.setOnClickListener { irRegistro() }
        binding.btnIniciarSesion.setOnClickListener { irEleccion() }
    }

    private fun initUI() {
        //Hola
    }

    private fun irEleccion() {
        val intent = Intent(this, EleccionServicioTakunaActivity::class.java)
        startActivity(intent)
    }


    private fun irRegistro() {
        val intent = Intent(this, RegistroTakunaActivity::class.java)
        startActivity(intent)
    }
}