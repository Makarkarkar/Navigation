package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions


class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val phistory_button = view.findViewById<Button>(R.id.btn_1)
        val payments_button = view.findViewById<Button>(R.id.btn_2)
        val balance_button = view.findViewById<Button>(R.id.btn_3)
        phistory_button.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_historyFragment,
                null,
                navOptions {
                    anim {
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        payments_button.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_paymentsFragment,
                null,
                navOptions {
                    anim{
                        enter = R.anim.slide_in
                        exit = R.anim.fade_out
                    }
                }
            )
        }
        balance_button.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_balanceFragment,
                null,
                navOptions {
                    anim{
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