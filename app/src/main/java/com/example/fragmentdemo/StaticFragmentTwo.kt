package com.example.fragmentdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView


class StaticFragmentTwo : Fragment() {
    lateinit  var v:View
    lateinit var t:TextView
    lateinit var lyt:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        v=inflater.inflate(R.layout.fragment_static_two, container, false)
        lyt=v.findViewById(R.id.fragment2Lyt)
        return v
    }

    fun onFragmentInteraction(msg:String)
    {
        t=v.findViewById(R.id.fragTxtView)
        t.text = msg
    }

    fun updateColor(color: Int) {
       lyt.setBackgroundColor(color)
    }

}
