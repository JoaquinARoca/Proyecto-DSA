package dsa.proyectoandroid.androidg4.services;

import dsa.proyectoandroid.androidg4.models.Product;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ProductService {
    @POST("/dsaApp/productos")
    Call<Product> createProduct(@Body Product product);

    @GET("/dsaApp/productos/{id}")
    Call<Product> getProductById(@Path("id") String id);

    @GET("/dsaApp/productos/{id}/precio")
    Call<Double> getProductPrice(@Path("id") String id);
}
