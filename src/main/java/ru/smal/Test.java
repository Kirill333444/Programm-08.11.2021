package ru.smal;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.smal.model.User;
import ru.smal.service.UserService;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        UserService userService = new UserService(factory);

        userService.save(new User("Nikita", "Malysev", 5));


    }
}
