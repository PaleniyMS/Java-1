import java.text.DecimalFormat;

public abstract class Animal {
    protected String type;
    protected String name;
    protected int maxSwim;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void run(int maxRun) {
       int lenght = (int) (Math.random()*maxRun);
       System.out.println(String.format("%s %s runs %s meters", getType(), getName(), lenght));
    }

    public void jump(double maxJump) {
        double height = (Math.random()*maxJump);
        DecimalFormat df = new DecimalFormat("#.###"); //Используем класс DecimalFormat для округления height до 3 знаков после запятой
        System.out.println(String.format("%s %s runs %s meters", getType(), getName(), df.format(height)));
    }

    public abstract void swim();

}