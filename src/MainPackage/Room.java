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
public class Room
{
    private int No;
    private int noOfPeoples;
    private double Charges;
    private boolean Status;
    private String Facilities;
    private int customerId;
    private int availableIn;
    
    public Room()
    {
        this.No = 0;
        this.noOfPeoples = 0;
        this.Charges = 0;
        this.Status = false;
        this.Facilities = null;
        this.customerId = 0;
        this.availableIn = 0;        
    }

    public Room(int No, int noOfPeoples, double Charges, boolean Status, String Facilities, int customerId, int availableIn)
    {
        this.No = No;
        this.noOfPeoples = noOfPeoples;
        this.Charges = Charges;
        this.Status = Status;
        this.Facilities = Facilities;
        this.customerId = customerId;
        this.availableIn = availableIn;
    }

    public int getNo()
    {
        return No;
    }

    public int getNoOfPeoples()
    {
        return noOfPeoples;
    }

    public double getCharges()
    {
        return Charges;
    }

    public boolean isStatus()
    {
        return Status;
    }

    public String getFacilities()
    {
        return Facilities;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public int getAvailableIn()
    {
        return availableIn;
    }

    public void setNo(int No)
    {
        this.No = No;
    }

    public void setNoOfPeoples(int noOfPeoples)
    {
        this.noOfPeoples = noOfPeoples;
    }

    public void setCharges(double Charges)
    {
        this.Charges = Charges;
    }

    public void setStatus(boolean Status)
    {
        this.Status = Status;
    }

    public void setFacilities(String Facilities)
    {
        this.Facilities = Facilities;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public void setAvailableIn(int availableIn)
    {
        this.availableIn = availableIn;
    }
    
    public boolean isSearchByNo(int A)
    {
        boolean Status = false;
        for (int i=0;i<Main.H1.getRooms().length;i++)
        {
            if (Main.H1.getRooms()[i].getNo() == A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchByNoOfPeoples(int A)
    {
        boolean Status = false;
        for (int i=0;i<Main.H1.getRooms().length;i++)
        {
            if (Main.H1.getRooms()[i].getNoOfPeoples() <= A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchByCharges(int A)
    {
        boolean Status = false;
        for (int i=0;i<Main.H1.getRooms().length;i++)
        {
            if (Main.H1.getRooms()[i].getCharges() <= A)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
    
    public boolean isSearchByStatus()
    {
        boolean Status = false;
        for (int i=0;i<Main.H1.getRooms().length;i++)
        {
            if (Main.H1.getRooms()[i].isStatus() == true)
            {
                Status = true;
                break;
            }
        }
        return Status;
    }
}
