package com.akshaykumbhar.smack

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {
    var avatarcolor = "[0.5,0.5,0.5,1]"
    var userAvatar= "profiledefault"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }
    fun createcolorclk(view: View)
    {
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)
        GenerateUserimagebtn.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedg = g.toDouble()/255
        val savedb = b.toDouble()/255
        avatarcolor= "[$savedR,$savedg,$savedb,1]"
    }
    fun generateuserclk(view: View)
    {
        val random = Random()
        val avatar = random.nextInt(28)
        val color = random.nextInt(2)
        if(color == 0)
            userAvatar = "light$avatar"
        else
            userAvatar ="dark$avatar"
        val resourceId = resources.getIdentifier(userAvatar,"drawable",packageName)
        GenerateUserimagebtn.setImageResource(resourceId)
    }
    fun createuserclk(view: View)
    {

    }
}
