/**
 *
 *  Data Structures and Algorithm with Java - Chapter 1.3 Exercise
 *
 *  ----------------------------------------------------------------
 *  Write a short Java method, isMultiple, that takes two long 
 *  values, n and m, and returns true if and only if n is a multiple
 *  of m, that is, n = mi for some integer i.
 *  ----------------------------------------------------------------
 *
 *  @author Mustafa Arinmis
 *  @since  22.09.2021
 *
 * */

public class Program {

    public static void main(String[] args) {
        System.out.println("n = 20 and m = 5: " + isMultiple(20, 5));
        System.out.println("n = 13 and m = 7: " + isMultiple(13, 7));
    }

    public static boolean isMultiple(int n, int m) {
        if (n % m == 0)
            return true;
        return false;
    }

}
