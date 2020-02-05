package com.ejemploapp2.ejemplofragments1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    private val fragmentManager = supportFragmentManager
    //INSTANCIAMOS NUESTROS FRAGMENT:
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //PRIMERO MOSTRAMOS SOLO EL FRAGMENT 1
        /* Display First Fragment initially */
        val fragmentTransaction = fragmentManager.beginTransaction()
        //TENER EN CUENTA EL ID PUESTO EN EL XML
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()

    }

    fun btnOne(v: View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, firstFragment)
        fragmentTransaction.commit()
    }

    fun btnTwo(v:View){
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.myFragment, secondFragment)
        fragmentTransaction.commit()
    }



}
