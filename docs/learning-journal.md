# Learning Journal - CSE 310 Module 1 (Kotlin)

## 25/10/2026
- **What I learned:** A Kotlin program starts in `fun main()`. `val` makes a variable that cannot change, `println` prints text, and a `for` loop repeats instructions.
- **What confused me:** IntelliJ did not show the green run arrow because the project had no module and no JDK attached. A single extra letter after the last bracket also caused a syntax error.
- **Question to research next:** What is the difference between `val` and `var` in Kotlin, and when should I use each?

## 26/10/2026
- **What I learned:**
    - `val` is fixed and `var` can change. Trying to reassign a `val` gives the error "Val cannot be reassigned".
    - An `if/else` lets the program choose between two paths.
    - A `for` loop repeats instructions for each item in a list made with `listOf`.
    - A function groups instructions under a name, takes inputs, and gives back an answer with `return`.
    - A data class (`Question`) holds information, and Kotlin prints it for me.
    - A class (`Quiz`) can keep its own score and check answers with a method.
- **What confused me:** A stray closing bracket caused a syntax error. I found it and removed it myself.
- **Question to research next:** Why can a class have both `var` and `val` inside it?
- - Added in 26/10/2026 entry, under "What I learned": A README explains the software, the tools used, and the websites that helped me.
- ## 27/10/2026
- **What I learned:**
  - `readLine()` lets the program read what the user types.
  - `.trim().lowercase()` cleans an answer before it is compared.
  - A `for` loop, a list of `Question` objects, and the `Quiz` class work together to make a full program.
  - `questions.size` gives the number of items in a list, so I do not need to type the number myself.
- **What confused me:** Switching between the Terminal and the Run window was a bit confusing. The Run window is where my program prints its output and where I type my quiz answers. The Terminal is where I type commands like `git add .` and `git push`.
- **Question to research next:** How do I make the questions come in a random order each time?