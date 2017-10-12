/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateelimination;

import java.util.Scanner;

/**
 *
 * @author brcas1396
 */
public class DuplicateElimination {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numInputs = 5;
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < numInputs; i++) {
            System.out.println("Please enter a number between 10 and 100: ");
            array[i] = input.nextInt();
            System.println("");
            do {
                System.out.println(array[i]);
            } while ((array[i] != array[i - 1]));
        }

    }

}
