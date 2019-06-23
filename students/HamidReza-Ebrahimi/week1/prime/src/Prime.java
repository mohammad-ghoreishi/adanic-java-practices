import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nu1;
        System.out.print("input first number: ");
        nu1 = input.nextInt();
        int nu2;
        System.out.print("input secund number: ");
        nu2 = input.nextInt();
        int out = nu1 % nu2;
        boolean flag = false;
        while(nu2 <= nu1/2)
        {
            // condition for nonprime number
            if(nu1 % nu2 == 0)
            {
                flag = true;
                break;
            }
            ++nu2;
        }
        if (!flag)
            System.out.println(nu1 + " is a prime number.");
        else
            System.out.println(nu1 + " is not a prime number.");
    }
}