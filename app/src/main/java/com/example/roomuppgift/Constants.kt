package com.example.roomuppgift

import java.util.*
import kotlin.collections.ArrayList


object Constants {


    const val NAME: String = "user_name"
    const val CATEG: String = "category"
    const val POINTS : String = "correct_answers"
    const val CATEGORY : String = "total_questions"


    init {
        getQuestionsMoney()
        getQuestionsGeo()
        getQuestionsCulture()
        getQuestionsLanguage()
    }

    fun getQuestionsMoney() : ArrayList<QuestionClass> {
        val moneyQuestionsList = ArrayList<QuestionClass>()

        val qu1 = QuestionClass ( 1, R.drawable.money1, "Which country was first to use printed paper currency?",
            listOf("India", "China", "Germany", "Great Britain"), 1)
        val qu2 = QuestionClass ( 2, R.drawable.money2, "What is the currency of Ecuador?",
            listOf("Peso", "Tuman", "Dollar", "Rupie"), 2)
        val qu3 = QuestionClass ( 3, R.drawable.money3, "Who was the first civilisation to issue regulated coins??",
            listOf("Greece", "Persia", "Lydia", "Babylon"), 2)
        val qu4 = QuestionClass ( 4, R.drawable.money4, "From what material was the currency in ancient Rome made?",
            listOf("Gold", "Silver", "Wood", "Leather"), 3)
        val qu5 = QuestionClass (5,  R.drawable.money5, "Which is the first independent credit card firm in the world",
            listOf("Visa", "Diners Club", "Mastercard", "JCB"), 1)
        val qu6 = QuestionClass ( 6, R.drawable.money11, "What is the most popular banknote in the world??",
            listOf("50 Euro", "50 Pound Sterling", "100 US Dollar", "1000 Chinese Yen"), 2)
        val qu7 = QuestionClass ( 7, R.drawable.money, "What material is no longer used for making coins?",
            listOf("Bronze", "Gold", "Tin", "Copper"), 2)
        val qu8 = QuestionClass ( 8, R.drawable.money8, "Who said: 'It costs a lot of money to look this cheap?",
            listOf("Dolly Parton", "Warren Buffet", "Nicolas Cage", "Bill Gates"), 0)
        val qu9 = QuestionClass ( 9, R.drawable.money9, "What is the most faked currency in the world?",
            listOf("Pound Sterling", "US Dollar", "Euro", "Japanese Yen"), 0)
        val qu10 = QuestionClass (10,  R.drawable.money10, "MAD is the official currency of which African country?",
            listOf("Algeria", "Egypt", "Sudan", "Morocco"), 3)

        moneyQuestionsList.add(qu1)
        moneyQuestionsList.add(qu2)
        moneyQuestionsList.add(qu3)
        moneyQuestionsList.add(qu4)
        moneyQuestionsList.add(qu5)
        moneyQuestionsList.add(qu6)
        moneyQuestionsList.add(qu7)
        moneyQuestionsList.add(qu8)
        moneyQuestionsList.add(qu9)
        moneyQuestionsList.add(qu10)

        return moneyQuestionsList
    }


