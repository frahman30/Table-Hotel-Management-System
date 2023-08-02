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
public interface Initialization
{
    public void initializeAdmins();
    public void initializeCustomers();
    public void initializeRooms();
    
    public void initializeAdmins(String Name, String Id, String Address, String Username, String Password, int adminCounter);
    public void initializeCustomers(String Name, String Id, String Address, boolean billPayed, double Advance, double Pending, double totalBalance, int totalPeoplesResiding, int Days, int customerCounter);
    public void initializeRooms(int No, int noOfPeoples, double Charges, boolean Status, String Facilities, int customerId, int availableIn, int roomCounter);
}
