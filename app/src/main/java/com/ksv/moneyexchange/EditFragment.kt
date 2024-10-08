package com.ksv.moneyexchange

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ksv.moneyexchange.databinding.FragmentEditBinding

class EditFragment : Fragment() {
    private var _binding: FragmentEditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}