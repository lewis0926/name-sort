package com.namesort;

import java.util.Arrays;
import java.util.List;

class Name implements Comparable<Name> {
    private String lastName;
    private List<String> givenNames;

    public Name(String fullName) {
        String[] names = fullName.split(" ");
        this.lastName = names[names.length -1];
        this.givenNames = List.of(Arrays.copyOf(names, names.length - 1));
    }

    @Override
    public int compareTo(Name name) {
        return this.lastName.compareTo(name.lastName);
    }

    public String toString() {
        return String.join(" ", this.givenNames) + " " + this.lastName;
    }
}
