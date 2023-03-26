package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Narendra Modi is the Prime Minister of India.",
            R.drawable.ic_flag_of_argentina,
            arrayListOf("True", "False"),
            0
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            arrayListOf("Angola", "Austria"
//            ,"Australia", "Armenia"
            ),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            0
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            0
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            1
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            0
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            1
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            arrayListOf("Belarus", "Belize"
//            ,"Brunei", "Brazil"
            ),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}