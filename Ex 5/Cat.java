public class Cat extends Animal{

    public Cat(String type, String name) {
        super(type, name);
    }

    @Override
    public void swim() {
        System.out.println("Cats can't swimming =( ");
    }

}