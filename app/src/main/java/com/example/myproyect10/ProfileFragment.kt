package com.example.myproyect10
import android.os.Bundle
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ProfileFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root=inflater.inflate(R.layout.fragment_profile,container,false)
        return root
    }
}