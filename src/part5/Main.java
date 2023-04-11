package part5;

public class Main {
    public static void main(String[] args) {

        // 5.1
        catchIndexOutOfBoundsException();

        // 5.2
        finallyCatchIndexOutOfBoundsException();

    }

    // DEMONSTRATE THE SYNTAX OF A try-catch BLOCK
    //    define an array with 3 elements, initialise it
    //    try to access 4th element
    //    catch an exception and output to console an error message


    public static void catchIndexOutOfBoundsException(){
        int[] numbers = {1, 2, 3};

        try {
            int forthNum = numbers[3];
        }

        catch (IndexOutOfBoundsException e){
            System.out.println("There are only 3 elements in the array!");
        }
    }

    // Demonstrate syntax of try-catch-finally block: (1 pt.)
    //      duplicate previous example, but add finally clause

    public static void finallyCatchIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3};

        try {
            int forthNum = numbers[3];

        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are only 3 elements in the array!");

        } finally {
            // Increment all the numbers in the array
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]++;
                System.out.println(numbers[i]);
            }

        }
    }
}
