package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Filtar
        //Obtener la cantidad de usuarios con una edad mayor a 18 y su username comience con R.

        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Pedro", 21));

        long cantidad =  users.stream()//1
                .filter(user -> user.getAge() > 18)//2
                .filter(user -> user.getUsername().startsWith("R"))//3
                .count();//4
        System.out.println(cantidad);
    }
}
