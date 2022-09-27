package OldExam1;

import java.util.Scanner;

public class OldExam1 {

    public static int validateInputN(Scanner kbd) {

        boolean x = false;
        int n = 0;

        // validate the initial investment input
        while (!x) {
            System.out.print("Enter a positive integer: ");
            if (kbd.hasNextInt()) {
                n = kbd.nextInt();
                if (n < 0) {
                    System.out.printf("Error: integer entered should be greater than zero. You entered %d \n",
                            n);
                } else {
                    x = true;
                }
            } else {
                System.out.printf("Error: integer expected. You entered \"%s\" \n",
                        kbd.next());
            }
        }
        return n;
    }

    public static int between2and7(int n) {
        int count = 0;
        while(n>0){
            if(n%10 < 7 && n%10 >2){
                count ++;
                n = n/10;
            }
            else{
                n=n/10;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.printf("The inputted number contains %d numbers between 2 and 7", between2and7(validateInputN(kbd)));
    }
}
