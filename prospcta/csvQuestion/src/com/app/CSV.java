//Theoretical Challenge
//Suppose you have a CSV file with the data below.
//A1: 5, A2: 7, A3: 9, B1: 3, B2: 8, B3: =4+5, C1: =5+A1, C2: =A2+B2, C3: =C2+B3
//This can be represented in an excel sheet below:
//
//A B C
//1 5 3 =5+A1
//2 7 8 =A2+B2
//3 9 =4+5 =C2+B3
//I want a program that will take the CSV input above and produce CSV output with the results. If
//it is a value, then return a value. If it is a formula then calculate the formula and return the
//value of that formula.
//1. How will you tackle the challenge above?
//2. What type of errors you would you check for?
//3. How might a user break your code?



//Answer : - 

//To tackel this we have to process the given CSV input and producing CSV output with the result.
//
//1- Read the input CSV file line by line, then split each line into individual cells based on the comma(",") delimiter.
//store the cell values and formula in the data structure while persiving the row and columns information.

//2- Iterate through each cell in the data structure and check if the cell contains a formula by checking if it start with '=' and then check that the formula is calculating the value or not.
//3- We have to create a output CSV file to store the result and also we ahve to write the updated cell values to the output file in CSV format.
//
//4- Handling Errors is one of the most important thing in this.
//5- Ensure that the input CSV file adheres to a specific format like(number of columns according to the row and check the syntax as well).
//6- we have to keep in mind that we have to throughly test our program with various input scenarios, including proper and valid cases and check the error handling as well.



//package com.app;

//import java.io.*;
//import java.util.*;

//public class CSV {
//	public static void main(String[] args) {

//		String inp = "input.csv";
//		String out = "output.csv";
//		
//		
//		try {
//			proccessCSV(inp, out);
//			
//		}catch(IOException e) {
//			e.printStk();
//		}
//	}
//public static void proccessCSV(String inp, String out) throws IOException{
//	Map<String, String> clVal = new HashMap<>();
//	
//	try(BufferReader bf = new BufferReader(new FileReaer(inp))
//	   (BufferReader bo = new BufferReader(new FileReaer(out))););
//			
			// all the conditions here 
//}

//
//}
