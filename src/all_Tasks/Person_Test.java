package all_Tasks;

import java.util.Scanner;

public class Person_Test {
    public void test() {
        Person person = new Person( 173, 18, "Батнасан");
        Scanner in = new Scanner(System.in);
        int ageVolume = in.nextInt();
        person.setAge(ageVolume);
        person.setHeight(100f);
        person.setName("");
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Имя: " + person.getName());
        System.out.println("Рост: " + person.getHeight());
    }
}