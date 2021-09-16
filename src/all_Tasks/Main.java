package all_Tasks;

public class Main {
    public static void main(String[] args) throws Exception {

            System.out.println("Ваш возраст");
            Person_Test personTest = new Person_Test();
            personTest.test();

            Person_Ex_Test personExcetpionTest = new Person_Ex_Test();
            personExcetpionTest.test();

            Client_Test clientTest = new Client_Test();
            clientTest.test();

            Emploee_Test emploeeTest = new Emploee_Test();
            emploeeTest.test();

            Gender_Test genderTest = new Gender_Test();
            genderTest.test();
        }
    }