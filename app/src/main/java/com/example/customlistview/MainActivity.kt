package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listview=findViewById<ListView>(R.id.ListView)
        var list= mutableListOf<model>()
//        adding images

        list.add(model("Nissan","Juke is my dream car",R.drawable.juke))
        list.add(model("G-wagon","This is a really expensive car",R.drawable.gwagon))
        list.add(model("Vintage","This is an extremely rare model",R.drawable.vintage))
        list.add(model("Toureg","The Toureg is my second alternative to a Juke",R.drawable.toureg))
        list.add(model("Rav4","The latest version looks super cool",R.drawable.rav4))
        list.add(model("X-trail","I dont like this car",R.drawable.xtrail))

        listview.adapter=CustomAdapter(this,R.layout.rows,list)

       listview.setOnItemClickListener { adapterView, view, position, l ->
           if(position==0){
               Toast.makeText(this@MainActivity,"You have clicked on Nissan",Toast.LENGTH_LONG).show()
           }
       }
    }
}