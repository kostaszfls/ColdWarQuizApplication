import java.util.Scanner;

public class ColdWarQuiz {
    public static void main(String[] args) {
        int score = 0;
        
        // Quiz questions and answers
        String[] questions = {
            "When did the Cold War begin?",
            "What was the main cause of the Cold War?",
            "Which countries were the main rivals during the Cold War?",
            "What was the name of the policy used by the United States to stop the spread of communism?",
            "What was the Berlin Wall?"
        };
        
        String[][] options = {
            {"A. 1945", "B. 1950", "C. 1960", "D. 1970"},
            {"A. Space exploration", "B. Ideological differences", "C. Religious conflicts", "D. Global warming"},
            {"A. United States and Soviet Union", "B. Germany and France", "C. China and Japan", "D. United Kingdom and Italy"},
            {"A. Containment", "B. Isolationism", "C. Expansionism", "D. Imperialism"},
            {"A. A famous art installation", "B. A barrier separating East and West Berlin", "C. A bridge connecting two continents", "D. A nuclear weapon"}
        };
        
        String[] answers = {"A", "B", "A", "A", "B"};
        
        Scanner scanner = new Scanner(System.in);
        
        // Displaying and evaluating quiz questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (A, B, C, or D): ");
            
            String userAnswer = scanner.nextLine().toUpperCase();
            
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            
            System.out.println();
        }
        
        scanner.close();
        
        // Displaying the final score
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
