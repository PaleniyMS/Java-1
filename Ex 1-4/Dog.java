public class Dog extends Animal {

    public Dog(String type, String name) {
        super(type, name);
        this.maxRun = 500;
        this.maxJump = 0.5d;
        this.maxSwim = 10;
    }

    @Override
    public void swim() {
        int distance = (int) (Math.random()*maxSwim);
        System.out.println("Dog swims " + distance + " meters");
    }
}