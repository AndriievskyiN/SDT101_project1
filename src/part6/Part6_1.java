package part6;

public class Part6_1 {
    private static int instanceCounter = 0; // This is a class variable and should not be modified outside the class

    Part6_1() {
        incrementCount();
        System.out.println(instanceCounter);
    }

    public static int getInstanceCount(){ // This is public, because we want to access it outside this class
        return instanceCounter;
    }

    private static void incrementCount() {
        // Since we don't want to modify instanceCounter from outside, I made this method private as well
        instanceCounter++;
    }
}