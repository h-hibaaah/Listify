package com.hibba.listify

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val bottomnav = findViewById<BottomNavigationView>(
            R.id.bottomNavigationView
        )

        if (savedInstanceState == null) {
            val home_frag = Home()

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment, home_frag)
                .commit()
        }

        bottomnav.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, Home())
                        .commit()
                    true
                }

                R.id.lists -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, Lists())
                        .commit()
                    true
                }

                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment, Profile())
                        .commit()
                    true
                }

                else -> false
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
        ) { v, insets ->

            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )

            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )

            insets
        }
    }
}