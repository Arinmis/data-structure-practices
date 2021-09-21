/**
 *
 *  Data Structures and Algorithm with Java - Chapter 1.2 Exercise
 *
 *  ----------------------------------------------------------------
 *  Suppose that we create an array A of GameEntry objects, which 
 *  has an integer scores field, and we clone A and store the result 
 *  in an array B. If we then immediately set A[4].score equal to 
 *  550, what is the score value of the GameEntry object referenced 
 *  by B[4]?
 *  ----------------------------------------------------------------
 *
 *  @author Mustafa Arinmis
 *  @since  21.09.2021
 *
 * */

public class Program {

    /* Answer: since array is copied shallowly
       B[4] also will be 550.To obtain fully 
       independent copy of A, 'deep copy' should 
       be implemented */
    public static void main(String[] args) {
        // create GameEntry array with random score
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) { 
            A[i] = new GameEntry((int)(Math.random() * 500) + 1); // less than 550
        }
        // copy A to B 
        GameEntry[] B = new GameEntry[A.length];
        for (int i = 0; i < A.length; i++) { 
            B[i] = A[i]; 
        }
        // change A[4] as 550
        A[4].score = 550;
        System.out.println("After A[4] has changed to 550, B[4] is: " + B[4].score);

    }

}

class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

}
