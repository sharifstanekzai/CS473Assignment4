package com.example.assignment4

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    private lateinit var txtEmail: EditText
    private lateinit var txtPassword: EditText
    private lateinit var txtFirstname:EditText
    private lateinit var txtLastname:EditText
    private lateinit var btnAccount:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        bindControls()
    }
    fun bindControls(){
        txtEmail=findViewById(R.id.txtEmail)
        txtPassword=findViewById(R.id.txtPassword)
        txtFirstname=findViewById(R.id.txtFirstname)
        txtLastname=findViewById(R.id.txtLastname)
        btnAccount=findViewById(R.id.btnAccount)
    }

    fun createUserAccount(view: View){
        var myIntent = intent
        var firstname:String
        var lastname:String
        var email:String
        var password:String

        if((txtFirstname?.text?.length)!! < 1){
            txtFirstname.setError("Firstname missing")
        }
        else{
            firstname = txtFirstname?.text.toString()
            myIntent.putExtra("fname", firstname)
        }
        if((txtLastname?.text?.length)!! < 1){
            txtLastname.setError("Lastname missing")
        }
        else{
            lastname = txtLastname?.text.toString()
            myIntent.putExtra("lname", lastname)
        }
        if((txtEmail?.text?.length)!! < 1){
            txtEmail.setError("Email missing")
        }
        else{
            email = txtEmail?.text.toString()
            myIntent.putExtra("email", email)
        }
        if((txtPassword?.text?.length)!! < 1){
            txtPassword.setError("Password missing")
        }
        else{
            password = txtPassword?.text.toString()
            myIntent.putExtra("password", password)
        }

        if(myIntent.hasExtra("fname")&&
            myIntent.hasExtra("lname")&&
            myIntent.hasExtra("email")&&
            myIntent.hasExtra("password")){
            setResult(Activity.RESULT_OK, myIntent)
            Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
        }
    }
}