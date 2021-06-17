package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class signupActivity : AppCompatActivity() {
    lateinit var btnlogin2: Button
    lateinit var etemail2: EditText
    lateinit var etpassword3: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        onClick()
    }
    fun onClick(){

        var  email=etemail2.text.toString()
        if (email.isEmpty()){
            etemail2.setError("Email required")
        }

        var  password=etpassword3.text.toString()
        if (password.isEmpty()){
            etpassword3.setError("Paswword required")
        }
        val  init= Intent(baseContext,MainActivity::class.java)
        startActivity(init)
    }

}
