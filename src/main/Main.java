package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        //Obtener la cantidad de usuarios con una edad mayor a 18
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Pedro", 21));

        //Imperativo
        int contador = 0;
        for (User user : users) {
            if (user.getAge() > 18) {
                contador++;
            }
        }
        System.out.println(contador);

        //Declarativo
        contador = (int)users.stream().filter(user -> user.getAge() > 18).count();
        System.out.println(contador);
    }
}
