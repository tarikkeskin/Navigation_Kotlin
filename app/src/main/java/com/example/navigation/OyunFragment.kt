package com.example.navigation

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs


class OyunFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_oyun, container, false)

        val bundle: OyunFragmentArgs by navArgs()

        //val gelenKisi = bundle.kisi

        //Log.e("Debug",gelenKisi.ad+" "+gelenKisi.no)

        return tasarim
    }


}