# -Mini-Project-Online-Quiz-App
This is a console-based Java Quiz Application that allows users to attempt multiple-choice questions, submit their answers, and get their final score.
It demonstrates Object-Oriented Programming (OOP) concepts, Java Collections, and basic control flow.

The project runs entirely in the terminal — no GUI or database required.

🎯 Objectives

Practice OOP principles in Java.

Learn to use ArrayList for storing questions.

Implement loops, conditions, and user input handling.

Display quiz results dynamically.

🧰 Tools & Technologies

Language: Java (JDK 17 or above recommended)

IDE: VS Code / IntelliJ IDEA / Eclipse

Input: Console (Scanner class)

🧩 Features

✅ Multiple-choice quiz questions
✅ Dynamic question loading (using List<Question>)
✅ User-friendly console interface
✅ Score calculation based on correct answers
✅ Final result display with total marks


🧠 Class Descriptions
1️⃣ Question.java

Represents a single quiz question.

Attributes:

String questionText

String[] options

int correctAnswerIndex

Methods:

Constructor

Getters for question and options

isCorrect(int userChoice) – checks if user answer matches correct one.

2️⃣ Quiz.java

Handles the quiz flow and scoring.

Responsibilities:

Store a list of Question objects

Ask each question to the user

Record user answers

Calculate and print total score

3️⃣ Main.java

The main entry point — starts the quiz.

Responsibilities:

Create Quiz object

Initialize sample questions

Call start() method to begin the quiz
