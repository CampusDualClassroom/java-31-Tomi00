package com.campusdual.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise31 {

    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/resources/lorem.txt");

        try {
            Files.lines(filePath).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

