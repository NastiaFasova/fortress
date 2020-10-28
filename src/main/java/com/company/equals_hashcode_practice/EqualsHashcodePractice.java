package com.company.equals_hashcode_practice;

import com.company.Person;
import com.company.Tower;

public class EqualsHashcodePractice {

    /*Викликаємо неперевизначений метод hashcode() класу
        Person. В результаті функція повертає false,
    оскільки методи неперевизначені і щоразу генерується
    новий унікальний хешкод*/
    public boolean nonOverriddenHashcode(Person person1, Person person2) {
        return person1.hashCode() == person2.hashCode();
    }

    /*Викликаємо перевизначений метод hashcode() класу
        Tower. В результаті функція повертає true,
    оскільки методи перевизначені і об'єкти і рівними*/
    public boolean overriddenHashcode(Tower tower1, Tower tower2) {
        return tower1.hashCode() == tower2.hashCode();
    }

    /*Викликаємо перевизначений метод equals() класу
        Tower. В результаті функція повертає true,
    оскільки методи перевизначені і об'єкти і рівними*/
    public boolean overriddenEquals(Tower tower1, Tower tower2) {
        return tower1.equals(tower2);
    }

    /*Викликаємо неперевизначений метод equals() класу
       Person. В результаті функція повертає false,
    оскільки методи неперевизначені. Неперевизначений метод поверне
    true лише в тому випадку, якщо один об'єкт буде мати те ж посилання,
    що й інший(саме так порівнює об'єкти неперевизначений метод equals())*/
    public boolean nonOverriddenEquals(Person person1, Person person2) {
        return person1.equals(person2);
    }
}
