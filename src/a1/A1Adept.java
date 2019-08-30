package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
	    Scanner sc            = new Scanner(System.in);
		int ItemNumber        = sc.nextInt();
		String [] ItemNames   = new String [ItemNumber];
		double [] ItemPrices  = new double[ItemNumber];
		for (int i=0; i<=ItemNumber-1 ; i++) {
			ItemNames[i]            = sc.next();
			ItemPrices [i]       = sc.nextDouble();
			System.out.println(ItemNames[i]+" "+ ItemPrices[i]);
		}

		int CustomerNumber    = sc.nextInt();
		String [] FirstName   = new String[CustomerNumber];
		String [] LastName    = new String[CustomerNumber];

		for (int i=0; i<=CustomerNumber-1 ; i++) {
			FirstName[i]      = sc.next();
			LastName [i]      = sc.next();
			int ItemNumber2   = sc.nextInt();
			int []    ItemNumber3 = new int[ItemNumber2];
			String [] ItemName2   = new String[ItemNumber2];
			System.out.println(FirstName[i]+" "+LastName[i]);
			for (int m=0; m<=ItemNumber2-1 ; m++) {
				ItemNumber3[m] = sc.nextInt();
				ItemName2 [m]  = sc.next();
				for (int b=0; b<=ItemNumber-1; b++) {
					if (ItemName2 [m] == ItemNames [b]) {
						double TotalPrice = ItemNumber3[m] * ItemPrices[b];
						System.out.println(ItemName2[m] + " " + TotalPrice);
						break;}
						}
					}
				}
			}	       						
	}