package com.example.prac1

import android.content.Intent
import android.widget.EditText
import androidx.core.app.Person
import kotlin.random.Random

data class Person (
    val name:String,
    val surname: String,
    val comp:String
)
{

    companion object{
            @JvmStatic
            fun RanPersons( names:String, surnames: String, comps: String):ArrayList<com.example.prac1.Person>
            {

                val personArray=ArrayList<com.example.prac1.Person>()
//                for (i in 0..k-1)
//                {
                    personArray.add(
                            Person(
                                    names,
                                    surnames,
                                    comps
                            )
                    )
//                }
                return personArray
            }
//        fun getRandom(n:Int):ArrayList<Person>
//        {
//            val personArray= ArrayList<Person>(n)
//
//            for (i in 1..n)
//            {
//                personArray.add(
//                    Person(
//                            Person_Name[Random.nextInt(10)],
//                            Surname[Random.nextInt(10)],
//                            Comp_Name[Random.nextInt(10)],
//                    )
//                )
//            }
//            return personArray
//        }
    }
}
//class Person{
//
//}