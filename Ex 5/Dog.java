public class Dog extends Animal {

    public Dog(String type, String name) {
        super(type, name);
        this.maxSwim = 10;
    }

    // При попытке сделать по аналогии с бегом и прыжками (убрать protected int maxRun из класса Animal)
    // и включением int maxSwim в метод ниже выскакивают 2 ошибки:
    // Error:(1, 8) java: Dog is not abstract and does not override abstract method swim() in Animal
    // Error:(7, 5) java: method does not override or implement a method from a supertype
    // (повторная имплементация не помогла)
    @Override
    public void swim() {
        int distance = (int) (Math.random()*maxSwim);
        System.out.println("Dog swims " + distance + " meters");
    }

}