// Learning classes: a Quiz holds a subject and a score, and can check answers.
data class Question(val text: String, val answer: String)

class Quiz(val subject: String) {
    var score = 0

    fun checkAnswer(question: Question, studentAnswer: String) {
        if (studentAnswer == question.answer) {
            score = score + 1
            println("Correct!")
        } else {
            println("Wrong. The answer is: " + question.answer)
        }
    }
}

fun main() {
    val quiz = Quiz("Economics")
    val q1 = Question("What do we call the cost of the next best alternative?", "opportunity cost")

    println("Quiz subject: " + quiz.subject)
    quiz.checkAnswer(q1, "opportunity cost")
    quiz.checkAnswer(q1, "scarcity")
    println("Score: " + quiz.score)
}