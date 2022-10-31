package com.example.assignment4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtEmail:EditText
    private lateinit var txtPassword:EditText
    private lateinit var btnSignIn:Button
    private lateinit var btnAccount:Button

    val users:ArrayList<User> = ArrayList<User>(
        listOf(
        User("John", "Doe", "johndoe@xyz.com", "1234"),
        User("Jane", "Doe", "janedoe@xyz.com", "1234"),
        User("Alex", "Doe", "alexdoe@xyz.com", "1234"),
        User("Jessica", "Doe", "jessicadoe@xyz.com", "1234"))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindControl()
    }
    fun bindControl(){
        txtEmail=findViewById(R.id.txtEmail)
        txtPassword=findViewById(R.id.txtPassword)
        btnSignIn=findViewById(R.id.btnSignIn)
        btnAccount=findViewById(R.id.btnAccount)
    }
    fun signIn(view: View){

        val myIntent = Intent(this, ShoppingCategoryActivity::class.java)
        myIntent.putExtra("email",txtEmail.text.toString())
        startActivity(myIntent)
    }
    fun forgotPassword(view: View){
        val myIntent = Intent(this, PasswordActivity::class.java)
        startActivity(myIntent)
    }
    fun createAccount(view: View){
        val myIntent = Intent(this, RegisterActivity::class.java)
        startActivity(myIntent)
    }
}