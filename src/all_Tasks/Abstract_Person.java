package all_Tasks;

public abstract class Abstract_Person implements Human_Interface{
        protected String name;
        public String getName(){
            return this.name;
        };

        Abstract_Person(String name){
            this.name=name;
        }
        public abstract String think();
}