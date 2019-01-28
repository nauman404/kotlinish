package com.kotlinish.views.fragments

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.kotlinish.R
import com.kotlinish.viewmodels.CurrentDetailsViewModel

class CurrentDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = CurrentDetailsFragment()
    }

    private lateinit var viewModel: CurrentDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CurrentDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
