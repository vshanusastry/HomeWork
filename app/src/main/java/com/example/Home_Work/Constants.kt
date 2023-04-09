package com.example.Home_Work

object Constants {
    val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Who is the author of the Harry Potter book series?",
            arrayListOf(" J.K. Rowling", "Stephenie Meyer", "Suzanne Collins", "Veronica Roth"),
            3
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "What is the capital city of Spain?",
            arrayListOf("Barcelona", "Madrid", "Valencia", "Seville"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Which of the following programming languages is an object-oriented language?",
            arrayListOf("C", "Python", "Assembly", "Fortran"),
            1
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What is the largest planet in our solar system?",
            arrayListOf("Earth", "Venus", "Jupiter", "Mars"),
            2
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which country is famous for the Great Barrier Reef?",
            arrayListOf("Brazil", "Australia", "Thailand", "Indonesia"),
            3
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Which of the following is not a primary color?",
            arrayListOf("Red", "Blue", "Yellow", "Green"),
            2
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Who invented the telephone?",
            arrayListOf(
                "Alexander Graham Bell",
                "Thomas Edison",
                "Isaac Newton",
                "Albert Einstein"
            ),
            0
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What is the chemical symbol for gold?",
            arrayListOf("Au", "Ag", "Cu", "Pt"),
            1
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Which of the following is a musical instrument?",
            arrayListOf("Frying pan", "Saxophone", "Screwdriver", "Tennis racket"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Who was the first person to step on the moon?",
            arrayListOf("Neil Armstrong", "Buzz Aldrin", "Yuri Gagarin", "Michael Collins"),
            1
        )
        questionsList.add(questionTen)

        return questionsList
    }
}