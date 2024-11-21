package dsa.proyectoandroid.androidg4.adapter;

import java.util.List;

import dsa.proyectoandroid.androidg4.RetrofitClient;
import dsa.proyectoandroid.androidg4.models.User;
import dsa.proyectoandroid.androidg4.services.UserService;
import retrofit2.Call;
import retrofit2.Callback;

public class UserAdapter {
    private UserService userService;

    public UserAdapter() {
        this.userService = RetrofitClient.getRetrofitInstance().create(UserService.class);
    }

    public void getUsers(Callback<List<User>> callback) {
        Call<List<User>> call = userService.getUsers();
        call.enqueue(callback);
    }

    public void getUserByName(String name, Callback<User> callback) {
        Call<User> call = userService.getUserByName(name);
        call.enqueue(callback);
    }

    public void createUser(User user, Callback<User> callback) {
        Call<User> call = userService.createUser(user);
        call.enqueue(callback);
    }

    public void login(User credentials, Callback<Void> callback) {
        Call<Void> call = userService.login(credentials);
        call.enqueue(callback);
    }
}
