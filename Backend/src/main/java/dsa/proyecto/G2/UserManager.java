package dsa.proyecto.G2;

import dsa.proyecto.G2.models.User;

import java.util.List;

public interface UserManager {
    User getUsuarioPorId(String id);
    User getUsuarioPorNombre(String nombre);
    void addUsuario(User usuario);

    void addUsuario(String id, String nombre, String password);

    void addUsuario(String nombre, String password);

    List<User> getUsuarios();
    boolean removeUsuario(String id);
}
