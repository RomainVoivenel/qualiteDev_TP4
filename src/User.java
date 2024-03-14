import java.time.LocalDateTime;
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

    public boolean creerCours(LocalDateTime startDate, LocalDateTime endDateTime, Matiere matiere, Salle salle){
        for (Cours cours : this.lesCours){
            if (cours.getHoraire().getStartDate() <= startDate && cours.getHoraire().getEndDate() >= endDateTime){
                this.lesCours.add(new Cours(matiere, new Horaire(startDate, endDateTime)));
                return true
            }
        }
        return false
    }
}
