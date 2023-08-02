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
public class Main
{
    public static FirstPage P1 = new FirstPage();
    public static SecondPage P2 = new SecondPage();
    public static Hotel H1 = new Hotel();
    
    public static void main(String[] Args)
    {
        H1.initializeAdmins("Saqlain Abbas", "200", "Wah Cantonement", "Saqlain", "12345", H1.getAdminCounter());
        H1.setAdminCounter(H1.getAdminCounter()+1);
        H1.initializeAdmins("Rukhshan Warraich", "201", "Tarnol", "Rukhshan", "12345", H1.getAdminCounter());
        H1.setAdminCounter(H1.getAdminCounter()+1);
        H1.initializeRooms(100, 5, 2000.50, true, "Laundry, AC, Internet, TV", 0, 0, H1.getRoomCounter());
        H1.setRoomCounter(H1.getRoomCounter()+1);
        H1.initializeRooms(101, 3, 600.50, true, "Laundry, AC", 0, 0, H1.getRoomCounter());
        H1.setRoomCounter(H1.getRoomCounter()+1);
        H1.initializeCustomers("Jawad", "300", "House: 120, Islamabad", true, 0, 0, 0, 0, 0, 0);
        H1.setCustomerCounter(H1.getCustomerCounter()+1);
        P1.setVisible(true);
        P2.setVisible(false);
    }
}
