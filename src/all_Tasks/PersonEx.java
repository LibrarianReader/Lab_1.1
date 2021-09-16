package all_Tasks;

class Person_Ex {

    private int age;
    private float height;
    private String name;
    private final double MAX_HEIGHT = 3.2;
    private final int MAX_AGE = 200;

    Person_Ex(float height, String name, int age) {
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        try {
            if (age > MAX_AGE || age <= 0);
        } catch (Exception e) {
            System.out.println("Неккоректно");
        } finally {
            System.out.println("Ошибка устранена");
        }
        this.age = age;
    }
    
    public void setHeight(float height) {
        try {
            if (height > MAX_HEIGHT || height <= 0);
        } catch (Exception e) {
            System.out.println("Неккоректно");
        } finally {
            System.out.println("Ошибка устранена");
        }
        this.height = height;
    }

    public void setName(String name) {
        try {
            if (name.isEmpty());
        } catch (Exception e) {
            System.out.println("Пустота");
        } finally {
            System.out.println("Ошибка устранена");
        }
        this.name = name;
    }

    void info() {
        System.out.println("Информация об человеке: Возраст: " + age + " Рост: " + height + " Имя: " + name);
    }

    public int intAge() {
        return age;
    }

    public float floatHeight() {
        return height;
    }

    public String stringName() {
        return name;
    }


}
