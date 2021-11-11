package com.example.roomuppgift

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.coroutines.*
import org.w3c.dom.Text
import kotlin.coroutines.CoroutineContext

class ScoreActivity : AppCompatActivity() , CoroutineScope  {
    lateinit var db: AppDatabase
    lateinit var job: Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    var namn : String?= null
    var points : Int? = null
    var category: Int? = null
    lateinit var recyclerView: RecyclerView
    lateinit var playerTV : TextView
    lateinit var backButton : Button

    var scoreList : MutableList<Score> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        job = Job()
        backButton = findViewById(R.id.backButton)
        playerTV = findViewById(R.id.playerTV)


        namn = intent.getStringExtra(Constants.NAME).toString()
        points = intent.getIntExtra(Constants.POINTS,0)
        category = intent.getIntExtra(Constants.CATEGORY,0)

        playerTV.text = " Well done $namn , your score is $points out of $category"
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        db = AppDatabase.getInstance(this)

        db = Room.databaseBuilder(
            applicationContext, AppDatabase::class.java,
            "high_scores").fallbackToDestructiveMigration().build()

       addNewScore(Score(0, namn!!, points!! , category))

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ScoreAdapter(this, scoreList!!)


        recyclerView.adapter= adapter

        loadAllScores()
    }

    fun addNewScore(score: Score) {
        launch(Dispatchers.IO) {
            db.scoreDao.insert(score) }
    }

    fun loadAllScores() {
        val scores = async(Dispatchers.IO) {
            db.scoreDao.getScoreSortByDes()

        }
        launch {
            val list = scores.await()
            scoreList.addAll(list)
            Log.d("!!!!" , " ${scoreList}")

            recyclerView.adapter?.notifyDataSetChanged()
        }
    }

}