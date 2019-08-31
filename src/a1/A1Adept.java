package a1;

import java.text.DecimalFormat;
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
		}

		int CustomerNumber    = sc.nextInt();
		String [] FirstName   = new String[CustomerNumber];
		String [] LastName    = new String[CustomerNumber];
		double [] FinalPrice  = new double[CustomerNumber];

		for (int i=0; i<=CustomerNumber-1 ; i++) {
			FirstName[i]      = sc.next();
			LastName [i]      = sc.next();
			int ItemNumber2   = sc.nextInt();
			int []    ItemNumber3 = new int[ItemNumber2];
			String [] ItemName2   = new String[ItemNumber2];
			double [] TotalPrices = new double[ItemNumber2];
			for (int m=0; m<=ItemNumber2-1 ; m++) {
				ItemNumber3[m] = sc.nextInt();
				ItemName2 [m]  = sc.next();
				for (int i1=0; i1<=ItemNumber-1; i1++) {
					    boolean result = ItemName2[m].equals(ItemNames[i1]);
					    if (result) {TotalPrices[m] = ItemNumber3[m] * ItemPrices[i1];}
				         }}
			for (int n=0; n<=ItemNumber2-1;n++) {
					FinalPrice[i] += TotalPrices[n];}			
	    }
		DecimalFormat df = new DecimalFormat("0.00");
		
		double MaxFP = FinalPrice[0];
		String MaxFirstName = FirstName[0];
		String MaxLastName =  LastName[0];
		for (int j=0; j<CustomerNumber-1; j++) {
			if (FinalPrice[j]<FinalPrice[j+1]) {
				MaxFP = FinalPrice[j+1];
				MaxFirstName = FirstName[j+1];
				MaxLastName = LastName[j+1];
			}
		}
		String MaxFP2 =df.format(MaxFP);
		System.out.println("Biggest: "+MaxFirstName+" "+MaxLastName+" ("+MaxFP2+")");
		
		double MinFP = FinalPrice[0];
		String MinFirstName = FirstName[0];
		String MinLastName =  LastName[0];
		for (int j=0; j<CustomerNumber-1; j++) {
			if (FinalPrice[j]>FinalPrice[j+1]) {
				MinFP = FinalPrice[j+1];
				MinFirstName = FirstName[j+1];
				MinLastName = LastName[j+1];
			}
		}
		String MinFP2 =df.format(MinFP);
		System.out.println("Smallest: "+MinFirstName+" "+MinLastName+" ("+MinFP2+")");
			
		double SumPrice = 0;
		for (int k=0; k<=CustomerNumber-1; k++) {
			 SumPrice += FinalPrice[k];
		}
		double average =SumPrice / CustomerNumber;
		String average2 =df.format(average);
		System.out.println("Average: "+average2);
		sc.close();
	}
}