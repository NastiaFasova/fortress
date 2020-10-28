package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        /* Array of heights for towers of fortress f1 */
        ArrayList<Float> heights1 = new ArrayList<Float>();
        heights1.add((float) 50);
        heights1.add((float) 30);
        heights1.add((float) 20.2);

        /* Array of heights for towers of fortress f2 */
        ArrayList<Float> heights2 = new ArrayList<Float>();
        heights2.add((float) 10);
        heights2.add((float) 12.4);
        heights2.add((float) 17.9);

        /* Array of warriors for garrison of fortress f1 */
        ArrayList<Warrior> warriors1 = new ArrayList<Warrior>();
        warriors1.add(new Warrior("James", "Williams", TypeOfWarrior.Archer));
        warriors1.add(new Warrior("Mike", "Karry", TypeOfWarrior.Spearman));
        warriors1.add(new Warrior("Jordan", "Black", TypeOfWarrior.Swordsman));

        /* Array of warriors for garrison of fortress f2 */
        ArrayList<Warrior> warriors2 = new ArrayList<Warrior>();
        warriors2.add(new Warrior("Jean", "Jacques", TypeOfWarrior.Archer));
        warriors2.add(new Warrior("Bruse", "Feamen", TypeOfWarrior.Spearman));
        warriors2.add(new Warrior("Kevin", "Rockless", TypeOfWarrior.Swordsman));

        /* Creating 2 Person objects to set in f1 and f2 */
        Person g1 = new Person("George", "Washington");
        Person g2 = new Person("John", "Rafr");

        /* Fortress f1 to test setters */
        Fortress f1 = new Fortress();
        f1.setName("Akkerman");
        f1.setCentury(16);
        f1.setSquare(2000);
        f1.setTowers(heights1);
        f1.setGarrison(warriors1);
        f1.setGovernor(g1);

        /* Fortress f2 to test constructor */
        Fortress f2 = new Fortress(15, 1540, "Khotyn", heights2, g2, warriors2);

        /* Array of fortresses for iterator */
        ArrayList<Fortress> f = new ArrayList<Fortress>();
        f.add(f1);
        f.add(f2);

        /* Showing each fortress in array */
        Iterator<Fortress> it = f.iterator();
        while(it.hasNext()) {
            it.next().show();
        }

        System.out.println(TypeOfWarrior.showTypeOfWarriors());

        System.out.println(Arrays.toString(TypeOfWarrior.values()));
    }
}
