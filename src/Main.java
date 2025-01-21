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



    }
}