import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        // equiTriangle(args);
        // farenheatToCelsius(args);
        // oddEven(args);
        // equalLen(args);
        // swapValues(args);
        // asciiValueFinder(args);
        // largestNum(args);
        stringManipulation(args);
    }


// Write a java program to find the area of an equilateral triangle 
    public static void equiTriangle(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = input.nextDouble();
        
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        System.out.println("The area of the equilateral triangle is " + area);
        
        input.close();
    }


// Write a program to convert Fahrenheit into Celsius 
    public static void farenheatToCelsius(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        double faren = input.nextDouble();

        // C = (F - 32) * 5/9
        int celsi=(int)(faren-32)*5/9;
        System.out.println("Celsius:\t"+celsi);
    }

// Write a java program to check whether a number is odd or even, if it is odd convert it to even and vice versa. 
    public static void oddEven(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number to check odd or even");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Even");
            System.out.println("Updated number = "+(num+1));
        }
        else{
            System.out.println("Odd");
            System.out.println("Updated number = "+(num+1));
        }
    }

// Write a java program to check whether two strings are of equal length or not. 
    public static void equalLen(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First String value ");
        String var1=sc.nextLine();

        System.out.println("Enter the Second String value ");
        String var2=sc.nextLine();

        if (var1.equals(var2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }

// Write a java program to take two variables from the user and swap their values. 
    public static void swapValues(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First String value ");
        String var1=sc.nextLine();

        System.out.println("Enter the Second String value ");
        String var2=sc.nextLine();

        System.out.println("Before swapping: variable1 = " + var1 + ", variable2 = " + var2);

        // swapping the variables
        String temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("After swapping: variable1 = " + var1 + ", variable2 = " + var2);
    }


// Write a Java Program to Find ASCII Value of a character 
    public static void asciiValueFinder(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int asciiValue = (int) ch;
        System.out.println("The ASCII value of " + ch + " is " + asciiValue);

        input.close();
    }

// Write a Java Program to Find the Largest Among two Numbers 
    public static void largestNum(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First number value ");
        int var1=sc.nextInt();

        System.out.println("Enter the Second number value ");
        int var2=sc.nextInt();

        if (var1>var2){
            System.out.println(var1+" Is the Largest number");
        }
        else{
            System.out.println(var2+" Is the largest number");
        }
    }


// 9. Write a program to calculate the sum of the first and the second last digit of a 5 digit number . 
// E.g.- NUMBER : 12345 	OUTPUT : 1+4=5 
public static void stringManipulation(String[]args){
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a 5-digit number
    System.out.print("Enter a 5 digit number: ");
    int number = scanner.nextInt();

    // Get the first and second last digits of the number
    int firstDigit = Integer.parseInt(String.valueOf(number).substring(0, 1));
    int secondLastDigit = Integer.parseInt(String.valueOf(number).substring(3, 4));

    // or below code could also work
    // Character.getNumericValue(String.valueOf(number).charAt(0));

    // Calculate the sum of the first and second last digit
    int sum = firstDigit + secondLastDigit;

    // Display the result
    System.out.println("The sum of the first and second last digit of " + number + " is " + sum + ".");
}


// 10.Write a program to reverse a 3-digit number. 
// E.g.-Number : 132 		Output : 231 
    public static void reverse(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = input.nextInt();
        int reverse = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }
        
        System.out.println("The reverse of the number is: " + reverse);
    }


}
