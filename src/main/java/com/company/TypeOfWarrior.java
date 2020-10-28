package com.company;

/* Three types of warriors */
public enum TypeOfWarrior {
    Archer("bow"),
    Swordsman("sword"),
    Spearman("spear");

    private String weapon;

    TypeOfWarrior(String weapon) {
        this.weapon = weapon;
    }

    TypeOfWarrior() {
    }

    public static String showTypeOfWarriors() {// власний метод для того, щоб не використовувати конкатенацію строк
        System.out.print("TypeOfWarrior enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (TypeOfWarrior typeOfWarrior : TypeOfWarrior.values()) {
            if (typeOfWarrior.weapon != null) {
                stringBuilder.append(typeOfWarrior)
                        .append("weapon: ")
                        .append(typeOfWarrior.weapon)
                        .append("; ");
            } else {
                stringBuilder.append(typeOfWarrior);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    @Override
    public String toString() {
        return "TypeOfWarrior{" +
                "weapon='" + weapon + '\'' +
                "} " + super.toString();
    }
}
