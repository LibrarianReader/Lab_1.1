package all_Tasks;

public class Emploee extends Abstract_Person {
    final String department = "Билли";

    Emploee(String name) {
        super(name);
    }

    public String think() {
        return "";
    }

    public String getName(){
        return this.name;
    }
}