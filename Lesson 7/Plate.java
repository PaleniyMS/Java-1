public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }

    public void info() {
        System.out.println("Balance food in plate: " + food);
    }

    public int getFood() {
        return food;
    }

    // Создаем метод добавления еды в миску
    public void addFood(int additionalFood){
        this.food += additionalFood;
    }
}
