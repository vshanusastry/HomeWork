package com.example.homework

object ConstantsTF {
    val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Which country is the largest by area",
            arrayListOf("Russia", "Canada"),
            0
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Does a rhinoceros have one horn or two horns?",
            arrayListOf("one horn", "two horn"),
            0
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Is the Mona Lisa painting located in the Louvre Museum in Paris or the Metropolitan Museum of Art in New York?",
            arrayListOf("Louvre Museum in Paris", "Metropolitan Museum of Art in New York?"),
            0
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Is the Taj Mahal located in India or Pakistan?",
            arrayListOf("India", "Pakistan"),
            0
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Is the capital of Australia Sydney or Canberra?",
            arrayListOf("Sydney", "Canberra"),
            1
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Is the currency of Japan the yen or the won?",
            arrayListOf("the yen", "the won"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Was Albert Einstein a physicist or a chemist?",
            arrayListOf(
                "physicist", "chemist"
            ),
            0
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Is the deepest point on Earth the Mariana Trench or the Grand Canyon?",
            arrayListOf("Mariana Trench", "Grand Canyon"),
            0
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Is the planet Jupiter larger or smaller than Earth?",
            arrayListOf("larger", "smaller"),
            0
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Was Julius Caesar a king or a Roman consul?",
            arrayListOf("a king", "a Roman consul"),
            1
        )
        questionsList.add(questionTen)

        return questionsList
    }
}