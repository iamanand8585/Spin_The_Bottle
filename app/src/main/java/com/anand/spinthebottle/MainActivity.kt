package com.anand.spinthebottle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val listOfNames= ArrayList<kotlin.String>()
    var random=Random(listOfNames.count())




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTxt.text="Spin"

        addBtn.setOnClickListener {
            var name=enteredNameEt.text.toString()
            if(name!=""){
                listOfNames.add(name)
                enteredNameEt.text?.clear()
            }

        }

        spinBtn.setOnClickListener {
            if(listOfNames.isEmpty()){
                Toast.makeText(this,"Please add names", Toast.LENGTH_SHORT).show()
            }else{
                var i=random.nextInt(listOfNames.count())
                nameTxt.text=listOfNames[i]
            }

        }
    }



}