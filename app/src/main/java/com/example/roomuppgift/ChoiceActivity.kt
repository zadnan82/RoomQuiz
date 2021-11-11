package com.example.roomuppgift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView


class ChoiceActivity : AppCompatActivity() {


    lateinit var moneyButton: Button
    lateinit var geoButton: Button
    lateinit var cultureButton: Button
    lateinit var langButton: Button
    lateinit var moneyPic : ImageView
    lateinit var geoPic : ImageView
    lateinit var langPic : ImageView
    lateinit var culturePic : ImageView

    var money = 1
    var geo = 2
    var culture = 3
    var language = 4
    lateinit var username : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)




        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        username = intent.getStringExtra(Constants.NAME).toString()



        moneyButton = findViewById(R.id.moneyButton)
        cultureButton = findViewById(R.id.cultureButton)
        geoButton = findViewById(R.id.geoButton)
        langButton = findViewById(R.id.langButton)
        moneyPic = findViewById(R.id.moneyPic)
        geoPic = findViewById(R.id.geoPic)
        culturePic = findViewById(R.id.culturePic)
        langPic = findViewById(R.id.langPic)


        moneyPic.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, money)
            startActivity(intent)


        }
        geoPic.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, geo)
            startActivity(intent)

        }

        culturePic.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, culture)
            startActivity(intent)

        }

        langPic.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, language)
            startActivity(intent)

        }

        moneyButton.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, money)
            startActivity(intent)


        }
        geoButton.setOnClickListener {

            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, geo)
            startActivity(intent)

        }

        cultureButton.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, culture)
            startActivity(intent)

        }

        langButton.setOnClickListener {
            val intent = Intent (this , QuestionsActivity::class.java)
            intent.putExtra(Constants.NAME, username)
            intent.putExtra(Constants.CATEG, language)
            startActivity(intent)
        }



    }
}
