public class User {
    private String name;
    private Cours cours;


    public User(String name, Cours cours){
        this.name = name;
        this.cours = cours;
    }

    public String getName(){
        return this.name;
    }

    public Cours getCours(){
        return this.cours;
    }
}
