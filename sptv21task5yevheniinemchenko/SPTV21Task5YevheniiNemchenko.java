package sptv21task5yevheniinemchenko;
import java.util.Arrays;
import java.util.Random;
public class SPTV21Task5YevheniiNemchenko {

    public static void main(String[] args) {
        int [][] jaggedArray = new int[5][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[7];
        jaggedArray[3] = new int[8];
        jaggedArray[4] = new int[9];
        Random random = new Random();
        
        for (int i = 0; i < jaggedArray.length; i++)
            for (int j = 0; j < jaggedArray[i].length; j++)
                jaggedArray[i][j] = random.nextInt(100);
                System.out.println("Default");
                for (int[] row : jaggedArray) System.out.println(Arrays.toString(row));
                System.out.println("");
                System.out.println("New");
        
        for (int i = 0; i < jaggedArray.length; i++) {
            Arrays.sort(jaggedArray[i]);
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++)
                System.out.print(jaggedArray[i][j] + " ");
                System.out.println();

        }
    }
}