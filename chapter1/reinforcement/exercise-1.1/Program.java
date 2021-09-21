/**
 *
 *  Data Structures and Algorithm with Java - Chapter 1.1 Exercise
 *
 *  ----------------------------------------------------------------
 *  Write a short Java method, inputAllBaseTypes, that inputs a 
 *  different value of each base type from the standard input device 
 *  and prints it back to the standard output device.
 *  ----------------------------------------------------------------
 *
 *  @author Mustafa Arinmis
 *  @since  21.09.2021
 *
 * */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Helooooo");
        inputAllBaseTypes();
    }

    public static void inputAllBaseTypes() {
        Scanner input = new Scanner(System.in);
        // read boolean
        System.out.print("enter boolean: ");
        System.out.println(input.nextBoolean());
        // read char
        System.out.print("enter char: ");
        System.out.println(input.next().charAt(0));
        // read byte 
        System.out.print("enter byte: ");
        System.out.println(input.nextByte());
        // read short 
        System.out.print("enter short: ");
        System.out.println(input.nextShort());
        // read long 
        System.out.print("enter long: ");
        System.out.println(input.nextLong());
        // read float 
        System.out.print("enter float: ");
        System.out.println(input.nextFloat());
        // read double 
        System.out.print("enter double: ");
        System.out.println(input.nextDouble());
    }

}
