package OOPs.Basics.AbstractClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Son s1 = new Son(12);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the carrer");

        String carrer = input.nextLine();
        s1.carrer(carrer);
        s1.getAge();

    }
}
