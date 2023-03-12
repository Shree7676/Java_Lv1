// public class firstclass {

// import java.util.Scanner;
// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
    
//     System.out.print("Enter phone number: ");
//     int phoneNumber = scanner.nextInt();
    
//     System.out.println("Phone number entered: " + phoneNumber);
    
//     scanner.close();
//   }
// }


import java.util.Scanner;

public class firstclass {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("What is your Phone Number?");
        long phoneNumber = sc.nextLong();
        
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("What is your Age?");
        int Age = sc.nextInt();


        
        System.out.println("What is your address?");
        String Address = sc.nextLine();

    System.out.println("Please Confirm");
    System.out.println("Name:\t"+name);
    System.out.println("Age:\t"+Age);
    System.out.println("Phone Number:\t"+ phoneNumber);
    System.out.println("address\t"+ Address);

    
    }
}