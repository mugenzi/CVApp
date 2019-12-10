package com.example.cvapp.ui.gallery

import android.app.Activity
import android.app.Person
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
import androidx.lifecycle.ViewModelProviders
import com.example.cvapp.R
import com.example.cvapp.ui.personal.PersonalInfoFragment
import com.example.cvapp.ui.personal.WorkFragment


class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel
    lateinit var fmanager: FragmentManager
    lateinit var tx: FragmentTransaction
    lateinit var myContext: FragmentActivity
    lateinit var btnPersonal: Button
    lateinit var btnEducational: Button
    lateinit var btnWork: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
//        val textView: TextView = root.findViewById(R.id.text_gallery)
        /* galleryViewModel.text.observe(this, Observer {
             //            textView.text = it
         })
         tx = childFragmentManager.beginTransaction()     */

        fmanager = myContext.supportFragmentManager
        btnPersonal = root.findViewById(R.id.personal) as Button
        btnEducational = root.findViewById(R.id.education) as Button
        btnWork = root.findViewById(R.id.work) as Button

        btnPersonal.setOnClickListener {
            var toast = Toast.makeText(context, "Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            personal(it) // Call to set the Date from DataPicker
        }

        btnEducational.setOnClickListener {
            var toast = Toast.makeText(context, "Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            education(it) // Call to set the Date from DataPicker
        }

        btnWork.setOnClickListener {
            var toast = Toast.makeText(context, "Clicked", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
            work(it) // Call to set the Date from DataPicker
        }

        return root
    }

    override fun onAttach(activity: Activity) {
        myContext = activity as FragmentActivity
        super.onAttach(activity)
    }

    private fun personal(view: View) {
        tx = fmanager.beginTransaction()
        //tx.add(R.id.frame1, GalleryFragment())
        // Commit the fragment transaction
        //tx.commit()
        tx.replace(R.id.frame1, PersonalInfoFragment())
        tx.commit()
    }

    private fun education(view: View) {
        tx = fmanager.beginTransaction()
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1, WorkFragment())
        tx.commit()
    }

    fun work(view: View) {
        tx = fmanager.beginTransaction()
        // when the user selects the Home button, we are replacing the HomeFragment
        tx.replace(R.id.frame1, WorkFragment())
        tx.commit()
    }


}