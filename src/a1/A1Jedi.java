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
			}
			int [] ItemNumber4EveryItem = new int [ItemNumber];
			for (int n=0; n<=ItemNumber-1;n++) {
				for (int j=0; j<=ItemNumberBought-1; j++) {
					boolean result = ItemName[n].equals(ItemNameBought[j]);
					if (result) { ItemNumber4EveryItem [n] += ItemNumberEachBought[j];}					
					}
			System.out.println(ItemName[n]+" "+ItemNumber4EveryItem[n]);
			}
	    }
  }
}