package week03codingassignment;

import java.util.Scanner;

public class Javaweeks34codingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,64,2,8,28,93,100};
		
//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length - 1] - ages[0]);

//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		System.out.println(ages[ages.length - 1] - ages[0]);

//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		int average = 0;
		
		for(int number : ages) {
		sum = sum + number;
			average = sum/ages.length;
		}
		System.out.println(average);
		
//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double average1 = 0;
		double total = 0;
		
		for(String letter : names) {
			total = total + letter.length();
			average1 = total/names.length;
		}System.out.println(average1);

		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		for(String name: names) {
			System.out.print(name + " ");
			}
		
		
//3.	How do you access the last element of any array?
		System.out.println("\n" +names[names.length - 1]);
		
//4.	How do you access the first element of any array?
		System.out.println(names[0]);


		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = {3,5,3,5,4,3};
		
		for(int i = 0; i < names.length; i++) {
			 
			System.out.println(names[i].length());
		}

		
//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sum1 = 0;
		for(int number : nameLengths) {
			sum1 = sum1 + number ;
		}System.out.println(sum1);
//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println(concatenatedWord("shane", 3));
		
//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println(fullName("Shane", "John"));
		
//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int[] myArray = {12, 30, 50};
		
		System.out.println(sumGreatThanHundred(myArray));
		
//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] myArray2 = {30, 45, 550, 220};
		System.out.println(averageOfArray(myArray2));
		
//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		double[] myArray3 = {50, 12, 5};
		System.out.println(isArrayOneGreaterThanArrayTwo(myArray2, myArray3));
		
//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

		System.out.println(willBuyDrink(true, 10.40));
		
//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		System.out.print("Enter Code: ");
		openCarWithPhone();
	}


//method 7.
	public static String concatenatedWord(String word, int n) {
		String words = "";
		for(int i = 0; i < n; i++ ) {
			words = words + word;
		}
		return words;
	}
	//method 8.
	public static String fullName(String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}
	//method 9.
	public static boolean sumGreatThanHundred(int[] sum) {
		int sum1 = 0;
		for(int num : sum) {
		 sum1 = sum1 + num;
		 if(sum1 > 100) {
			return true;
		}else {
			
		}
	}	return false;
		
	}
	//method 10
	public static double averageOfArray(double[] myArray) {
		double sum = 0;
		double average = 0;
		for(double num : myArray) {
			sum = sum + num;
			average = sum/myArray.length;
		}
			return average;
		}
	//method 11
	public static boolean isArrayOneGreaterThanArrayTwo(double[] array1, double[] array2) {
		double sum = 0;
		double sum2 = 0;
		double average = 0;
		double average2 = 0;
			for(double num : array1) {
			sum = sum + num;
			average = sum/array1.length;
			}for(double num2 : array2) {
				sum2 = sum2 + num2;
				average2 = sum2/array2.length;
			}
			if (average < average2) {
				return false;
			}return true;
	}
	//method 12
	public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
		if(isHotOutSide != true || moneyInPocket < 10.50) {
			return false;
		}
		return true;
	}
	//method 13
	public static void openCarWithPhone() {
		Scanner userInput = new Scanner(System.in);
		int userCode = userInput.nextInt();
		int code = 0;
		while(code < 2 && userCode != 1986) {
			
			System.out.println("Invaild Code!!");
			System.out.print("Enter code: ");
			userCode = userInput.nextInt();
			code++;
			}
		if(userCode == 1986) {
			System.out.println("Car unlocked!!");
		}else {
			System.out.println("Too many wrong attempts!!");
		}
	}
	
	
}

