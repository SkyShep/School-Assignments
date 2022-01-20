
/**
 * UserAccess.java
 *
 * Sara Gurnett
 * Verifies user access level.
 */

import java.util.Scanner;

public class UserAccess
{
    private String password;
    private boolean isAdmin = false;
    
    // User enters password to gain admin level access
    public void enterPassword()
    {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("Please enter password to continue: ");
        password = stdIn.next();
        if (password.equals("abcde"))
        {
            isAdmin = true;
            System.out.println("Admin level access granted.");
        }
        else
        {
            System.out.println("Regular level access granted.");
        }
    } // End enterPassword
    //***********************************************************************
    
    // Return boolean value to determine if user is Admin or not.
    public boolean getAdminPermission(boolean isAdmin)
    {
        return isAdmin;
    } // End getAdminPermission
}
