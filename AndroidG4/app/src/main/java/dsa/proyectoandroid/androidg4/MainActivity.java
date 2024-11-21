package dsa.proyectoandroid.androidg4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import dsa.proyectoandroid.androidg4.adapter.UserAdapter;
import dsa.proyectoandroid.androidg4.models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura la base URL de tu API
        userAdapter = new UserAdapter();

        // Enlaza el botón de registro
        Button registerButton = findViewById(R.id.Registerbtn);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterClick();
            }
        });
    }

    protected void RegisterClick(){
        String nombre = "NuevoUsuario";
        String contraseña = "Contraseña123";

        User nuevoUsuario = new User(null, nombre, contraseña);

        // Llama al método de registro del adaptador
        userAdapter.createUser(nuevoUsuario, new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this,
                            "Usuario registrado: " + response.body().getNom(),
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Error al registrar usuario: " + response.code(),
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this,
                        "Fallo en la conexión: " + t.getMessage(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}