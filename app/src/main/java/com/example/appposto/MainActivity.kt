package com.example.appposto


import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var precoGas:Float = 0F
    var precoEta:Float = 0F

    fun calcular():Boolean{
        precoGas = edtprecoG.text.toString().toFloat()
        precoEta = edtprecoE.text.toString().toFloat()

        if (precoEta < (precoGas * 0.7) ){
            return true
        }
        else{
            return false
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btn_comp.setOnClickListener {
            if(calcular()){
                img_result.setImageResource(R.drawable.abasteca_etanol)
            }
            else{
                img_result.setImageResource(R.drawable.abasteca_gasolina)
            }
    }


    }
}