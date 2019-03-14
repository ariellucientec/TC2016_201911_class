package Tareas.T3_2_RedesSociales;

public class Test
{
    public static void main(String[] args) 
    {
        Facebook f = new Facebook();
        
        User user1 = new User("ariellucien", "contrasenia");
        User user2 = new User("alfred", "contrasenia");
        f.addUser(user1);
        f.login(user1);
        f.login(user2); //intento loggear al usuario 2, pero como no lo he agregado me debe decir que no
        f.postMessage("este es un mensaje de prueba que voy a publicar en mi post de facebook. Espero que sean suficientes caracteres", user1);                
        f.postMessage("el segundo usuario trate de poster", user2);
        f.logout(user1);
        f.logout(user2); //intento desloggear a un usuario que no hizo login

    }
}