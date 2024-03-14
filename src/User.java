import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Cours> lesCours;


    public User(String name){
        this.name = name;
        this.LesCours = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public Cours getCours(){
        return this.lesCours;
    }
}
