package org.example.exercice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class Main {
    public static void main(String[] args) {
        Consumer<Client> sendEmail = (Client cliente) -> System.out.println("Email sent to: " + cliente.name + " in the email: " + cliente.email);

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Alice", "alice@example.com", 23, true));
        clients.add(new Client("Carol", "carol@test.com", 29, true));
        clients.add(new Client("Eve", "eve@example.com", 26, true));
        clients.add(new Client("Grace", "david@email.com", 45, false));
        clients.add(new Client("Ivy", "ivy@domain.com", 41, true));
        clients.add(new Client("Alice", "bob@domain.com", 34, false));
        clients.add(new Client("Grace", "grace@test.com", 19, false));
        clients.add(new Client("Frank", "frank@domain.com", 52, true));
        clients.add(new Client("Hannah", "hannah@email.com", 37, true));

        Comparator<Client> sortByNameOrAge = Comparator.comparing(Client::getName).thenComparing(Comparator.comparing(Client::getAge).reversed());

        clients.sort(sortByNameOrAge);

        clients.forEach(client -> System.out.println(client.toString()));
    }
}
