package com.akshaykumbhar.smack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun signupbtnclk(view:View)
    {
        val SignUpintent = Intent(this,CreateUserActivity::class.java)
        startActivity(SignUpintent)
    }
    fun login_Loginbtnclk(view: View)
    {

    }
}
