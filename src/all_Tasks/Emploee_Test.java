package all_Tasks;

public class Emploee_Test {
    public void test() {
        Emploee emploee = new Emploee("");
        if (emploee.think().isEmpty()) {
            System.out.println("Пустота");
        }
    }
}