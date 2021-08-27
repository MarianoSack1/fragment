package com.example.fragmento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
var a = true

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verfragmentos(view: View){

        if (a==true){
            supportFragmentManager.beginTransaction()
                .add(R.id.FrameLayoutId, fragmentoUno()).commit()
            a=false
        }else{

            supportFragmentManager.beginTransaction()
                .add(R.id.FrameLayoutId, fragmentoDos()).commit()
            a=true
        }



    }

}

