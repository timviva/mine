package com.example.myfirsttabbedactivity.Fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.myfirsttabbedactivity.R

class CallsFragment : Fragment() {
    var mbtnClick:Button ?= null




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root= inflater.inflate(R.layout.fragment_calls, container, false)



        mbtnClick=root.findViewById(R.id.MbtnClickme)
        mbtnClick!!.setOnClickListener{
            Toast.makeText(context,"This Button Has been clicked ",Toast.LENGTH_LONG)
        }
        return root
        


    }



}