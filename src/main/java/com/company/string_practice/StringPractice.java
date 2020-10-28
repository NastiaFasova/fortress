package com.company.string_practice;

import java.util.List;

public class StringPractice {

    /* Метод, який використовує StringBuilder
    з метою редагування рядків не використовуючи конкатенацію
    */
    public String strBuilderUse(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    /* Метод, який використовує split()
    з метою розділення строк на масив строк за вказаним символом
    */
    public String[] strSplitUse(String str, String delimiter) {
            return str.split(delimiter);
    }

    // Метод, який використовує конкатенацію строк з числами
    public <T extends Number> String concatDiffTypes(String str, List<T> numbers) {
        for (T num : numbers) {
            str += num;
        }
        return str;
    }
}
