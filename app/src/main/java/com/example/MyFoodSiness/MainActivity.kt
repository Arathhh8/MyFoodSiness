package com.example.MyFoodSiness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toolbar : ActionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = supportActionBar!!

        val bottomNavigation:BottomNavigationView = findViewById(R.id.btn_nav)

        bottomNavigation.setOnItemSelectedListener{
            item ->
            when(item.itemId){
                R.id.home->{
                    toolbar.title = "Home"
                    val homeFragment = HomeFragment.newInstance()
                    ChangeFragment(homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.profile->{
                    toolbar.title = "Profile"
                    val profileFragment = ProfileFragment.newInstance()
                    ChangeFragment(profileFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.carts->{
                    toolbar.title = "Shot"
                    val shotFragment = ShotFragment.newInstance()
                    ChangeFragment(shotFragment)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }


        toolbar.title = "Home"
        val homeFragment = HomeFragment.newInstance()
        ChangeFragment(homeFragment)

    }

    private fun ChangeFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }

}