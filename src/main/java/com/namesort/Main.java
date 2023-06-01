package com.namesort;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please input a filename");
            return;
        }

        String outputFilename = "sorted-names-list.txt";
        String filename = args[0];

        List<Name> nameList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println(String.format("Reading file: %s", filename));

            String line;
            while ((line = reader.readLine()) != null) {
                nameList.add(new Name(line.trim()));
            }
        } catch (IOException ex) {
            System.out.println(String.format("Error in reading file: %s", filename));
        }

        nameSort(nameList);

        System.out.println(String.format("Writing output file: %s", outputFilename));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
            for (Name name: nameList) {
                System.out.println(name);
                writer.write(String.format("%s\n", name.toString()));
            }
        } catch (IOException ex) {
            System.out.println(String.format("Error in writing file: %s", filename));
        }
    }

    public static void nameSort(List<Name> nameList) {
        Collections.sort(nameList);
    }
}
