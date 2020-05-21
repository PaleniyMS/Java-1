import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Создаем массив из 5 работников
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Giner Evgeny Lenorovich", "Director", "e_giner@mailbox.com", "1234567890", 300000, 56);
        empArr[1] = new Employee("Babaev Roman Yuryevich", "Chief of Staff", "r_babaev@mailbox.com", "2345678901", 250000, 45);
        empArr[2] = new Employee("Sherstova Olga Ivanovna", "Secretary", "o_sherstova@mailbox.com", "3456789012", 80000, 29);
        empArr[3] = new Employee("Panyushev Alexfndr Vladimirovich", "Head of Department", "a_panyushev@mailbox.com", "4567890123", 180000, 38);
        empArr[4] = new Employee("Ischenko Nataly Vladimirovna", "Manager", "n_ischenko@mailbox.com", "5678901234", 120000, 35);
        ageSeparator(empArr);
    }

    //Создаем метод, запрашивающий работников старше какого возраста мы ищем
    public static void ageSeparator (Employee[] empArr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employees older than what age are you looking for?");
        int filtr = scanner.nextInt();
        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() > filtr) {
                empArr[i].Show();
            }
        }
    }
}