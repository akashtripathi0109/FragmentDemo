package com.example.fragmentdemo

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class StaticFragment1 : Fragment() {
 lateinit  var v:View


    private  lateinit var btnListner :backPressCall
    private  lateinit var colorLisner :ColorInterface

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v=inflater.inflate(R.layout.fragment_static1, container, false)

            init(container)

        return v
    }




    override fun onAttach(context: Context) {
        super.onAttach(context)
        btnListner=try{
            activity as backPressCall
        }
        catch (e:java.lang.ClassCastException)
        {
            throw java.lang.ClassCastException("class is not cast")

        }


        colorLisner=try{
            activity as ColorInterface
        }
        catch (e:java.lang.ClassCastException)
        {
            throw java.lang.ClassCastException("class is not cast")

        }




    }



    @SuppressLint("SuspiciousIndentation")
    fun init(root:ViewGroup?)
    {
    val b1=v.findViewById<Button>(R.id.sendBtn1)
    val b2=v.findViewById<Button>(R.id.sendBtn2)


        b1.setOnClickListener{
            btnListner.onBackPressCall("Button have been clicked")
            colorLisner.newColor(Color.GREEN)
        }
        b2.setOnClickListener{
            btnListner.onBackPressCall("")

            colorLisner.newColor(Color.WHITE)

        }
    }


}