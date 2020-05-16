import java.util.Scanner;

public class Main {

    //Задание 1. Написать программу, которая загадывает случайное число от 0 до 9.
    // пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void main(String[] args) {
        enterTheNameAndNumber();
        rollRandomNumber();
        guessTheNumber(rollRandomNumber());
    }

    static void enterTheNameAndNumber() {
        System.out.println("Hi! What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Aloha, " + name + "! Can you try to guess the number I set? You have only 3 attempts...");
    }

    static int rollRandomNumber() {
        return (int) (Math.random() * 10);
    }

    static void guessTheNumber(int rollRandomNumber) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 3;
        do {
            for (int i = 0; i < attempt; i++) {
                System.out.println("Enter your number:");
                int number = scanner.nextInt();
                if (number == rollRandomNumber) {
                    System.out.println("Wow! You're lucker! It's true!");
                    break;
                } else if (number > rollRandomNumber) {
                    System.out.println("No... Guessed number is smaller...");
                } else System.out.println("No... Guessed number is bigger...");
                if ((i - 1) > 0) {
                    System.out.println("Sorry, you're lose... (o_O)");
                }
            }
            System.out.println("Do you want to play one more time? 1 – yes / 0 – no");
        } while (scanner.nextInt() == 1);
    }
}

