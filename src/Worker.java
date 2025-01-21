import java.util.Random;

public class Worker {
    //attributes
    protected String name;
    protected int age;
    protected double wage=0;

    //constructor
    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }

    //methods
    protected double setWage(){
        Random random = new Random();
        wage = random.nextDouble(5001); // 0 to 5000
        return wage;
    }

    protected String getName(){
    return name;
    }

    protected int getAge(){
    return age;
    }

    protected double getWage(){
        return wage;
    }


}
