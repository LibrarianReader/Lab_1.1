package all_Tasks;

public class Client_Test {
    public void test() {
        Client client = new Client("");
        if (client.think().isEmpty()) {
            System.out.println("Пустота");
        }
    }
}