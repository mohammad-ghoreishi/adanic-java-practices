

import java.util.Scanner;


public class aval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("دو عدد وارد کنید: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        int sum = number1 % number2;
System.out.println(sum);

        if (sum != 0) {
            System.out.println("عدد اول هست");
        } else {
            System.out.println("عدد اول نیست");
        }
    }
}








