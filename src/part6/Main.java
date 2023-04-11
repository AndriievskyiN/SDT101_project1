package part6;

public class Main {
    public static void main(String[] args) {

        // 6.1
        System.out.println("Part 6.1");
        Part6_1 obj1 = new Part6_1();
        Part6_1 obj2 = new Part6_1();
        Part6_1 obj3 = new Part6_1();

        int instanceCounter = Part6_1.getInstanceCount();
        System.out.println(instanceCounter);

        // 6.2
        System.out.println("Part 6.2");
        Person person1 = new Person();
        person1.printPersonInfo();

        Person person2 = new Person("Nikita", "Andriievskyi", 2005);
        person2.printPersonInfo();

    }
}


