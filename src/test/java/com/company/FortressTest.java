package com.company;

import com.company.exception.NotEnoughSpaceForFortressException;
import org.junit.Test;

import java.util.List;

public class FortressTest {

    private Fortress fortress;
    private Tower tower;

    @Test(expected = NotEnoughSpaceForFortressException.class)
    public void constructorExceptionTest() {
        fortress = new Fortress(17, 120, "Podilskaya", List.of(18.9f),
                new Person("Inna", "Muliar"),
                List.of(new Warrior("Sergiy", "Karmeliuk", TypeOfWarrior.Archer)));
    }
}