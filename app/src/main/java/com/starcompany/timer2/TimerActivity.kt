package com.starcompany.timer2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class TimerActivity : AppCompatActivity() {

    /*
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
               // message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
               // message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                //message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Data = arrayOf("1:00", "3:00", "5:00", "10:00", "15:00", "30:00")

        val arrayAdapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                Data)

        val listView = findViewById<ListView>(R.id.list_timer)
        listView.adapter = arrayAdapter
        listView.setOnItemClickListener {p,v,pos, id->Log.d("tag","test" + pos.toString())}



        val fragmentManager = getFragmentManager()

        fragmentManager.beginTransaction().replace(R.id.container, TimerFragment.newInstance()).commit()





    }
}
