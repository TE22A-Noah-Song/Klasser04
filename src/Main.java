import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book1 = new Book("Harry Potter", 521);
        Book book2 = new Book("Diary of a wimpy kid", 210);
        Book book3 = new Book("The bible", 1200);
        System.out.println("You read " + book1.name + " and you are currently on page " + book1.currentPage);
        book1.turnPage();
        book1.turnPage();
        System.out.println("Now you are on page " + book1.currentPage);

        System.out.println("How many rocks do you want?");
        Scanner sc = new Scanner(System.in);
        int totalRocks = sc.nextInt();

        ArrayList<Rock> Rocks = new ArrayList<Rock>();

        for (int i = 0; i < totalRocks; i++) {
            System.out.println("How much do you want rock " + (i + 1) + " to weight (kg)?");
            double weight = sc.nextDouble();
            Rocks.add(new Rock(weight));
        }

        for (int i = 0; i < totalRocks; i++) {
            System.out.println("Rock " + (i + 1) + ": " + Rocks.get(i).getWeight() + " kg");
        }

    Worker worker1 = new Worker("Bob", 31);
        BlueCollar worker2 = new BlueCollar("Joe", 21);
    WhiteCollar worker3 = new WhiteCollar("Jane", 44);

        // call setWage to give a random salary to worker
        worker1.setWage();
        worker2.setWage();
        worker3.setWage();

        System.out.println(worker1.getName() + " is " + worker1.getAge() + " years old and earns $" + worker1.getWage());
        System.out.println(worker2.getName() + " is " + worker2.getAge() + " years old and earns $" + worker2.getWage());
        System.out.println(worker3.getName() + " is " + worker3.getAge() + " years old and earns $" + worker3.getWage());

        worker2.build();
        worker2.repair();
        worker2.destroy();

        worker3.drinkCoffee();
        worker3.attendMeeting();
        worker3.doSpreadSheets();
    }
}