package com.example.fragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() ,backPressCall,ColorInterface{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun newColor(color: Int) {
        var fr = supportFragmentManager.findFragmentById(R.id.fragment2) as  StaticFragmentTwo
        fr.updateColor(color)
    }


    override fun onBackPressCall(msg:String) {
        var fr=supportFragmentManager.
                                     findFragmentById(R.id.fragment2) as StaticFragmentTwo
        fr.onFragmentInteraction(msg)


    }


}