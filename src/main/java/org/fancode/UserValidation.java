package org.fancode;

import org.fancode.model.Todo;
import org.fancode.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserValidation {
    public static boolean isFancodeCityUser(User user) {
        return user.address.geo.latitude >= -40 && user.address.geo.latitude <= 5 &&
                user.address.geo.longitude >= 5 && user.address.geo.longitude <= 100;
    }

    public static double getCompletedTaskPercentage(User user, List<Todo> todos) {
        List<Todo> userTodos = todos.stream().filter(todo -> todo.userId == user.id).collect(Collectors.toList());
        if (userTodos.isEmpty()) return 0;
        long completedCount = userTodos.stream().filter(todo -> todo.completed).count();
        return (double) completedCount / userTodos.size() * 100;
    }

    public static boolean validateUserTasks(User user, List<Todo> todos) {
        return getCompletedTaskPercentage(user, todos) > 50;
    }
}
