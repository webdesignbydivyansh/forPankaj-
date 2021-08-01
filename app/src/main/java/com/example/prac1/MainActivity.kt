package com.example.prac1

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.Person
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prac1.Person.Companion.RanPersons

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        etview.apply{
//            addTextChangedListener {
//                if(etview.text.toString().length>8)
//                    btn.isEnabled=true
//                if(etview.text.toString().length>18)
//                    btn.isEnabled=false
//            }
//        }
//        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
//        val isConnected: Boolean = activeNetwork?.isConnectedOrConnecting == true

//        val persons=Person.getRandom(15)
//        val personAdapter=PersonAdapter(persons)
        val person_name=etname.text.toString()
        val person_surname=etsurname.text.toString()
        val person_comp=etcomp.text.toString()
        var p:ArrayList<com.example.prac1.Person>
        var personAdapter:PersonAdapter
        btnsave.setOnClickListener{
//            val i= Intent()
//            i.putExtra("Name",person_name)
//            i.putExtra("Surname",person_surname)
//            i.putExtra("Comp",person_comp)
//            startActivity(i)
            p=com.example.prac1.Person.RanPersons(person_name,person_surname,person_comp)
             personAdapter = PersonAdapter(p)
            rvperson.adapter = personAdapter

        }
//        val personsAdapter=ArrayList<com.example.prac1.Person>()
//        for (i in 0..k-1)
//        {
//            personsAdapter.add(PERSON_NAME[i])
//            personsAdapter.add(PERSON_SURNAME[i])
//            personsAdapter.add(PERSON_COMP[i])
////                    )
//        }
        btndisplay.setOnClickListener {
            rvperson.layoutManager = LinearLayoutManager(this)
        }
    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_game,menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when(item.itemId)
//        {
//            R.id.menu->true
//            R.id.menu2->true
//            else->return super.onOptionsItemSelected(item)
//        }
//    }

}