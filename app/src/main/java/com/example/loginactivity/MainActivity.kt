package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var btnsignup:Button
    lateinit var etname:EditText
    lateinit var spgender:Spinner
    lateinit var etemail:EditText
    lateinit var etphone:EditText
    lateinit var etpassword2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun castView (){
        btnsignup=findViewById(R.id.btnsignup)
        etemail=findViewById(R.id.etemail)
        etname=findViewById(R.id.etname)
        etphone=findViewById(R.id.etphone)
        etpassword2=findViewById(R.id.etpassword2)
        spgender=findViewById(R.id.spgender)
        var  gender= arrayListOf("select gender","Male","Female")
        var  genderadaptor=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        genderadaptor.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spgender.adapter=genderadaptor
        onClick()

    }
    fun onClick(){
        var name=etname.text.toString()
        if (name.isEmpty()){
            etname.setError("Name required")
        }
        var gender=""
        if (spgender.selectedItemPosition!=0){
            gender=spgender.selectedItem.toString()
        }
        else{
            Toast.makeText(baseContext,"select gender",Toast.LENGTH_LONG)
        }
        var  email=etemail.text.toString()
        if (email.isEmpty()){
            etemail.setError("Email required")
        }
        var phone=etphone.text.toString()
        if (phone.isEmpty()){
            etphone.setError("Phone required")
        }
        var  password=etpassword2.text.toString()
        if (password.isEmpty()){
            etpassword2.setError("Paswword required")
        }
        val  init=Intent(baseContext,signupActivity::class.java)
        startActivity(init)
    }

}