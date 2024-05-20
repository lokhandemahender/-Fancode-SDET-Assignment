package org.fancode;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.fancode.model.Todo;
import org.fancode.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;


public class ApiClient {

    private static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public static List<User> getUsers() throws IOException, ParseException {
        String response = Request.get(BASE_URL + "/users")
                .execute()
                .returnContent()
                .asString();
        Type userListType = new TypeToken<List<User>>() {}.getType();
        return new Gson().fromJson(response, userListType);
    }

    public static List<Todo> getTodos() throws IOException, ParseException {
        String response = Request.get(BASE_URL + "/todos")
                .execute()
                .returnContent()
                .asString();
        Type todoListType = new TypeToken<List<Todo>>() {}.getType();
        return new Gson().fromJson(response, todoListType);
    }
}