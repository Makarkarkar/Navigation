package com.example.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class ConfirmFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_confirm, container, false)
        val confirm_button = view.findViewById<Button>(R.id.confirm_btn)
        val number = arguments?.getString("number").toString()
        val amount = arguments?.getString("amount").toString()
        view.findViewById<TextView>(R.id.confirm_text).text = "Перевести ${amount} руб.\n на номер ${number}?"
        confirm_button.setOnClickListener {
            findNavController().navigate(
                R.id.action_confirmFragment_to_mainFragment,
                null,
                navOptions {
                    anim {
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        // Inflate the layout for this fragment
        return view
    }

}