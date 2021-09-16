package all_Tasks;

public class Client extends Abstract_Person{
    String service;
    float price;

    Client(String name) {
        super(name);
    }

    public String think() {
        return "";
    }
    public String getName() {
        return this.name;
    }
}