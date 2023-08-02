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
public class Customer extends Person
{
    private boolean billPayed;
    private double Advance;
    private double Pending;
    private double totalBalance;
    private int totalPeoplesResiding;
    private int Days;
    
    public Customer()
    {
        super(null,null,null);
        this.Advance = 0;
        this.Pending = 0;
        this.totalBalance = 0;
        this.totalPeoplesResiding = 0;
        this.billPayed = false;
        this.Days = 0;
    }
    
    public Customer(String Name, String Id, String Address, boolean billPayed, double Advance, double Pending, double totalBalance, int totalPeoplesResiding, int Days)
    {
        super(Name, Id, Address);
        this.Advance = Advance;
        this.Pending = Pending;
        this.totalBalance = totalBalance;
        this.totalPeoplesResiding = totalPeoplesResiding;
        this.billPayed = false;
        this.Days = Days;
    }

    public int getDays()
    {
        return Days;
    }

    public void setDays(int Days)
    {
        this.Days = Days;
    }

    public int getTotalPeoplesResiding()
    {
        return totalPeoplesResiding;
    }

    public void setTotalPeoplesResiding(int totalPeoplesResiding)
    {
        this.totalPeoplesResiding = totalPeoplesResiding;
    }

    public boolean isBillPayed()
    {
        return billPayed;
    }

    public double getAdvance()
    {
        return Advance;
    }

    public double getPending()
    {
        return Pending;
    }

    public double getTotalBalance()
    {
        return totalBalance;
    }

    public void setBillPayed(boolean billPayed)
    {
        this.billPayed = billPayed;
    }

    public void setAdvance(double Advance)
    {
        this.Advance = Advance;
    }

    public void setPending(double Pending)
    {
        this.Pending = Pending;
    }

    public void setTotalBalance(double totalBalance)
    {
        this.totalBalance = totalBalance;
    }

    @Override
    public boolean searchByName(String A)
    {
       boolean Status = false;
       for (int i=0;i<Main.H1.getCustomers().length;i++)
       {
           if (Main.H1.getCustomers()[i].getName() == null ? A == null : Main.H1.getCustomers()[i].getName().equals(A))
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
       for (int i=0;i<Main.H1.getCustomers().length;i++)
       {
           if (Main.H1.getCustomers()[i].getId() == null ? B == null : Main.H1.getCustomers()[i].getId().equals(B))
           {
               Status = true;
               break;
           }
       }
       return Status;        
    }
}
