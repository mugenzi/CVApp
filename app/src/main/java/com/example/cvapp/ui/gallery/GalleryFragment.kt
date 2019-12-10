package com.example.cvapp.ui.gallery

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
import com.example.cvapp.ui.personal.ContactFragment
import com.example.cvapp.ui.personal.EducationFragment
import com.example.cvapp.ui.personal.PersonalInfoFragment
import com.example.cvapp.ui.personal.WorkFragment


@Suppress("DEPRECATION")
class GalleryFragment : Fragment() {

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
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        fmanager = myContext.supportFragmentManager
        btnHome = root.findViewById(R.id.btnHome) as Button
        btnAboutMe = root.findViewById(R.id.aboutMe) as Button
        btnWork = root.findViewById(R.id.work) as Button

        btnHome.setOnClickListener {
            var toast = Toast.makeText(context, "Home Clicked", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            home()
        }

        btnAboutMe.setOnClickListener {
            var toast = Toast.makeText(context, "Education Clicked", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            education()
        }

        btnWork.setOnClickListener {
            var toast = Toast.makeText(context, "Work Clicked", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            experience()
        }
        home()
        return root
    }

    override fun onAttach(activity: Activity) {
        myContext = activity as FragmentActivity
        super.onAttach(activity)
    }

    private fun home() {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, PersonalInfoFragment())
        tx.commit()
    }

    private fun education() {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, EducationFragment())
        tx.commit()
    }

    private fun experience() {
        tx = fmanager.beginTransaction()
        tx.replace(R.id.frame1, WorkFragment())
        tx.commit()
    }
}