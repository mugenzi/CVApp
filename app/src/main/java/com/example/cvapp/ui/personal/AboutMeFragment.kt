package com.example.cvapp.ui.personal

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.cvapp.R
import com.example.cvapp.ui.home.HomeFragment
import com.example.cvapp.ui.slideshow.SlideshowViewModel

class AboutMeFragment : Fragment() {
    lateinit var fmanager: FragmentManager
    lateinit var tx: FragmentTransaction
    lateinit var myContext: FragmentActivity
    lateinit var btnHome: Button
    lateinit var btnAboutMe: Button
    lateinit var btnWork: Button
    lateinit var btnContact: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_about_me, container, false)
        fmanager = myContext.supportFragmentManager
        btnHome = root.findViewById(R.id.btnHome) as Button
        btnAboutMe = root.findViewById(R.id.aboutMe) as Button
        btnWork = root.findViewById(R.id.work) as Button
        btnContact = root.findViewById(R.id.contact) as Button

        btnHome.setOnClickListener {
            var toast = Toast.makeText(context, "Home Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            home(it)
        }

        btnAboutMe.setOnClickListener {
            var toast = Toast.makeText(context, "About Me Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            aboutMe(it)
        }

        btnWork.setOnClickListener {
            var toast = Toast.makeText(context, "Work Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            work(it)
        }

        btnContact.setOnClickListener {
            var toast = Toast.makeText(context, "Contact Us Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            contact(it)
        }

        return root
    }

    override fun onAttach(activity: Activity) {
        myContext = activity as FragmentActivity
        super.onAttach(activity)
    }

    private fun home(view: View) {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, HomeFragment())
        tx.commit()
    }

    private fun aboutMe(view: View) {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, AboutMeFragment())
        tx.commit()
    }

    private fun work(view: View) {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, WorkFragment())
        tx.commit()
    }

    private fun contact(view: View) {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, ContactFragment())
        tx.commit()
    }
}