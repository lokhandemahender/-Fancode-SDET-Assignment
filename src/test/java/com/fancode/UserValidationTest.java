package com.fancode;

import org.fancode.UserValidation;
import org.fancode.model.Todo;
import org.fancode.model.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidationTest {

    @Test
    public void testIsFancodeCityUser() {
        User user = new User();
        user.address = new User.Address();
        user.address.geo = new User.Address.Geo();
        user.address.geo.latitude = 1.0;
        user.address.geo.longitude = 10.0;

        assertTrue(UserValidation.isFancodeCityUser(user));
    }

    @Test
    public void testGetCompletedTaskPercentage() {
        User user = new User();
        user.id = 1;

        List<Todo> todos = Arrays.asList(
                new Todo() {{ userId = 1; completed = true; }},
                new Todo() {{ userId = 1; completed = false; }},
                new Todo() {{ userId = 1; completed = true; }},
                new Todo() {{ userId = 2; completed = true; }}
        );

        double percentage = UserValidation.getCompletedTaskPercentage(user, todos);
        assertEquals(66.66666666666666, percentage);
    }

    @Test
    public void testValidateUserTasks() {
        User user = new User();
        user.id = 1;

        List<Todo> todos = Arrays.asList(
                new Todo() {{ userId = 1; completed = true; }},
                new Todo() {{ userId = 1; completed = false; }},
                new Todo() {{ userId = 1; completed = true; }},
                new Todo() {{ userId = 2; completed = true; }}
        );

        assertTrue(UserValidation.validateUserTasks(user, todos));
    }
}
