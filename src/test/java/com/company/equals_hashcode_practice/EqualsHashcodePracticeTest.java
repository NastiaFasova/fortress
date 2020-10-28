package com.company.equals_hashcode_practice;

import com.company.Person;
import com.company.Tower;
import com.company.exception.NotEnoughHighForTowerException;
import org.junit.Assert;
import org.junit.Test;

public class EqualsHashcodePracticeTest {

    private EqualsHashcodePractice practice = new EqualsHashcodePractice();
    private Person person1 = new Person("Oleh", "Pastushko");
    private Person person2 = new Person("Oleh", "Pastushko");
    private Tower tower1;
    private Tower tower2;
    {
        try {
            tower1 = new Tower(19, 200, 18.5f);
            tower2 = new Tower(19, 200, 18.5f);
        } catch (NotEnoughHighForTowerException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void nonOverriddenHashcode() {
        boolean actual = practice.nonOverriddenHashcode(person1, person2);
        Assert.assertFalse(actual);

    }

    @Test
    public void overriddenHashcode() {
        boolean actual = practice.overriddenHashcode(tower1, tower2);
        Assert.assertTrue(actual);
    }

    @Test
    public void overriddenEquals() {
        boolean actual = practice.overriddenEquals(tower1, tower2);
        Assert.assertTrue(actual);
    }

    @Test
    public void nonOverriddenEquals() {
        boolean actual = practice.nonOverriddenEquals(person1, person2);
        Assert.assertFalse(actual);
    }
}