import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int questionNumber;
        int playerAnswer;
        int randomNumber;

        System.out.println("\n\t *** Welcome to Quiz App ***");

        int[] answers = {0, 1, 3, 2, 1, 4, 2, 3, 4, 2, 3};
        ArrayList<Integer> questions = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        while (true) {
            if (questions.size() > 0) {
                randomNumber = random.nextInt(questions.size());
                questionNumber = questions.get(randomNumber);
            } else {
                System.out.println("\n> You answered all the questions and you got " + score + " points!");
                System.out.println("\n\t*** Thanks for playing! See you soon! ***");
                break;
            }
            questions.remove(randomNumber);
            questionsAndAnswers(questionNumber);

            while (true) {
                System.out.print("Your answer (1 - 4): ");
                try {
                    playerAnswer = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("> Invalid answer!");
                    scanner.nextLine();
                    continue;
                }

                if (playerAnswer >= 1 && playerAnswer <= 4) {
                    if (playerAnswer == answers[questionNumber]) {
                        System.out.println("\n> Your answer is correct!");
                        score++;
                    } else {
                        System.out.println("\n> Your answer is wrong!");
                    }
                } else {
                    System.out.println("> Invalid answer!");
                    continue;
                }
                System.out.println("> Your score is " + score);
                break;
            }
        }
    }

    private static void questionsAndAnswers(int number) {
        switch (number) {
            case 1:
                System.out.println("\n> General Knowledge: What is the capital of the United States?" +
                        "\n1. Washington, D.C." +
                        "\n2. New York" +
                        "\n3. Los Angeles" +
                        "\n4. Chicago");
                break;
            case 2:
                System.out.println("\n> Music: Who sang “Hit Me Baby One More Time”?" +
                        "\n1. Madonna" +
                        "\n2. Dua Lipa" +
                        "\n3. Britney Spears" +
                        "\n4. Michael Jackson");
                break;
            case 3:
                System.out.println("\n> Sports: How many players are there in a football team?" +
                        "\n1. 21" +
                        "\n2. 11" +
                        "\n3. 7" +
                        "\n4. 15");
                break;
            case 4:
                System.out.println("\n> History: Who was the first man to walk on the moon?" +
                        "\n1. Neil Armstrong" +
                        "\n2. Iuri Gagarin" +
                        "\n3. Louis Armstrong" +
                        "\n4. John Young");
                break;
            case 5:
                System.out.println("\n> Geography: What is the largest ocean in the world?" +
                        "\n1. Atlantic" +
                        "\n2. Arctic" +
                        "\n3. Indian" +
                        "\n4. Pacific");
                break;
            case 6:
                System.out.println("\n> TV & Film: Who played the lead role in the “Pirates of the Caribbean” movies?" +
                        "\n1. Brad Pitt" +
                        "\n2. Johnny Depp" +
                        "\n3. Leonardo DiCaprio" +
                        "\n4. George Cloney");
                break;
            case 7:
                System.out.println("\n> Science: What planet is known as the Red Planet?" +
                        "\n1. Pluto" +
                        "\n2. Jupiter" +
                        "\n3. Mars" +
                        "\n4. Neptune");
                break;
            case 8:
                System.out.println("\n> Literature: Who wrote the “Harry Potter” series?" +
                        "\n1. Mark Twain" +
                        "\n2. Lev Tolstoi" +
                        "\n3. Agatha Christie" +
                        "\n4.  J.K. Rowling");
                break;
            case 9:
                System.out.println("\n> Art: What tower is located in Pisa, Italy?" +
                        "\n1. Arc de Triomphe" +
                        "\n2. Leaning Tower of Pisa" +
                        "\n3. Colosseum" +
                        "\n4. Burj Khalifa");
                break;
            case 10:
                System.out.println("\n> Food & Drink: What is sushi traditionally wrapped in?" +
                        "\n1. Rosemary" +
                        "\n2. Spinach" +
                        "\n3. Seaweed" +
                        "\n4. Asparagus");
        }
    }

}