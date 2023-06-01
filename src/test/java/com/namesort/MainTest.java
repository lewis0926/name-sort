package com.namesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {

    @Test
    void testNameSort() {
        List<String> names = new ArrayList<>(List.of("Janet Parsons",
                "Vaughn Lewis",
                "Adonis Julius Archer",
                "Shelby Nathan Yoder",
                "Marin Alvarez",
                "London Lindsey",
                "Beau Tristan Bentley",
                "Leo Gardner",
                "Hunter Uriah Mathew Clarke",
                "Mikayla Lopez",
                "Frankie Conner Ritter"
        ));
        List<String> answerNames = new ArrayList<>(List.of("Marin Alvarez",
                "Adonis Julius Archer",
                "Beau Tristan Bentley",
                "Hunter Uriah Mathew Clarke",
                "Leo Gardner",
                "Vaughn Lewis",
                "London Lindsey",
                "Mikayla Lopez",
                "Janet Parsons",
                "Frankie Conner Ritter",
                "Shelby Nathan Yoder"
        ));

        List<Name> nameList = new ArrayList<>();
        for (String name: names) {
            nameList.add(new Name(name));
        }

        Main.nameSort(nameList);

        for (int i = 0; i < nameList.size(); i++) {
            Assertions.assertEquals(nameList.get(i).toString(), answerNames.get(i));
        }
    }
}
