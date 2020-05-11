public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, everyone!"); //Задание 1. Создан метод main.

        // Задание 2. Создаем переменные разных типов и инициализируем их значения.
        int a = 87;
        byte b = -25;
        short c = 355;
        float d = 5.48f;
        long e = 35488L;
        double f = 34.34d;
        char g = 524;
        String h = new String("Something awesome");

        //Задание 3. Создаем метод, возвращающие результаты калькуляции.
        //Если бы значения переменных были объявлены заранее, можнобыло бы указать calc(int a, byte b, short c, float d).
        public static float calc(int a, byte b, short c, float d) {
            calc = a * (b + (c / d))
            return calc;
        }

        //Задание 4.  Создаем метод, проверяющий находятся ли результат суммы переменных в пределах между 10 и 20.
        public static void from10To20(int a, byte b) {
            if ((a + b) <= 20 && (a + b) >= 10) {
                System.out.println("It's true");
            } else System.out.println("It's false...");
        }

        //Задание 5. Создаем метод, передаем ему целое число и проверяем положительное оно или отрицательное.
        public static void plusMinus(int a){
            if (a >= 0) {
                System.out.println("Число - положительное!");
            } else if (a < 0) {
                System.out.println("Число - отрицательное!");
            }
        }

        //Задание 6. Создаем метод, которые проверяет отрицательно ли число. Если отрицательное - передает true.
        public static boolean minus(int a){
            minus = (a < 0);
            return minus;
        }

        //Задание 7. Создаем метод, который запрашивает ввод имени и выводит приветствие с полученным именем.
        public static void name() {
            System.out.println("Hello! What's your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            System.out.println("I'm glad to meet you, " + name + "!");
        }

        //Задание 8. Создаем методо, который определяет, является ли год високосным, и выводит сообщение с результатом.
        public static void year() {
            System.out.println("Hello! Enter the year you want to check...");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
                System.out.println("Entered year is leap!");
            } else System.out.println("Entered year isn't leap!");
        }
    }
}