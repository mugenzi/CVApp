package com.example.cvapp.ui.home

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.cvapp.R
import com.example.cvapp.ui.gallery.GalleryViewModel
import com.example.cvapp.ui.personal.AboutMeFragment
import com.example.cvapp.ui.personal.ContactFragment
import com.example.cvapp.ui.personal.PersonalInfoFragment
import com.example.cvapp.ui.personal.WorkFragment


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}