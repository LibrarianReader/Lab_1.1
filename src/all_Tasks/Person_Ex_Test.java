package all_Tasks;

public class Person_Ex_Test {
    public void test() throws Exception {
        Person_Ex personExcepction = new Person_Ex(180f, "Билли",18 );
        personExcepction.setName("Батнасан");
        personExcepction.setAge(22);
        personExcepction.setHeight(100);

        personExcepction.info();
    }
}