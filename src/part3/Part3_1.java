package part3;
import java.util.ArrayList;
import java.util.Arrays;

public class Part3_1 {
    public static void main(String[] args){
        // For <String> and for <Integer> types of elements
        // method add(value)
        ArrayList<String> names = new ArrayList<>();
        names.add("Nikita");
        names.add("Sasha");

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(17);
        ages.add(18);
        ages.add(19);

        // method add(index, value)
        names.add(0, "Jake");
        ages.add(1, 100);
        displayArrayList(names);
        displayArrayList(ages);

        // method get()
        System.out.println(names.get(2));
        System.out.println(ages.get(ages.size()-1));

        // method set()
        names.set(1, "Andrew");
        ages.set(0, 111);

        System.out.println();
        System.out.println("After setting");
        displayArrayList(names);
        displayArrayList(ages);

        // method remove()
        names.remove(2);
        ages.remove(0);

        System.out.println();
        System.out.println("After removing");
        displayArrayList(names);
        displayArrayList(ages);

        // method addAll()
        Integer[] newIntArray = {1, 2, 3};
        String[] newStrArray = {"apple", "banana", "orange"};

        ages.addAll(Arrays.asList(newIntArray));
        names.addAll(Arrays.asList(newStrArray));

        System.out.println(names);
        System.out.println(ages);

        // method indexOf()
        System.out.println("index of apple: " + names.indexOf("apple"));
        System.out.println("index of 200: " + ages.indexOf(200)); // Output: -1, because the elements doesn't exist

        // Square the elements
        ArrayList<Integer> squared_ages = square(ages);
        displayArrayList(squared_ages);
    }



    // Method to display elements (using the enhanced for loop)
    public static void displayArrayList(ArrayList<?> arrayList){
        System.out.print("{ ");
        for (Object item : arrayList){
            System.out.print(item + " ");
        }

        System.out.println("}");
    }


    // Iterating through an array using a regular for loop
    public static ArrayList<Integer> square(ArrayList<Integer> list){
        // Make a copy of the list
        ArrayList<Integer> list_copy = new ArrayList<>(list);


        for (int i = 0; i < list_copy.size(); i++){
            Integer curElementSquared = list_copy.get(i) * list_copy.get(i);
            list_copy.set(i, curElementSquared);
        }

        return list_copy;
    }

}
