
import java.util.Scanner;

public class Desktop {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int number1;

        System.out.print("Enter first integer: ");

        number1 = input.nextInt();




            if (number1 < 10) {
                System.out.println("Good morning.");
            } else if (number1 <= 20) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }


        switch (number1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("have a good time");
        }

        while (number1 < 30){
            System.out.println(number1);

            number1++;}


    }

}