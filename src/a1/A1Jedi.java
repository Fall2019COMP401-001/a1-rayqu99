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
		
		int    [] CustomerNumberIndicator = new int [ItemNumber];
		int    [] ItemNumberIndicator     = new int [ItemNumber];

		for (int i=0; i<=CustomerNumber-1 ; i++) {
			FirstName[i]      = sc.next();
			LastName [i]      = sc.next();
			int ItemNumberBought   = sc.nextInt();
			int []    ItemNumberEachBought = new int[ItemNumberBought];
			String [] ItemNameBought   = new String[ItemNumberBought];
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
				if (ItemNumber4EveryItem[n]==0) {
					CustomerNumberIndicator[n]+=0;
					ItemNumberIndicator[n]+=0;
					}
				else {
					CustomerNumberIndicator[n]+=1;
					ItemNumberIndicator[n]+=ItemNumber4EveryItem[n];}
			}
			
	    }
		
		
		for (int i=0; i<=ItemNumber-1;i++) {
			if (CustomerNumberIndicator[i]==0) {
				System.out.println("No customers bought "+ItemName[i]);
			}
			else {System.out.println(CustomerNumberIndicator[i]+" customers bought "+ItemNumberIndicator[i]+" "+ItemName[i]);}
		}
  }
}