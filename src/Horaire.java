import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Horaire{
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Cours> lesCours;
    private List<Salle> lesSalles;

    public Horaire(LocalDateTime startDate, LocalDateTime endDate, Cours cours, Salle salle){
        this.startDate = startDate;
        this.endDate = endDate;
        this.lesCours = new ArrayList<>();
        this.lesSalles = new ArrayList<>();
    }
    public LocalDateTime getStartDat(){
        return this.startDate;
    }
    public LocalDateTime getEndDate(){
        return this.endDate;
    }
    public List<Cours> getlesCours(){
        return this.lesCours;
    }
    public List<Salle> getlesSalle(){
        return this.lesSalles;
    }

    public void ajouterCours(Cours cours){
        this.lesCours.add(cours);
    }
    public void ajouterSalle(Salle salle){
        this.lesSalles.add(salle);
    }
}