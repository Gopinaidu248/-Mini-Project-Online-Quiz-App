
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Sample questions
        questions.add(new Question(
            "Which language is used for Android app development?",
            new String[]{"Python", "Java", "Swift", "Ruby"},
            1 // Java
        ));
        questions.add(new Question(
            "What is the capital of France?",
            new String[]{"Berlin", "London", "Paris", "Madrid"},
            2 // Paris
        ));
        questions.add(new Question(
            "Which company developed Java?",
            new String[]{"Microsoft", "Apple", "Sun Microsystems", "IBM"},
            2 // Sun Microsystems
        ));

        int score = 0;

        System.out.println("Welcome to the Online Quiz App!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getQuestion());

            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt() - 1;

            if (q.isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + options[q.getCorrectOptionIndex()] + "\n");
            }
        }

        // Final Score
        System.out.println("Quiz Finished!");
        System.out.println("Your score: " + score + "/" + questions.size());

        scanner.close();
    }
}

