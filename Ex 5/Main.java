public class Main {

    // 5. * Добавить животным разброс в ограничениях.
    // То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat","Persik");
        Cat cat2 = new Cat("Cat","Murzik");
        Dog dog1 = new Dog("Dog","Druzhok");
        Dog dog2 = new Dog("Dog","Sharik");

        cat1.run(200);
        cat2.run(300);
        dog1.run(400);
        dog2.run(600);
        System.out.println();

        cat1.jump(2);
        cat2.jump(2.5);
        dog1.jump(0.6);
        dog2.jump(0.4);
        System.out.println();

        cat1.swim(); //Т.к. кошки не умеют плавать выводить строку для каждой кошки не обязательно.
        dog1.swim();
        dog2.swim();
        System.out.println();
    }
}