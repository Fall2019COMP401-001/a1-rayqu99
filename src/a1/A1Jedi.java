package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Jedi {


	public static void main(String[] args) {
		
	    Scanner sc            = new Scanner(System.in);
		int ItemNumber        = sc.nextInt();
		String [] ItemName   = new String [ItemNumber];
		double [] ItemPrices  = new double[ItemNumber];
		for (int i=0; i<=ItemNumber-1 ; i++) {
			ItemName[i]            = sc.next();
			ItemPrices [i]       = sc.nextDouble();
			}
		
		int CustomerNumber    = sc.nextInt();
		String [] FirstName   = new String[CustomerNumber];
		String [] LastName    = new String[CustomerNumber];
		double [] FinalPrice  = new double[CustomerNumber];

		for (int i=0; i<=CustomerNumber-1 ; i++) {
			FirstName[i]      = sc.next();
			LastName [i]      = sc.next();
			int ItemNumberBought   = sc.nextInt();
			int []    ItemNumberEachBought = new int[ItemNumberBought];
			String [] ItemNameBought   = new String[ItemNumberBought];
			double [] TotalPrices = new double[ItemNumberBought];
			for (int m=0; m<=ItemNumberBought-1 ; m++) {
				ItemNumberEachBought[m] = sc.nextInt();
				ItemNameBought [m]  = sc.next();
				for (int i1=0; i1<=ItemNumber-1; i1++) {
					    boolean result = ItemNameBought[m].equals(ItemName[i1]);
					    if (result) {TotalPrices[m] = ItemNumberEachBought[m] * ItemPrices[i1];}
				         }
				}
			for (int n=0; n<=ItemNumberBought-1;n++) {
					FinalPrice[i] += TotalPrices[n];
				  }		
	    }
	}
}