import java.util.*;/**
 * Skeleton code for an array based implementation of Young's tableau.
 *
 * @author Iain Hewson
 */
public class TableauApp {

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        final int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp.toString(valid));
        System.out.println(TableauApp.columnValuesIncrease(valid));
    }

    /**
     * Determines whether the array passed to it is a valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        if(rowLengthsDecrease(t) & rowValueIncrease(t) & columnValuesIncrease(t) & isSetOf1ToN(t)) return true;
        return false;
        

       
    }

    /**
     *  Returns a string representation of an array based tableau.
     *
     * @param t a two-dimensional array which represents a tableau.
     *
     * @return a string representation of an array based tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
	}
	return result.toString();
    }

    /**
     *  @param t a two-dimensional array which represents a tableau
     * 
     *  @return a boolean if the input array has a decreasing row length will be returned, otherwise false
     */

    public static boolean rowLengthsDecrease(int[][] t){
        if(t.length == 0) return true;
        int prevRowLength = t[0].length;
        for(int i = 1; i < t.length; i++){
            int currentRowLength = t[i].length;
            if(currentRowLength > prevRowLength){
                return false;
            }
            prevRowLength = currentRowLength;
        }
        return true;
    }

    /**
     *  @param t a two-dimensional array which represents a tableau
     * 
     *  @return a boolean If all the row values are arranged in a ascending order, otherwise return false
     */

    public static boolean rowValueIncrease(int[][] t){
        if(t.length == 0) return true;
        for(int[] row: t){
            if(row.length > 1){
                int prevInt = row[0];
                for(int i = 1; i < row.length; i++){
                    int curInt = row[i];
                    if(prevInt > curInt){
                        return false;
                    }
                    prevInt = curInt;

                }
            }
        }
        return true;
    }

    /**
     * 
     * @param t a two-dimensional array which represents a tableau
     * @return a boolean. If items in all columns are arrange in decending order, otherwise return false;
     */

    public static boolean columnValuesIncrease(int[][] t){
        // if the set is empty it is considered a tableau
        if(t.length == 0) return true;

        // initialise the length of the frist column
        int length = t.length;

        // loop through each column
        for(int j = 0; j < t[0].length; j++){
            int prevInt = t[0][j];

            // keep track of how much we have to decrement the current length in order to get the length or the next column
            int decrement = 0;
         
                if(!(length <= 1)){
                    for(int i = 0; i < length; i++){
                        int curInt = t[i][j];
                        if(curInt < prevInt){
                            return false;
                        }

                        // check if the current row expands to the next column
                        if((t[i].length - i) <= 1){
                            decrement++;
                        }
                        prevInt = curInt;
    
                    }
                }

                // decrement the length so that it matches the length of the next column
                length  = length - decrement;

            
        }
        return true;
    }

    /**
     * 
     * @param t a two-dimensional array which represents a tableau
     * @return a boolean If the integers within the given array is in {1, 2, ... , n}, otherwise return false
     */

    public static boolean isSetOf1ToN(int[][] t){

        int n = t[0][t[0].length - 1];

        // find the larget value in the set, n
        // Since we know that the largest values is going to be in the last row.
        // We dont have to loop through every row in a column just check the last row
        for(int[] row: t){
            if(row[row.length - 1] > n) n = row[row.length -1];
        }

        // initailise a set to keep track to items
        // use set because it has n(o) look up and add time
        Set<Integer> set = new HashSet<Integer>();
        for(int[] row: t){
            for(int item: row){
                if(set.contains(item) | item < 1 & item > n) return false;
                if(item >= 1 & item <= n) set.add(item);
            }
        }
        if(set.size() < n) return false;
        return true;
    }


    
    
   

}