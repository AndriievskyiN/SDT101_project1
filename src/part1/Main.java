package part1;

public class Main {
    public static void main(String[] args) {
        int [][] array1 = initializeArray1(5, 5);
      displayArray(array1, 1);

        int [][] array2 = initializeArray2(5, 5);
      displayArray(array2, 2);

        int [][] array3 = initializeArray3(5, 5);
      displayArray(array3, 3);

        int [][] array4 = initializeArray4(5, 5);
        displayArray(array4, 4);

        int [][] array5 = initializeArray5(5, 5);
        displayArray(array5, 5);
    }

    // Initialize with only 5s
    public static int[][] initializeArray1(int N, int M) {
        int [][] array = new int[N][M];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = 5;
            }
        }

        return array;
    }

    // Initialize an array such that each column is incremented
    public static int [][] initializeArray2(int N, int M){
        int [][] array = new int[N][M];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = j;
            }
        }

        return array;
    }


    // Initialize an array (0-4, 5-9, 10-14, etc)
    public static int [][] initializeArray3(int N, int M){
        int [][] array = new int[N][M];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = i * 5 + j;
            }
        }

        return array;
    }


    // Initialize an array like previous method but in reverse (4-0, 9-5, etc)
    public static int[][] initializeArray4(int N, int M){
        int [][] array = new int[N][M];

        for (int i = 0; i < array.length ; i++){
            for (int j = array[0].length - 1; j >= 0; j--){
                int colIdx = array[0].length-j-1;
                array[i][colIdx] = i*5+j;
            }
        }

        return array;
    }

    // Initialize an array (like previous method, but rows are in reverse)
    public static int[][] initializeArray5(int N, int M){
        int [][] array = new int[N][M];

        for (int i = array[0].length - 1; i >= 0; i--){
            for (int j = array[0].length - 1; j >= 0; j--){
                int rowIdx = array.length-i-1;
                int colIdx = array[0].length-j-1;
                array[rowIdx][colIdx] = i*5+j;
            }
        }

        return array;
    }


    // Method to display array elements
    public static void displayArray(int[][] arrayToDisplay, int methodNumber){
        System.out.println("Array initializer method #" + methodNumber + "\n");

        for (int i = 0; i < arrayToDisplay.length; i++){
            for (int j = 0; j < arrayToDisplay[i].length; j++){
                System.out.print(arrayToDisplay[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("-------------------------");
    }
}
