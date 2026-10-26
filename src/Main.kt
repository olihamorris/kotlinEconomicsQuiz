// Economics Quiz: asks five questions, checks each answer, and shows the final score.
data class Question(val text: String, val answer: String)

class Quiz(val subject: String) {
    var score = 0

    fun checkAnswer(question: Question, studentAnswer: String) {
        if (studentAnswer.trim().lowercase() == question.answer) {
            score = score + 1
            println("Correct!")
        } else {
            println("Wrong. The answer is: " + question.answer)
        }
    }
}

fun main() {
    val quiz = Quiz("Economics")
    val questions = listOf(
        Question("What do we call the cost of the next best alternative?", "opportunity cost"),
        Question("What do we call limited resources compared with unlimited wants?", "scarcity"),
        Question("What do we call how much of a good buyers want at a given price?", "demand"),
        Question("What do we call how much of a good sellers offer at a given price?", "supply"),
        Question("What do we call a general rise in prices over time?", "inflation")
    )

    println("Welcome to the " + quiz.subject + " quiz!")
    var number = 1
    for (question in questions) {
        println()
        println("Question " + number + ": " + question.text)
        print("Your answer: ")
        val studentAnswer = readLine() ?: ""
        quiz.checkAnswer(question, studentAnswer)
        number = number + 1
    }
    println()
    println("Final score: " + quiz.score + " out of " + questions.size)
}