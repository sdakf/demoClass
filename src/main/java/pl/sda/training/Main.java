package pl.sda.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Main {

    private static List<String> animals =
            Arrays.asList("cat", "dog", " mouse", "rat",
                    "pig", "rabbit", "hamster");

    public static void main(String[] args) {//metoda
        SpringApplication.run(Main.class);
    }

    private static void basics() {
        System.out.println("hello world");
        System.out.println(animals);
        for (String text : animals) {
            System.out.println(text.trim());
        }
        animals.stream()
                .map(e -> e.trim())
                .forEach(e -> System.out.println(e));

        String animalsByComma = "";
        int counter = 0;
        for (String animal : animals) {
            animalsByComma = animalsByComma + animal.trim();
            counter = counter + 1;
            if (counter < animals.size()) {
                animalsByComma = animalsByComma + ",";
            }
            else {
                animalsByComma = animalsByComma + ".";
            }
        }
        System.out.println(animalsByComma);
        int sum = Calculator.adding(3,8);
        System.out.println(sum);
        int subtract = Calculator.subtracting(3,8);
        System.out.println(subtract);
        int multiply = Calculator.multiplying(3,8);
        System.out.println(multiply);
    }
}
