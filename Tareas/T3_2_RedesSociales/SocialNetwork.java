package Tareas.T3_2_RedesSociales;

public abstract class SocialNetwork implements Session
{
    protected String socialNetworkName;
    protected int maxNumberOfUsers;
    protected int contUsers;
    protected int contLoggedUsers;
    protected User[] userArray;
    protected User[] loggedUsers; //aquí voy a guardar a cada usuario que haya hecho login
    
    public SocialNetwork()
    {        
        maxNumberOfUsers = 10;
        contUsers = 0;
        contLoggedUsers = 0;
        userArray = new User[maxNumberOfUsers]; 
        loggedUsers = new User[maxNumberOfUsers];
    }

    public abstract void postMessage(String message, User u);
    protected abstract void sendData(byte[] messageBytes);    
    
    public String getSocialNetworkName()
    {
        return socialNetworkName;
    }
    protected void addUser(User u)
    {
        if(contUsers >= 10)
            System.out.println("not enough space to add a user to "+ getSocialNetworkName());
        else
            userArray[contUsers++] = u;
    }    

    public boolean login(User u)
    {
        for(int i=0;i<contUsers;i++)
        {
            if(userArray[i].equals(u))
            {
                loggedUsers[contLoggedUsers++] = u;
                return true;
            }                
        }
        return false;
    }
    public boolean logout(User u)
    {
        for(int i=0;i<contUsers;i++)
        {
            if(userArray[i].equals(u))
            {
                for(int j=i; j<contUsers-1; j++)
                {
                    loggedUsers[i] = loggedUsers[i+1];
                }                
                contLoggedUsers--;
                return true;
            }                            
        }
        System.out.println("user: " + u.getUserName() + " not logged in to be logged out");
        return false;
    }

    public boolean userLogged(User u)
    {
        for(int i=0; i<contLoggedUsers;i++)
        {
            if(loggedUsers[i].equals(u))
                return true;
        }
        return false;
    }
}