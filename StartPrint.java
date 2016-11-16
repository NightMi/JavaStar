package com.pouchen.rnd.training.basic;
import java.util.Scanner;
public class StartPrint{
	public static void main(String[] args)
	{
		try{
		Scanner io = new Scanner(System.in); //資料來源由使用者輸入
		int c = io.nextInt(); //接收使用者輸入的值
	        for(int a =1 ; a <= c ; a++){ //決定幾層
	        for(int b = 1 ; b <=c ; b++ ) { //決定每層的 * 數量
		System.out.print("*");
		}
	        System.out.println();//負責分層
	        }
		}
		catch (Exception ex){
		}
		finally{
		}
	}

}

