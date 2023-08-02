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
public class Hotel implements Initialization, GetAllArrays
{
    private Administrator[] A1 = new Administrator[2];
    private Customer[] C1 = new Customer[10];
    private Room[] R1 = new Room[20];
    private int adminCounter;
    private int customerCounter;
    private int roomCounter;
    private double totalEarnings;

    public Hotel()
    {
        initializeAdmins();
        initializeCustomers();
        initializeRooms();
        this.adminCounter = 0;
        this.customerCounter = 0;
        this.roomCounter = 0;
        this.totalEarnings = 0;
    }
    
    public void initializeAdmins()
    {
        for (int i=0;i<A1.length;i++)
        {
            A1[i] = new Administrator();
        }
    }
    
    public void initializeCustomers()
    {
        for (int i=0;i<C1.length;i++)
        {
            C1[i] = new Customer();
        }
    }
    
    public void initializeRooms()
    {
        for (int i=0;i<R1.length;i++)
        {
            R1[i] = new Room();
        }
    }
    
    public Administrator[] getAdmins()
    {
        return A1;
    }
    
    public Customer[] getCustomers()
    {
        return C1;
    }
    
    public Room[] getRooms()
    {
        return R1;
    }

    public int getAdminCounter()
    {
        return adminCounter;
    }

    public int getCustomerCounter()
    {
        return customerCounter;
    }

    public int getRoomCounter()
    {
        return roomCounter;
    }

    public void setAdminCounter(int adminCounter)
    {
        this.adminCounter = adminCounter;
    }

    public void setCustomerCounter(int customerCounter)
    {
        this.customerCounter = customerCounter;
    }

    public void setRoomCounter(int roomCounter)
    {
        this.roomCounter = roomCounter;
    }

    @Override
    public void initializeAdmins(String Name, String Id, String Address, String Username, String Password, int adminCounter)
    {
        A1[adminCounter].setName(Name);
        A1[adminCounter].setId(Id);
        A1[adminCounter].setAddress(Address);
        A1[adminCounter].setUsername(Username);
        A1[adminCounter].setPassword(Password);
        adminCounter++;
    }

    @Override
    public void initializeCustomers(String Name, String Id, String Address, boolean billPayed, double Advance, double Pending, double totalBalance, int totalPeoplesResiding, int Days, int customerCounter)
    {
        C1[customerCounter].setName(Name);
        C1[customerCounter].setId(Id);
        C1[customerCounter].setAddress(Address);
        C1[customerCounter].setBillPayed(billPayed);
        C1[customerCounter].setAdvance(Advance);
        C1[customerCounter].setPending(Pending);
        C1[customerCounter].setTotalBalance(totalBalance);
        C1[customerCounter].setTotalPeoplesResiding(totalPeoplesResiding);
        C1[customerCounter].setDays(Days);
        customerCounter++;
    }

    @Override
    public void initializeRooms(int No, int noOfPeoples, double Charges, boolean Status, String Facilities, int customerId, int availableIn, int roomCounter)
    {
        R1[roomCounter].setNo(No);
        R1[roomCounter].setNoOfPeoples(noOfPeoples);
        R1[roomCounter].setCharges(Charges);
        R1[roomCounter].setStatus(Status);
        R1[roomCounter].setFacilities(Facilities);
        R1[roomCounter].setCustomerId(customerId);
        R1[roomCounter].setAvailableIn(availableIn);
        roomCounter++;
    }

    public double getTotalEarnings()
    {
        return totalEarnings;
    }

    public void setTotalEarnings(double totalEarnings)
    {
        this.totalEarnings = totalEarnings;
    }
}
