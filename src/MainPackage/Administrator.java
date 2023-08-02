/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author FazalUr
 */
public class Administrator extends Person
{
    private String Username;
    private String Password;
    
    public Administrator()
    {
        super(null,null,null);
        this.Username = null;
        this.Password = null;
    }
    
    public Administrator(String Name, String Id, String Address, String Username, String Password)
    {
        super(Name, Id, Address);
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }    

    public void setUsername(String Username)
    {
        this.Username = Username;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    @Override
    public boolean searchByName(String A)
    {
       boolean Status = false;
       for (int i=0;i<Main.H1.getAdmins().length;i++)
       {
           if (Main.H1.getAdmins()[i].getName() == null ? A == null : Main.H1.getAdmins()[i].getName().equals(A))
           {
               Status = true;
               break;
           }
       }
       return Status;
    }

    @Override
    public boolean searchById(String B)
    {
       boolean Status = false;
       for (int i=0;i<Main.H1.getAdmins().length;i++)
       {
           if (Main.H1.getAdmins()[i].getId() == null ? B == null : Main.H1.getAdmins()[i].getId().equals(B))
           {
               Status = true;
               break;
           }
       }
       return Status;        
    }
}
