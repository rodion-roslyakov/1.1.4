package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.dropUsersTable();
        userService.createUsersTable();

        userService.saveUser("Rodion", "Roslyakov", (byte) 21);
        userService.saveUser("Andrey", "Malyshev", (byte) 21);
        userService.saveUser("Konstantin", "Kornilov", (byte) 49);
        userService.saveUser("Olga", "Sergeeva", (byte) 45);

        userService.removeUserById(3);
        userService.getAllUsers();
//        userService.cleanUsersTable();
    }
}