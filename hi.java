// class hoi {
//     public static void main(String[] args) {
//         // for (int x=1;x<11;x++){
//         //     for (int y=1;y<11;y++){
//         //         System.out.printf("%d X %d = %d \n",x,y,x*y);
//         //     }
//         // System.out.println();
//         // }
//         System.out.println("Pattern pbm");
//         // for (int x=1;x<4;x++){
//         System.out.printf("hi *%d",4);
//         // }
//     }
    
// }

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        //     for( int j=0; j<5-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.charAt(4));
        System.out.println(a.substring(4,7));
        System.out.println(a.length());
    }
}
