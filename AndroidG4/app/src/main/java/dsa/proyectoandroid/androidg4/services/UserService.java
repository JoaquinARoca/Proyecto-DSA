package dsa.proyectoandroid.androidg4.services;

import java.util.List;

import dsa.proyectoandroid.androidg4.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {
    @GET("/dsaApp/usuarios")
    Call<List<User>> getUsers();

    @GET("/dsaApp/usuarios/{nombre}")
    Call<User> getUserByName(@Path("nombre") String name);

    @POST("/dsaApp/usuarios")
    Call<User> createUser(@Body User user);

    @POST("/dsaApp/usuarios/login")
    Call<Void> login(@Body User credentials);
}
