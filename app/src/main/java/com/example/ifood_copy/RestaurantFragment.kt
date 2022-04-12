package com.example.ifood_copy

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ifood_copy.databinding.FragmentRestaurantBinding

// vinculou o layout com essa classe logica
class RestaurantFragment : Fragment(R.layout.fragment_restaurant) {

    private var binding: FragmentRestaurantBinding? = null

    private var filters = arrayOf(
        FilterItem("Ordenar"),
        FilterItem("Para retirar"),
        FilterItem("Entrega grátis"),
        FilterItem("Vale-Refeição"),
        FilterItem("Distancia"),
        FilterItem("Entrega Parceira"),
        FilterItem("Super restaurante"),
        FilterItem("Filtros"),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRestaurantBinding.bind(view)

        binding?.let {
            filters.forEach { filter ->
                it.chipGroupFilter.addView(filter.toChip(requireContext()))
            }
        }
    }

}