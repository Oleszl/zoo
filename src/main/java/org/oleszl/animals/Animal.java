package org.oleszl.animals;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    protected String animalName;
    protected int age;

    protected String gender;
    public abstract String voice();
}
