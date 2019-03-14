package Tareas.T3_2_RedesSociales;

public interface Session
{
    boolean login(User u);
    boolean logout(User u);
    boolean userLogged(User u);
}