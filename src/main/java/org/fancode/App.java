package org.fancode;

import org.fancode.model.Todo;
import org.fancode.model.User;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        try {
            List<User> users = ApiClient.getUsers();
            List<Todo> todos = ApiClient.getTodos();

            List<User> fancodeUsers = users.stream()
                    .filter(UserValidation::isFancodeCityUser)
                    .collect(Collectors.toList());

            fancodeUsers.stream()
                    .filter(user -> UserValidation.validateUserTasks(user, todos))
                    .forEach(user -> System.out.println("User " + user.name + " has completed more than 50% of their todo tasks."));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
