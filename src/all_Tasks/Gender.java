package all_Tasks;

public enum Gender {

    MALE(1, "Мужчина"),
    FEMALE(2,"Женщина" ),
    OTHER(1024, "Другое");
    private final int number;
    private final String noun;



    Gender(int number, String noun) {
        this.number = number;
        this.noun = noun;
    }


    public int getNumber() {
        return number;
    }

    public String getNoun() {
        return noun;
    }
}