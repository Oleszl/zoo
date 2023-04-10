package org.oleszl.animals;

import lombok.Getter;

@Getter
public class Elephant extends Animal {
    private final int sequenceNumber;

    private static int number = 1;

    public Elephant(String animalName, int age, String gender) {
        super(animalName, age, gender);
        this.sequenceNumber = number++;
    }

    @Override
    public String toString() {
        return "Elephant{" +
               "sequenceNumber=" + sequenceNumber +
               ", animalName='" + animalName + '\'' +
               ", age=" + age +
               ", gender='" + gender + '\'' +
               '}';
    }

    @Override
    public String voice() {
        return "trumpet";
    }
}
