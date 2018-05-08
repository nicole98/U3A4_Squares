/*
 * Nicole Tao
 * Squares.java
 * Calculates and displays the square of a number
 * May 8th, 2018
 */

package squares;
import java.util.*;
/**
 *
 * @author nitao5001
 */
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> squares = new ArrayList();
        System.out.println("Squares ArrayList\n*****************");
        
        //Stores squares in ArrayList
        for (int i = 0; i < 10; i++){
            squares.add(i, i*i);
        }
        
        //Displays number and its square
        for (int i = 0; i < 10; i++){
            System.out.println("Number: " + i + "  Square: " + squares.get(i));
        }
    }
    
}
