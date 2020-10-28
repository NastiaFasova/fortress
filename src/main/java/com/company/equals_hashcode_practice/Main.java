package com.company.equals_hashcode_practice;

import com.company.Person;
import com.company.Tower;
import com.company.exception.NotEnoughHighForTowerException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NotEnoughHighForTowerException {
        Scanner scanner = new Scanner(System.in);
        EqualsHashcodePractice practice = new EqualsHashcodePractice();
        Person person1 = new Person("Dmytro", "Petrenko");
        Person person2 = new Person("Dmytro", "Petrenko");
        Tower tower1 = new Tower(19, 200, 18.5f);
        Tower tower2 = new Tower(19, 200, 18.5f);
        while (true) {
            System.out.println("\nEnter the number of the function you'd like to test: ");
            display();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println(person1);
                    System.out.println(person2);
                    System.out.println("NonOverriddenHashcode\nAre hashcodes equal? "
                            + practice.nonOverriddenHashcode(person1, person2));
                    break;
                }
                case 2 : {
                    System.out.println(tower1);
                    System.out.println(tower2);
                    System.out.println("OverriddenHashcode\nAre hashcodes equal? "
                            + practice.overriddenHashcode(tower1, tower2));
                    break;
                }
                case 3 : {
                    System.out.println(tower1);
                    System.out.println(tower2);
                    System.out.println("OverriddenEquals\n Are object equal? "
                            + practice.overriddenEquals(tower1, tower2));
                    break;
                }
                case 4 : {
                    System.out.println(person1);
                    System.out.println(person2);
                    System.out.println("NonOverriddenEquals\n Are object equal? "
                            + practice.nonOverriddenEquals(person1, person2));
                    break;
                }
                case 5 : {
                    System.exit(0);
                }
            }
        }
    }
    static void display() {
        System.out.println("1. NonOverriddenHashcode");
        System.out.println("2. OverriddenHashcode");
        System.out.println("3. OverriddenEquals");
        System.out.println("4. NonOverriddenEquals");
        System.out.println("Exit...");
    }
}
