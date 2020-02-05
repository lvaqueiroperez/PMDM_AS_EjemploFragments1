package com.ejemploapp2.ejemplofragments1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {
    //CREAMOS UN LATEINIT, QUE ES UNA VARIABLE A LA QUE SE LE PONDRÁ UN VALOR MÁS TARDE
    lateinit var textView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //CAMBIAMOS ESTE RETURN POR EL DEL TUTORIAL
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.first_fragment, container, false)
    }
    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.first_fragment_text)
        textView.text = "1st Fragment"

    }



}



