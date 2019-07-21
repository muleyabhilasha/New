package com.TwoD_Arrays;

import java.util.Scanner;

public class AdditionofMatrix {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr size for row ...");
		
		int row=sc.nextInt();
		
      System.out.println("Enetr size for column...");
		
		int col=sc.nextInt();
		
		System.out.println("Enter Elements for first matrix");
		
		 int mat1[][]=new int[row][col];
		 
		 int mat2[][]=new int[row][col];
		 
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 mat1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter elements for second Matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				 mat2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix one");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat1[i][j]+ " ");
			}
			
			System.out.println();
			
		}
		

		System.out.println("Matrix two");

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat2[i][j]+ " ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("Addition of Two Matrix");
		int mat3[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat3[i][j]= mat1[i][j]+mat2[i][j];
				
				System.out.print(mat3[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		sc.close();
	}

}
