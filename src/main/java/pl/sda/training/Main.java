package pl.sda.training;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<String> animals =
            Arrays.asList("cat", "dog", " mouse", "rat",
                    "pig", "rabbit", "hamster");

    public static void main(String[] args) {//metoda
        System.out.println("hello world");
        System.out.println(animals);
        for(String text:animals){
            System.out.println(text.trim());
        }
        animals.stream()
                .map(e->e.trim())
                .forEach(e->System.out.println(e));

        String animalsByComma = "";
        for(String animal:animals){
            animalsByComma=animalsByComma+animal+",";
        }
        System.out.println(animalsByComma);
    }
}
