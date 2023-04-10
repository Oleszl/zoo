package org.oleszl.animals;

import lombok.Getter;

@Getter
public class Tiger extends Animal {
    private final int sequenceNumber;
    private static int number = 1;

    public Tiger(String animalName, int age, String gender) {
        super(animalName, age, gender);
        this.sequenceNumber = number++;
    }

    @Override
    public String voice() {
        return "Grrrrrrr!";
    }

    @Override
    public String toString() {
        return "Tiger{" +
               "sequenceNumber=" + sequenceNumber +
               ", animalName='" + animalName + '\'' +
               ", age=" + age +
               ", gender='" + gender + '\'' +
               '}';
    }
}
