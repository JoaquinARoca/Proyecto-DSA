package dsa.proyectoandroid.androidg4.adapter;

import dsa.proyectoandroid.androidg4.RetrofitClient;
import dsa.proyectoandroid.androidg4.models.Product;
import dsa.proyectoandroid.androidg4.services.ProductService;
import retrofit2.Call;
import retrofit2.Callback;

public class ProductAdapter {
    private ProductService productService;

    public ProductAdapter() {
        this.productService = RetrofitClient.getRetrofitInstance().create(ProductService.class);
    }

    public void getProductById(String id, Callback<Product> callback) {
        Call<Product> call = productService.getProductById(id);
        call.enqueue(callback);
    }

    public void createProduct(Product product, Callback<Product> callback) {
        Call<Product> call = productService.createProduct(product);
        call.enqueue(callback);
    }

    public void getProductPrice(String id, Callback<Double> callback) {
        Call<Double> call = productService.getProductPrice(id);
        call.enqueue(callback);
    }
}
