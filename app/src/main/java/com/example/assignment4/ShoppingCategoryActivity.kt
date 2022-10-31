package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class ShoppingCategoryActivity : AppCompatActivity() {
    private lateinit var txtWelcome:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        bindControls()
    }
fun bindControls(){
    txtWelcome=findViewById(R.id.txtWelcome)
    val myrIntent = intent
    val email = myrIntent.getStringExtra("email")
    txtWelcome.text = "Welcome "+email
}
    fun click(view: View){
        Toast.makeText(this, "You clicked ${view.tooltipText} category", Toast.LENGTH_SHORT).show()
    }
}