package Lab9pack;
import java.util.Scanner;
public class Lab9Class {


	/* Computer Science 1 Spring. 7.9 Dual Arrays.
	 *This program calculates the bill of restaurant customers based on their three picks from the restaurant menu.
	 *The program asks the user for their group size and then asks the user to fill out each customers data and their food requests.
	 *The program then outputs each customer�s individual bill and then grand total with applicable discounts applied.
	 22*/
	public static void main(String[] args) {
		String[] itemname = {"Soup", "Wings", "Burger","Chicken Sandwich","Fries","Pie","Ice Cream","Soft Drink","Coffee"};
		double[] price= {2.50,0.15,4.95,5.95,1.99,2.95,2.99,1.50,1.00};
		int partysize;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number of people in your party...");
		System.out.print("Please type a value for NUMBER_IN_PARTY: ");
		System.out.println(" ");
		partysize =input.nextInt();
		double grandtotal=0.0;
		for(int user =1; user<=partysize; user++){
			int discount_type ,menue_item ,wingsnum;
			double usertotal = 0.0;
			System.out.println("Please input order information for person "+user+"...\n");
			System.out.println("Is this person eligible for a discount? (enter a number 1 - 4)");
			System.out.println("1 - if CHILD 5 years of age or younger");
			System.out.println("2 - if TEEN between 13 and 19 years of age");
			System.out.println("3 - if SENIOR 65 years of age or older");
			System.out.println("4 - if NONE of the above");
			System.out.print("Please type a value for DISCOUNT_TYPE: ");
			discount_type  = input.nextInt();
			System.out.println(" ");
			System.out.println("Menu items that may be selected: ");
			for(int index = 0, countnum = 0; index < itemname.length; index++, countnum++) {	
				String x = itemname[index];
				System.out.println(countnum + " "+ x);
			}
			System.out.println(" ");
			for(int menue=1; menue<=3 ;menue++){
				System.out.println("Please select menu item "+menue+" (enter a number 1 - 9)");
				System.out.print("Please type a value for SELECTED_ITEM: ");
				System.out.println(" ");
				menue_item  = input.nextInt();
				if(menue_item  == 1){
					System.out.print("Please enter number of wings to be ordered...\nPlease type a value for NUMBER_OF_WINGS: ");
					wingsnum = input.nextInt();
					usertotal+=wingsnum*price[1];
				}else{
					usertotal+=price[menue_item];
				}
			}
			if(discount_type  == 1)
				usertotal =0.00;
			else if(discount_type  == 2 || discount_type  == 3)
				usertotal =0.75 *usertotal;
			else
				usertotal =1.05*usertotal;	
			usertotal = (double)Math.round(usertotal * 100.0) / 100.0;
			System.out.println("Person "+ user +" Total: "+"$"+ usertotal + " (Discount Type "+ discount_type +")");
			System.out.println(" ");
			grandtotal += usertotal;
		}
		System.out.println("Grand Total for Order: "+"$" + grandtotal);
		input.close();
	}
}

