package Tareas.T3_2_RedesSociales;

public class User
{
    protected String userName;
    protected String password;
    protected Boolean logged;
    public User(String name, String pass)
    {
        userName = name;
        password = pass;
    }

    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean equals(User u)
    {
        if(getUserName().equals(u.getUserName()) && getPassword().equals(u.getPassword()) )
        {
            return true;
        }
        return false;
    }
}