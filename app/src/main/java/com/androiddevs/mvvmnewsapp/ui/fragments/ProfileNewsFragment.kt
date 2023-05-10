package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileNewsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileNewsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val ARG_PARAM1 = null
            param1 = it.getString(ARG_PARAM1)
            val ARG_PARAM2 = null
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_news, container, false)
    }

    companion object {

    }
}