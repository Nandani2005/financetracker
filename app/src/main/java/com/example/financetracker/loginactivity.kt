package com.example.financetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.financetracker.ui.theme.forgetpass

class loginactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.loginpage)
        val btnSIGNin=findViewById<TextView>(R.id.loginbtn)
        val MyLayout = findViewById<LinearLayout>(R.id.signInLayout)

        val myLayout = findViewById<LinearLayout>(R.id.signUpLayout)
        btnSIGNin.setOnClickListener {

            myLayout.visibility = View.GONE
            MyLayout.visibility = View.VISIBLE
        }
        myLayout.visibility = View.GONE
       val SignUptab=findViewById<TextView>(R.id.signupbtn)
        SignUptab.setOnClickListener {

            MyLayout.visibility = View.GONE
            myLayout.visibility = View.VISIBLE
        }
            val Name=findViewById<TextView>(R.id.name)
        val trans= Intent(this@loginactivity,homepageactivity::class.java)
         val signUp=findViewById<TextView>(R.id.signUp)
        signUp.setOnClickListener {
            trans.putExtra( "name",Name.text.toString())
          startActivity(trans)
            finish()
        }
        val loin=findViewById<TextView>(R.id.logIn)
        loin.setOnClickListener {
            startActivity(trans)
            finish()
        }
        val forget=findViewById<TextView>(R.id.forgetpass)
        forget.setOnClickListener {
            val forgetLayout=Intent(this@loginactivity, forgetpass::class.java)
            startActivity(forgetLayout)

        }

    }
}