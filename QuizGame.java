import java.util.Scanner;

public class QuizGame {
    private String[] questions;
    private String[] options;
    private String[] answers;
    private int score;
    private Scanner scanner;

    public QuizGame(String[] questions, String[] options, String[] answers) {
        this.questions = questions;
        this.options = options;
        this.answers = answers;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Multiple Choice Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (A, B, C, or D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
            System.out.println();
        }

        System.out.println("Quiz ended. Your score: " + score + " out of " + questions.length);
    }

    public static void main(String[] args) {
        String[] questions = {
                "What is the capital of France?",
                "Who wrote 'To Kill a Mockingbird'?",
                "Which planet is known as the Red Planet?",
                "Who painted the Mona Lisa?"
        };
        String[] options = {
                "A) Rome  B) Paris  C) Madrid  D) London",
                "A) Harper Lee  B) J.K. Rowling  C) Stephen King  D) Charles Dickens",
                "A) Jupiter  B) Mars  C) Venus  D) Saturn",
                "A) Leonardo da Vinci  B) Pablo Picasso  C) Vincent van Gogh  D) Michelangelo"
        };
        String[] answers = {"B", "A", "B", "A"};

        QuizGame game = new QuizGame(questions, options, answers);
        game.start();
    }
}
