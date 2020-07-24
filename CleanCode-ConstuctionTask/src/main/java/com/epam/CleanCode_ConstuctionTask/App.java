package com.epam.CleanCode_ConstuctionTask;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    	
    	
    	        
    	        Scanner input=new Scanner(System.in);
    	        
    	        System.out.println("Material Standards \t\t cost in INR/feet");
    	        System.out.println("-----------------------------------------------");
    	        System.out.println("1.Normal Standard \t\t\t 1200");
    	        System.out.println("2.Above Standard \t\t\t 1500");
    	        System.out.println("3.High Standard \t\t\t 1800");
    	        System.out.println("4.High & Automated Standard \t\t 2500\n");
    	        System.out.println("press Y if you want Fully Automated Home & press N if you dont't");
    	        char c=input.next().charAt(0);
    	        int material_standard=0;
    	        if(c=='Y' || c=='y')
    	        {
    	        	 material_standard=2500;
    	        }
    	        else
    	        {
    	        System.out.println("Enter respective number for required Standard from above mentioned options");
    	        
    	        
    	        int client_choice=input.nextInt();
    	        switch(client_choice)
    	        {
    	            case(1):
    	                {
    	                     material_standard=1200;
    	                     break;
    	                }
    	             case(2):
    	                {
    	                     material_standard=1500;
    	                     break;
    	                }
    	             case(3):
    	                {
    	                     material_standard=1800;
    	                     break;
    	                }
    	             case(4):
    	                {
    	                     material_standard=2500;
    	                     break;
    	                }
    	                default:
    	                 System.out.println("You have choosen Invalid choice");
    	                 System.exit(0);
    	        }
    	        }
    	        System.out.println("Enter your house Area");
    	        int total_area_of_house=input.nextInt();
    	        int total_estimated_cost_of_house=material_standard*total_area_of_house;
    	         System.out.println("\nEstimated cost of your house is "+total_estimated_cost_of_house);
    	        
    	}
    	catch(Exception e)
    	{
    	    System.out.println("Enter valid details");
    	    System.exit(0);
    	}
    	    
    	    
    }
}
