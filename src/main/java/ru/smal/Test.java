package ru.smal;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.smal.model.User;
import ru.smal.service.UserService;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        UserService userService = new UserService(factory);

        User user = new User("Vladimir", "Vladimirov", 20);



        //Save
        userService.save(user);

        //Update
        final User byId = userService.findById(1);
        byId.setFirstName("X");
        byId.setLastName("X");
        byId.setAge(10);
        userService.update(byId);

        //Delete
        userService.delete(userService.findById(34));

    }
}
