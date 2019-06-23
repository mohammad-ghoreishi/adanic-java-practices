import java.util.Scanner;

public class jadval
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("input row number: ");
        num1 = input.nextInt();
        int num2;
        System.out.print("input column number: ");
        num2 = input.nextInt();
        if ( num1 <= 10 && num2 <= 10 ) {
            for (int i = 1; i <= num1; i++) {

                for (int j = 1; j <= num2; j++) {

                    System.out.print(j + "*" + i + "=" + i * j + "\t\t");

                    if (j == 10) {
                        System.out.print("\n");

                    }

                }

            }
        } else {
            System.out.print(" Column and row between 10 ");
        }
        }
    }