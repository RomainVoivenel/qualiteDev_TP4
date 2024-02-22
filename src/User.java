import java.util.List;
import java.util.ArrayList;

public class User {
    private String name;
    private List<Cours> lesCours;

    public User(String name){
        this.name = name;
        this.lesCours = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public List<Cours> getCours(){
        return this.lesCours;
    }

    public void ajouterCours(Cours cours){
        this.lesCours.add(cours);
    }
}
