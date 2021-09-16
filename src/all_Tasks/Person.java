package all_Tasks;

import java.util.Scanner;

public class Person {

    private int age;
    private float height;
    private String name;

    private final double MAX_HEIGHT = 3.2;
    private final int MAX_AGE = 200;

    public Person(int height, int age, String name) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public boolean isValid() {
        if (this.age > MAX_AGE || this.height > MAX_HEIGHT) {
            return false;
        }
        if (this.age <= 0 || this.height <= 0 || this.name.isEmpty()) {
            return false;
        }
        return true;
    }


    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Вы маленький");
        } else {
            this.age = age;
        }
    }

    public void setHeight(float height) {
        if (height <= 50f) {
            System.out.println("Такого роста не существует");
        } else {
            this.height = height;
        }
    }

    public void setName(String name) {
        if (name == "") {
            System.out.println("У всех есть имена");
        } else {
            this.name = name;
        }
    }

    void info() {
        System.out.println("Информация об человеке: Возраст: " + age + " Рост: " + height + " Имя: " + name);
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}