package com.example.financetracker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeLifecycleOwner
import com.example.financetracker.ui.theme.forgetpass
import android.widget.Toast

class loginactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.loginpage)
        val btnSIGNin=findViewById<TextView>(R.id.loginbtn)
        val MyLayout = findViewById<LinearLayout>(R.id.signInLayout)

        val myLayout = findViewById<LinearLayout>(R.id.signUpLayout)
        val loginEmail = findViewById<TextView>(R.id.logInEmail)
        val loginPassword = findViewById<TextView>(R.id.logInPassword)

// Optional: You can add validation here

        btnSIGNin.setOnClickListener() {

            myLayout.visibility = View.GONE
            MyLayout.visibility = View.VISIBLE

            }
            val forget=findViewById<TextView>(R.id.forgetpass)
            forget.setOnClickListener {
                val forgetLayout=Intent(this@loginactivity, forgetpass::class.java)
                startActivity(forgetLayout)

            }
        val login=findViewById<Button>(R.id.logIn)
        login.setOnClickListener() {
            if (loginEmail.text.isNotEmpty() && loginPassword.text.isNotEmpty()) {
                val tr = Intent(this@loginactivity, homepageactivity::class.java)
                tr.putExtra("email", loginEmail.text.toString())
                tr.putExtra("password", loginPassword.text.toString()) // if needed

                startActivity(tr)
                finish()
            } else {
                Toast.makeText(this, "Please enter login details", Toast.LENGTH_SHORT).show()
            }
        }
        myLayout.visibility = View.GONE
       val SignUptab=findViewById<TextView>(R.id.signupbtn)
        SignUptab.setOnClickListener() {

            MyLayout.visibility = View.GONE
            myLayout.visibility = View.VISIBLE
            val Name=findViewById<TextView>(R.id.name)
            val email=findViewById<TextView>(R.id.signUpEmail)
            //val trans= Intent(this@loginactivity,homepageactivity::class.java)
            val signUp=findViewById<Button>(R.id.signUp)
            signUp.setOnClickListener() {
                val pass= findViewById<EditText>(R.id.signUpPassword)
                val confirm= findViewById<EditText>(R.id.signUpPasswordCon)

                if (pass.text.toString().isEmpty() || confirm.text.toString().isEmpty() || Name.text.toString().isEmpty() || email.text.toString().isEmpty()) {
                    Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
                } else if (pass.text.toString() != confirm.text.toString()
                    ) {
                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
                } else {
                    val trans= Intent(this@loginactivity,homepageactivity::class.java)
                    trans.putExtra( "name",Name.text.toString())
                    trans.putExtra( "email",email.text.toString())
                    startActivity(trans)
                    finish()
                }




            }

        }



    }
}