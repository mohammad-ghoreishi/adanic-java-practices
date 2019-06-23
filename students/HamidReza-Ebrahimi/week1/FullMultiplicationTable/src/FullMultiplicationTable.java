import java.util.Scanner;


/* Prints multiplication table in Java */
public class FullMultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tableSize;
        System.out.print("input Table Size: ");
        tableSize = input.nextInt();
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {
        // first print the top header row
        if( tableSize <= 10 ) {
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        for(int i = 1 ;i<=tableSize;i++) {
            // print left most column first
            System.out.format("%4d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);

            }
            System.out.println();
        }
        }
        else {
            System.out.print("Enter a value less than 10");
        }

    }
}
