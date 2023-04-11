package part2;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        // DEMONSTRATE THE USE OF Integer, Double, Boolean, Character

        // As I understand in the newer version of Java, we should use Integer.valueOf(int), instead of
        // using the "new" keyword, right?

        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(3.14);
        Boolean booleanObj = Boolean.valueOf(true);
        Character charObj = Character.valueOf('A');

        System.out.println(intObj);
        System.out.println(doubleObj);
        System.out.println(booleanObj);
        System.out.println(charObj);


        // USE METHOD parseInt() FOR Integer
        String intStr = "20";
        int intVal = Integer.parseInt(intStr);
        System.out.println("Parsed integer value: " + intVal);


        // DEMONSTRATE USAGE OF intValue() AND doubleValue() METHODS
        int intVal2 = intObj.intValue();
        double doubleVal1 = doubleObj.doubleValue();
        System.out.println("Integer value: " + intVal2);
        System.out.println("Double value: " + doubleVal1);


        // USE METHOD toString()
        String booleanStr = booleanObj.toString();
        String charStr = charObj.toString();
        System.out.println("Boolean value as string: " + booleanStr);
        System.out.println("Character value as string: " + charStr);

        // USE hasCode() FOR Integer, Char, Boolean, Double
        int intHashCode = intObj.hashCode();
        int charHashCode = charObj.hashCode();
        int booleanHashCode = booleanObj.hashCode();
        int doubleHashCode = doubleObj.hashCode();

        System.out.println("Integer hash code: " + intHashCode);
        System.out.println("Character hash code: " + charHashCode);
        System.out.println("Boolean hash code: " + booleanHashCode);
        System.out.println("Double hash code: " + doubleHashCode);


        // USE METHOD compareTo(), DEMONSTRATE DIFFERENT RESULTS OF COMPARISON. COMPARE NUMBERS. COMPARE ALSO STRINGS.
        // Comparing numbers
        Integer intObj1 = Integer.valueOf(10);
        Integer intObj2 = Integer.valueOf(20);
        System.out.println(intObj1.compareTo(intObj2)); // Output: -1
        System.out.println(intObj2.compareTo(intObj1)); // Output: 1
        System.out.println(intObj1.compareTo(intObj1)); // Output: 0


        // Comparing strings
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println(
                str1.compareTo(str2)); // Output: -1

        System.out.println(
                str2.compareTo(str1)); // Output: 1

        System.out.println(
                str1.compareTo(str3)); // Output: 0


        // COMPARE OUTPUTS: a + b AND a.toString() + b.toString() WHERE a AND b HAVE Integer TYPE.
        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);

        System.out.println(a + b);
        System.out.println(
                a.toString() + b.toString()
        );



    }
}
