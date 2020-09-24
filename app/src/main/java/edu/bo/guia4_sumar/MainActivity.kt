package edu.bo.guia4_sumar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Uno=findViewById<View>(R.id.Uno) as EditText
        var Dos=findViewById<View>(R.id.Dos)as EditText

        var btnSuma=findViewById<View>(R.id.btn_sumar) as Button

        btnSuma.setOnClickListener {
            var res=Uno.text.toString().toInt()+Dos.text.toString().toInt()
            num_result.setText(res.toString())
        }
        but_formulario.setOnClickListener {
            val intent = Intent(this@MainActivity, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}