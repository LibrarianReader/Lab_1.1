package all_Tasks;

public class Gender_Test {
    public void test() {
        Gender gender = Gender.MALE;
        Gender gender2 = Gender.FEMALE;
        Gender gender3 = Gender.OTHER;
        if (gender.getNoun().isEmpty()) {
            System.out.println("Гендера нет");
        }
        else{
            System.out.println(Gender.MALE);
        }

        if (gender2.getNumber() <= 0) {
            System.out.println("Значение не задано");
        }
        else{
            System.out.println(Gender.FEMALE);
        }

        if(gender3.getNumber() <1024)  {
            System.out.println("Значения должны быть другие");
        }
        else{
            System.out.println(Gender.OTHER);
        }

    }
}