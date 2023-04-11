package part3;
import java.util.ArrayList;
import java.util.Arrays;

public class Part3_2 {
    public static void main(String[] args){
        // 3.2.1
        ArrayList<String> names = new ArrayList<>();
        names.add("Aaron");
        names.add("Andrew");
        names.add("Bob");
        names.add("Brian");
        names.add("Zack");

        insertName(names, "Charles");

        System.out.println(names);


        // 3.2.2
        ArrayList<Integer> ages = new ArrayList<>();
        Integer[] agesArray = {5, 1, 2, 5, 3, 5};
        ages.addAll(Arrays.asList((agesArray)));

        arrayListRemove(ages, 5);
        System.out.println(ages);
    }

    public static void insertName(ArrayList<String> names, String name){
        // ASSUMING THAT THE names LIST IS ALREADY IN ASCENDING ORDER
        int index = 0;

        for (int i = 0; i < names.size(); i++){
            String curName = names.get(i);
            if (name.compareTo(curName) > 0) {
                index = i;
            }
        }

        names.add(index+1, name);
    }

    public static void arrayListRemove(ArrayList<Integer> list, Integer value){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == value){
                list.remove(i);
            }
        }
    }
}
