package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.*
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*


class AnasayfaFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.textView.text = "Helloo"

        tasarim.buttonOyun.setOnClickListener {
            val kisi = Kisi("tarik",234,true)
            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(kisi)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}