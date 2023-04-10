package org.oleszl.animals;

import lombok.Getter;

@Getter
public class Bison extends Animal {

    private final int sequenceNumber;

    private static int number = 1;

    public Bison(String animalName, int age, String gender) {
        super(animalName, age, gender);
        this.sequenceNumber = number++;
    }

    @Override
    public String voice() {
        return "snorts";
    }

    @Override
    public String toString() {
        return "Bison{" +
               "sequenceNumber=" + sequenceNumber +
               ", animalName='" + animalName + '\'' +
               ", age=" + age +
               ", gender='" + gender + '\'' +
               '}';
    }
}
