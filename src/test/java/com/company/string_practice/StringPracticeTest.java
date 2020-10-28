package com.company.string_practice;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringPracticeTest {

    private StringPractice practice = new StringPractice();
    private String str;
    private String strForSplit;

    @Before
    public void setUp()  {
        str = "Hello this beautiful world";
        strForSplit = "Hello*this*beautiful*world";
    }

    @Test
    public void strBuilderUse() {
        String[] arrayOfStr1 = practice.strSplitUse(str, " ");
        String expected = "Hello this beautiful world";
        String actual1 = practice.strBuilderUse(arrayOfStr1);
        Assert.assertEquals(expected, actual1);

        String[] arrayOfStr2 = practice.strSplitUse(strForSplit, "\\*");
        String actual2 = practice.strBuilderUse(arrayOfStr2);
        Assert.assertEquals(expected, actual2);
    }

    @Test
    public void strSplitUse() {
        String[] expected = {"Hello", "this", "beautiful", "world"};
        String[] actual = practice.strSplitUse(strForSplit, "\\*");
        Assert.assertArrayEquals(expected, actual);

        String[] expected2 = {"Hello", "this", "beautiful", "world"};
        String[] actual2 = practice.strSplitUse(str, " ");
        Assert.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void concatDiffTypes() {
        String expected1 = str + "234";
        Assert.assertEquals(expected1, practice.concatDiffTypes(str, List.of(2, 3, 4) ));

        String expected2 = str + "2.12.2";
        Assert.assertEquals(expected2, practice.concatDiffTypes(str, List.of(2.1f, 2.2f)));

        String expected3 = str + "0.90.80.1";
        Assert.assertEquals(expected3, practice.concatDiffTypes(str, List.of(0.9, 0.8, 0.1)));

    }
}