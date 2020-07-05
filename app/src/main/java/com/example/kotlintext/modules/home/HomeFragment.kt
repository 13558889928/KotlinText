package com.example.kotlintext.modules.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kotlintext.R
import com.example.kotlintext.base.BaseFragment

/**
 * @author YQL
 * @date :2020/7/2 17:18
 * @description:
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(activity, "首页", Toast.LENGTH_SHORT).show()
        val root: View? = inflater.inflate(R.layout.fragment_home, container, false)
        return root ?: super.onCreateView(inflater, container, savedInstanceState)
    }
}