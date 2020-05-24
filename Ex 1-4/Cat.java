public class Cat extends Animal{

    public Cat(String type, String name) {
        super(type, name);
        this.maxRun = 200;
        this.maxJump = 2d;
    }

    @Override
    public void swim() {
        System.out.println("Cats can't swimming =( ");
    }

}