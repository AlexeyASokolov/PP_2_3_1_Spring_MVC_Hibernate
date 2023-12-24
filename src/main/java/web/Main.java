package web;


import web.service.UserService;
import web.service.UserServiceImpl;

public class Main {

    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();
        userService.saveUser("First", "Firsrov", ( byte) 11);
        userService.saveUser("Second", "Secondov", ( byte) 22);
        userService.saveUser("Pupa", "Lupov", ( byte) 69);
        userService.saveUser("Lupa", "Pupov", ( byte) 96);
        userService.removeUserById(3);
        userService.getAllUsers();
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}
