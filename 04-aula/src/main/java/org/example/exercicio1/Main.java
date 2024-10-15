package org.example.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    static void sendEmail(Predicate<Client> isClientValid, Consumer<Client> sendEmail, List<Client> clientes) {
        clientes.stream().filter(isClientValid).forEach(sendEmail);
    }

    public static void main(String[] args) {
        Predicate<Client> isClientValid = (Client cliente) -> cliente.getAge() > 30 && cliente.getVip();
        Consumer<Client> sendEmail = (Client cliente) -> System.out.println("Email sent to: " + cliente.name + " in the email: " + cliente.email);

        List<Client> clientes = new ArrayList<>();
        clientes.add(new Client("Alice", "alice@example.com", 23, true));
        clientes.add(new Client("Bob", "bob@domain.com", 34, false));
        clientes.add(new Client("Carol", "carol@test.com", 29, true));
        clientes.add(new Client("David", "david@email.com", 45, false));
        clientes.add(new Client("Eve", "eve@example.com", 26, true));
        clientes.add(new Client("Frank", "frank@domain.com", 52, true));
        clientes.add(new Client("Grace", "grace@test.com", 19, false));
        clientes.add(new Client("Hannah", "hannah@email.com", 37, true));
        clientes.add(new Client("Ivy", "ivy@domain.com", 41, true));
        clientes.add(new Client("Jack", "jack@example.com", 58, false));
        clientes.add(new Client("Kara", "kara@test.com", 32, true));
        clientes.add(new Client("Leo", "leo@domain.com", 22, false));
        clientes.add(new Client("Mia", "mia@example.com", 28, true));
        clientes.add(new Client("Nick", "nick@email.com", 50, true));
        clientes.add(new Client("Olivia", "olivia@domain.com", 21, false));
        clientes.add(new Client("Paul", "paul@test.com", 46, true));
        clientes.add(new Client("Quinn", "quinn@email.com", 33, false));
        clientes.add(new Client("Rachel", "rachel@domain.com", 48, true));
        clientes.add(new Client("Steve", "steve@example.com", 38, false));
        clientes.add(new Client("Tina", "tina@test.com", 24, true));

        sendEmail(isClientValid, sendEmail, clientes);
    }
}
