/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignvolunteer;

import java.util.Scanner;

/**
 *
 * @author James Maherry ST10437403@vcconnect.edu.za
 */
public class AssignVolunteer2
{
    //--------------------------------------------------------------------------
    // main method
    public static void main(String[] args)
    {
        // Global variables
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        
        // Create Scanner to retrieve user input from the console
        Scanner input = new Scanner(System.in);
        //Print to the console
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
        donationType = input.nextInt();
        // if statement used to make a decision
        if(donationType == CLOTHING_CODE)
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        // else statement will run if the condition for the if statement is false
        else
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        // Displays the output to the console
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
        
        // Calling the method to print "Hello World"
        AssignVolunteer2.HelloWorld();
    }
    
    private static void HelloWorld()
    {
        System.out.println("Hello World");
    }
    
}
