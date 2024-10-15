package org.example.exercice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    static List<Client> createClients(List<String> names) {
        List<Client> createdClients = new ArrayList<>();
        Random random = new Random();
        Supplier<Integer> randomNumber = () -> random.nextInt(101);

        names.forEach(name -> {
            String randomName = randomNumber.get() + name;
            createdClients.add(new Client(randomName, randomName + "@gmail.com", randomNumber.get(), randomNumber.get() > 50));
        });

        return  createdClients;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "David", "Eve", "Jacob");
        List<Client> randomClients = createClients(names);
        randomClients.forEach(client -> System.out.println(client.toString()));
    }
}
