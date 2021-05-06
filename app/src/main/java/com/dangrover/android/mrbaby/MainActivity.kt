package com.dangrover.android.mrbaby

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
//    private val audioTab: com.google.android.material.tabs.TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val radioButton: Button = findViewById(R.id.btn_radio)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val navfrag: FragmentContainerView = findViewById((R.id.navfragment))
        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(seltab: TabLayout.Tab){
                if (seltab.getPosition() == 0) {
                    //Toast.makeText(this@MainActivity, "You just selected Audio!", Toast.LENGTH_LONG).show()
//                    Navigation.findNavController(this@MainActivity, R.id.navigation).navigate(R.id.action_audio_fragment_to_video_fragment)
                    navfrag.findNavController().navigate(R.id.action_video_fragment_to_audio_fragment)
                }
                if (seltab.getPosition() == 1) {
                    //Toast.makeText(this@MainActivity, "You just selected Video!", Toast.LENGTH_LONG).show()
//                    Navigation.findNavController(this@MainActivity, R.id.navigation).navigate(R.id.action_video_fragment_to_audio_fragment)
                    navfrag.findNavController().navigate(R.id.action_audio_fragment_to_video_fragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
//        val videoTab: TabItem = findViewById(R.id.tab_video)
//
//        rollButton.setOnClickListener{
//            rollDice()
//        }
    }
}