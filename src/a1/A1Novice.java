package a1;

import java.util.Scanner;

import java.text.DecimalFormat;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int CustomerNumber = sc.nextInt();


		
		
		for (int d=0; d<CustomerNumber; d++) {			
		
				String FirstName = sc.next();
				String LastName  = sc.next(); 
				int ArrayNumbers = sc.nextInt();
				double[] Price      = new double[ArrayNumbers];
				int [] Quantity     = new int[ArrayNumbers];
				double[] TotalPrice = new double[ArrayNumbers];
				String [] ItemNames = new String[ArrayNumbers];

				for (int i=0; i<=ArrayNumbers-1 ; i++) {
					Quantity[i]     = sc.nextInt();
					ItemNames [i]   = sc.next();
					Price [i]       = sc.nextDouble();
					TotalPrice[i]   = Quantity[i] * Price[i];
				}
		
		
				double FinalPrice = 0;
				for (int i=0; i<=ArrayNumbers-1; i++) {
					FinalPrice += TotalPrice[i];
				}
				DecimalFormat df = new DecimalFormat("0.00");
				String s = df.format(FinalPrice);
				String FirstNameInitial = FirstName.substring(0,1);
				System.out.println(FirstNameInitial + ". " + LastName + ": "+ s);
		}
		sc.close();
	}
}
