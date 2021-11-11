package com.example.roomuppgift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class QuestionsActivity : AppCompatActivity() {



    lateinit var mainQuestion: EditText
    lateinit var opt1: Button
    lateinit var opt2: Button
    lateinit var opt3: Button
    lateinit var opt4: Button
    lateinit var  imageDisplay : ImageView
    var moneyQuestionsList = mutableListOf<QuestionClass>()
    var geoQuestionsList = mutableListOf<QuestionClass>()
    var cultureQuestionsList = mutableListOf<QuestionClass>()
    var languageQuestionsList = mutableListOf<QuestionClass>()
    var counter: Int = -1
    var answerCounter= 0
    var car : QuestionClass? = null
    var userNameHere1 : String? = null
    var lista = mutableListOf<QuestionClass>()
    var totQs = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        userNameHere1 = intent.getStringExtra(Constants.NAME)

        val decision = intent.getIntExtra(Constants.CATEG, 0 )


        mainQuestion = findViewById(R.id.mainQuestion)
        imageDisplay = findViewById(R.id.imageDisplay)
        opt1 = findViewById(R.id.opt1)
        opt2 = findViewById(R.id.opt2)
        opt3 = findViewById(R.id.opt3)
        opt4 = findViewById(R.id.opt4)

        moneyQuestionsList  = Constants.getQuestionsMoney()
        geoQuestionsList = Constants.getQuestionsGeo()
        cultureQuestionsList  = Constants.getQuestionsCulture()
        languageQuestionsList = Constants.getQuestionsLanguage()

        if ( decision == 1) {
            moneyQuestionsList = Constants.getQuestionsMoney()
            lista = moneyQuestionsList
            displayQuestions()

        } else if ( decision == 2 ) {
            geoQuestionsList = Constants.getQuestionsGeo()
            lista = geoQuestionsList
            displayQuestions()

        }else if ( decision == 3 ) {
            cultureQuestionsList = Constants.getQuestionsCulture()
            lista = cultureQuestionsList
            displayQuestions()

        } else if ( decision == 4 ) {
            languageQuestionsList = Constants.getQuestionsLanguage()
            lista = languageQuestionsList
            displayQuestions()
        }


        opt1.setOnClickListener {
            if (car?.rightAnswer == 0) {
                answerCounter++ }
            displayQuestions()
        }

        opt2.setOnClickListener {
            if ( car?.rightAnswer == 1) {
                answerCounter++}
            displayQuestions()
        }

        opt3.setOnClickListener {
            if ( car?.rightAnswer == 2) {
                answerCounter++}
            displayQuestions()
        }

        opt4.setOnClickListener {
            if (car?.rightAnswer == 3) {
                answerCounter++}
            displayQuestions()
        }

    }

    fun displayQuestions() {
        totQs++
        counter++
        if (counter == 10) {
            val intent = Intent(this, ScoreActivity::class.java)
            Log.d("!!!", "USER_NAME ${userNameHere1}")
            intent.putExtra(Constants.NAME, userNameHere1)
            intent.putExtra(Constants.POINTS, answerCounter)
            intent.putExtra(Constants.CATEGORY, counter)
            startActivity(intent)
        } else {

            car = lista[counter]
            mainQuestion.setText(car?.questions)
            imageDisplay.setImageResource(car!!.pic)
            opt1.text = car!!.choices[0]
            opt2.text = car!!.choices[1]
            opt3.text = car!!.choices[2]
            opt4.text = car!!.choices[3]
        }


    }
}
