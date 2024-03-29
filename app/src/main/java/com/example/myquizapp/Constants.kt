package com.example.myquizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina","Austrlia",
            "Armenia","Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )
        questionList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.newzealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionList.add(que10)

        return questionList
    }
}