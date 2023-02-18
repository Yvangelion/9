package Lab9pack;

import java.util.Scanner;

public class testsss {

	   public static void main(String[] args) {
		   
			String[] itemname = {"Soup", "Wings", "Burger","Chicken Sandwich","Fries","Pie","Ice Cream","Soft Drink","Coffee"};

	       double[] price= {2.5,0.15,4.95,5.95,1.99,2.95,2.99,1.50,1.00};
	       int partysize;
			Scanner input = new Scanner(System.in);
	       System.out.println("Please input the number of people in your party...");
	       System.out.print("Please type a value for NUMBER_IN_PARTY: ");
	       partysize =input.nextInt();
	       double grandtotal=0.0;
	       for(int user =1;user<=partysize;user++){
	           int discount,item,no_of_wings;
	           double usertotal = 0.0;
	           System.out.println("Please input order information for person "+user+"...\n");
	           System.out.println("Is this person eligible for a discount? (enter a number 1 - 4)");
	           System.out.println("1 - if CHILD 5 years of age or younger");
	           System.out.println("2 - if TEEN between 13 and 19 years of age");
	           System.out.println("3 - if SENIOR 65 years of age or older");
	           System.out.println("4 - if NONE of the above");
	           
	           
	           System.out.print("Please type a value for DISCOUNT_TYPE: ");
	           discount = input.nextInt();
	           System.out.println(" ");
	           
	           
	           
	           
	           System.out.println("Menu items that may be selected: ");
	           System.out.println("1 "+ itemname[0] + "\n"+
	        		   "1 "+ itemname[1] + "\n"
	        		   +"1 "+ itemname[2] + "\n"
	        		   +"1 "+ itemname[3] + "\n"
	        		   +"1 "+ itemname[4] + "\n"
	        		   +"1 "+ itemname[5] + "\n"
	        		   +"1 "+ itemname[6] + "\n"
	        		   +"1 "+ itemname[7] + "\n"
	        		   +"1 "+ itemname[8] + "\n");
	           
	           
	           
	           System.out.println(" ");
	           
	           
	           for(int menue=1;menue<=3;menue++){
	           System.out.println("Please select menu item "+menue+" (enter a number 1 - 9)");
	           System.out.print("Please type a value for SELECTED_ITEM: ");
	           System.out.println(" ");
	           item = input.nextInt();
	           if(item == 2){
	               System.out.print("Please enter number of wings to be ordered...\nPlease type a value for NUMBER_OF_WINGS: ");
	               no_of_wings = input.nextInt();
	               usertotal+=no_of_wings*price[2];
	               
	           }else{
	        	   usertotal+=price[item];
	               }
	           
	           
	           }
	           
	           if(discount == 1)
	               usertotal =0.00;
	           else if(discount == 2 || discount == 3)
	        	   usertotal =0.75 *usertotal;
	           else
	        	   usertotal =1.05*usertotal;	           
	           
	           usertotal = Math.round(usertotal * 100.0) / 100.0;
	           System.out.println("Person "+user+" Total: "+"$"+usertotal + " (Discount Type "+discount+")");
	           System.out.println(" ");
	           
	           grandtotal += usertotal;
	           
	      
	   }

           System.out.println("Grand Total for Order: "+"$"+grandtotal);
   		input.close();

	}
}