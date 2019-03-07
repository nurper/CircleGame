package com.ns.circlegame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainCircle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_circle)
        val imgbtn = findViewById<ImageView>(R.id.imageView)
        val text = findViewById<TextView>(R.id.textView)
        var d = 0

        imgbtn.setOnClickListener {
            if(d==0){
            val rand = Random().nextInt(7)
            if(rand == 0) {
                imgbtn.setImageResource(R.drawable.alcoholic)
            }else if (rand == 1){
                imgbtn.setImageResource(R.drawable.ali)
            }else if (rand == 2){
                imgbtn.setImageResource(R.drawable.ballboy)
            }else if (rand == 3){
                imgbtn.setImageResource(R.drawable.budda)
            }else if (rand == 4){
                imgbtn.setImageResource(R.drawable.envelope)
            }else if (rand == 5){
                imgbtn.setImageResource(R.drawable.guy)
            }else if (rand == 6){
                imgbtn.setImageResource(R.drawable.socks)
            }else if (rand == 7){
                imgbtn.setImageResource(R.drawable.sticker)
            }
            
            d = 1
                text.visibility = View.INVISIBLE
            }else{
                imgbtn.setImageResource(R.drawable.lockscreen)
                d=0
                text.visibility = View.VISIBLE
            }
        }

    }
}
