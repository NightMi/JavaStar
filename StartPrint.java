package com.pouchen.rnd.training.basic;
import java.util.Scanner;

public class StartPrint {




	public static void main(String[] args)
	{
		try{
			Scanner io = new Scanner(System.in);
		int c = io.nextInt(); //決定幾層
	        for(int a =1 ; a <= c ; a++)
	        {
	            for(int b = 1 ; b <=c ; b++ ) {
					if(a>=b) { //比對寫幾個（決定三角的直角是在哪）
						System.out.print("*");
					}
				}
	                System.out.println();
	        }






		}
		catch (Exception ex)
		{

		}
		finally{

		}
	}

}