    fun getQuestionsGeo() : ArrayList<QuestionClass> {
        val geoQuestionsList = ArrayList<QuestionClass>()

        val qu1 = QuestionClass ( 1, R.drawable.geo, "What is the capital of Malta?",
            listOf("Malta", "Valetta", "Limasol", "Split"), 1)
        val qu2 = QuestionClass ( 2, R.drawable.iquazu1, "What is the name of this beauty?",
            listOf("Niagara Falls", "Iguazu Falls", "Victoria Falls", "Horseshoe Falls"), 1)
        val qu3 = QuestionClass ( 3, R.drawable.pompeii, "What is the name of these ruins?",
            listOf("Petra", "Acropolis", "Palmyra", "Pompeii"), 3)
        val qu4 = QuestionClass ( 4, R.drawable.babylon, "Where is The Hanging Garden located?",
            listOf("Cairo", "Aleppo", "Babylon", "Ur"), 2)
        val qu5 = QuestionClass (5,  R.drawable.sacrec, "What is the name of this building?",
            listOf("The Dome Church", "Notre Dame", "Segrada Familia", "Sacre Cour"), 3)
        val qu6 = QuestionClass ( 6, R.drawable.hooverdam, "What dam is this?",
            listOf("Theodore Roosevelt Dam", "Three Gorges Dam", "Tarbela Dam", "Hoover Dam"), 3)
        val qu7 = QuestionClass ( 7, R.drawable.galapagos, "Galapagos belongs to which country?",
            listOf("Mexico", "Ecuador", "Colombia", "Panama"), 1)
        val qu8 = QuestionClass ( 8, R.drawable.bluemosque, "What is the name of this mosque?",
            listOf("Sultan Ahmet", "The grand mosque", "Hagia Sofia", "The dome"), 0)
        val qu9 = QuestionClass( 9, R.drawable.culture1, "What African country has the largest population?",
            listOf("Nigeria", "South Africa", "Egypt", "Kenya"), 0)
        val qu10 = QuestionClass (10,  R.drawable.geo, "What is the largest desert in the world?",
            listOf("Mojave Desert", "Thar Desert", "Sahara Desert ", "Antarctica"), 3)

        geoQuestionsList.add(qu1)
        geoQuestionsList.add(qu2)
        geoQuestionsList.add(qu3)
        geoQuestionsList.add(qu4)
        geoQuestionsList.add(qu5)
        geoQuestionsList.add(qu6)
        geoQuestionsList.add(qu7)
        geoQuestionsList.add(qu8)
        geoQuestionsList.add(qu9)
        geoQuestionsList.add(qu10)

        return geoQuestionsList
    }
    fun getQuestionsCulture() : ArrayList<QuestionClass> {
        val cultureQuestionsList = ArrayList<QuestionClass>()

        val qu1 = QuestionClass ( 1, R.drawable.cul1, "Which country is known as “the land of no rivers”?",
            listOf("Tunisia", "Saudi Arabia", "Singapore", "Jew"), 1)
        val qu2 = QuestionClass ( 2, R.drawable.cul2, "How many Star Wars movies are there?",
            listOf("7", "8", "6", "9"), 3)
        val qu3 = QuestionClass ( 3, R.drawable.cul3, "Who was Walt Disney’s favorite princess?",
            listOf("Rapunzel", "Pocahontas", "Cinderella", "Snow White"), 2)
        val qu4 = QuestionClass ( 4, R.drawable.cul1, "Who was the first actor to portray James Bond?",
            listOf("Barry Nelson", "Pierce Brosnan", "Daniel Craig", "Clint Eastwood"), 0)
        val qu5 = QuestionClass (5,  R.drawable.cul2, "What is the biggest religion in the world?",
            listOf("Islam", "Christianity", "Hinduism", "Budism"), 1)
        val qu6 = QuestionClass ( 6, R.drawable.cul3, "What is the highest-grossing romantic comedy?",
            listOf("Monster in law", "My Big Fat Greek Wedding", "Love Actually", "The proposal"), 1)
        val qu7 = QuestionClass ( 7, R.drawable.cul1, "Which Country’s flag includes a Cedar Tree?",
            listOf("Jordan", "Tunisia", "Lebanon", "Pakistan"), 3)
        val qu8 = QuestionClass ( 8, R.drawable.cul2, "IWhat is the name of the family dog on Full House?",
            listOf("Jackie", "Teddy", "Billy", "Comet"), 3)
        val qu9 = QuestionClass ( 9, R.drawable.cul3, "What was Ross's pet monkey name on Friends?",
            listOf("Jack", "Ben", "Marcel", "Tony"), 2)
        val qu10 = QuestionClass (10,  R.drawable.cul1, "What movie has the best-selling soundtrack ever?",
            listOf("The Body Guard", "Titanic", "Frozen", "James Bond"), 0)

        cultureQuestionsList.add(qu1)
        cultureQuestionsList.add(qu2)
        cultureQuestionsList.add(qu3)
        cultureQuestionsList.add(qu4)
        cultureQuestionsList.add(qu5)
        cultureQuestionsList.add(qu6)
        cultureQuestionsList.add(qu7)
        cultureQuestionsList.add(qu8)
        cultureQuestionsList.add(qu9)
        cultureQuestionsList.add(qu10)

        return cultureQuestionsList
    }
    fun getQuestionsLanguage() : ArrayList<QuestionClass> {
        val languageQuestionsList = ArrayList<QuestionClass>()

        val qu1 = QuestionClass ( 1, R.drawable.lang1, "What is the most popular language in the world??",
            listOf("Arabic", "English", "Chinese", "Spanish"), 2)
        val qu2 = QuestionClass ( 2, R.drawable.lang2, "Which of the following is not a Germanic language?",
            listOf("Swedish", "Dutch", "French", "Icelandic"), 2)
        val qu3 = QuestionClass ( 3, R.drawable.lang3, "Which of the following languages has no alphabet?",
            listOf("Thai", "Korean", "Japanese", "Chinese"), 3)
        val qu4 = QuestionClass ( 4, R.drawable.lang1, "Which continent has the most languages?",
            listOf("Asia", "Europe", "Africa", "South America"), 0)
        val qu5 = QuestionClass (5,  R.drawable.lang2, "How many national languages are there in Switzerland?",
            listOf("2", "4", "3", "5"), 1)
        val qu6 = QuestionClass ( 6, R.drawable.lang3, "Which country has up to 16 official languages?",
            listOf("Zimbabwe", "South Africa", "India", "China"), 0)
        val qu7 = QuestionClass ( 7, R.drawable.lang1, "The writing form of languages originated from?",
            listOf("India", "Mesopotamia", "Egypt", "Maya"), 1)
        val qu8 = QuestionClass ( 8, R.drawable.lang2, "Which of the following languages uses the Latin alphabet?",
            listOf("Thai", "Japanese", "Chinese", "Vietnamese"), 2)
        val qu9 = QuestionClass ( 9, R.drawable.lang3, "What is the language spoken in Brazil?",
            listOf("Spanish", "Portugese", "English", "French"), 1)
        val qu10 = QuestionClass (10,  R.drawable.lang1, "Which language has the largest number of words?",
            listOf("Chinese", "English", "Arabic", "French"), 1)

        languageQuestionsList.add(qu1)
        languageQuestionsList.add(qu2)
        languageQuestionsList.add(qu3)
        languageQuestionsList.add(qu4)
        languageQuestionsList.add(qu5)
        languageQuestionsList.add(qu6)
        languageQuestionsList.add(qu7)
        languageQuestionsList.add(qu8)
        languageQuestionsList.add(qu9)
        languageQuestionsList.add(qu10)

        return languageQuestionsList
    }
}
