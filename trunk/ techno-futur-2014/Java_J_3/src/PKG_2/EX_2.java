package PKG_2;

import java.util.Scanner;

public class EX_2 {

	
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);

		int nbr=sc.nextInt();
		
	
		System.out.println(nbr);
		
		
		for (int i = nbr; i >= 0; i--) {
			
			System.out.print(i);
			
			if(i!=0)
				System.out.print(",");
		}
		
	}
	
}
