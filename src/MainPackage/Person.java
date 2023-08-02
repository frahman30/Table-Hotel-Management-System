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
public abstract class Person
{
    private String Name;
    private String Id;
    private String Address;
    
    public Person()
    {
        this.Name = null;
        this.Id = null;
        this.Address = null;
    }
    
    public Person(String Name, String Id, String Address)
    {
        this.Name = Name;
        this.Id = Id;
        this.Address = Address;
    }

    public String getName()
    {
        return Name;
    }

    public String getId()
    {
        return Id;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setId(String Id)
    {
        this.Id = Id;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    
    public abstract boolean searchByName(String A);
    public abstract boolean searchById(String B);
}
