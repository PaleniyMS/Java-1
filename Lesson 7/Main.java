public class Main {

    // 1. Расширить задачу про котов и тарелки с едой.
    // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    // (например, в миске 10 еды, а кот пытается покушать 15-20).
    // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    // 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
    // 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
    // и потом вывести информацию о сытости котов в консоль.
    // 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public static void main(String[] args) {
        Cat[] cat = new Cat[3]; //Создаем массив из 3-х котов
        cat[0] = new Cat("Persik", 7);
        cat[1] = new Cat("Murzik", 6);
        cat[2] = new Cat("Barsik", 5);
        Plate plate = new Plate(50); 
        plate.info();

        catsFoodFest(cat, plate);
        System.out.println();

        plate.addFood(60); // Вызываем метод добавления еды в миску
        System.out.println("Food is added to the plate");
        plate.info();
    }

    // Создаем метод с циклом кормления до тех пор, пока одному из котов не хватит еды, чтобы удовлетворить аппетит
    public static void catsFoodFest(Cat[] cat, Plate plate) {
        do {
            for (int i = 0; i < cat.length; i++) {
                if (plate.getFood() > cat[i].getAppetite()) {
                    cat[i].eat(plate);
                    System.out.println(String.format("Cat %s ate %s of food", cat[i].getName(), cat[i].getAppetite()));
                    plate.info();
                } else System.out.println(String.format("Too little food in the plate... Cat %s is hungry", cat[i].getName()));
            }
        } while (plate.getFood() >= 5);
    }
}