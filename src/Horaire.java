import java.time.LocalDateTime;

public class Horaire{
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Cours cours;
    private Salle salle;

    public Horaire(LocalDateTime startDate, LocalDateTime endDate, Cours cours, Salle salle){
        this.startDate = startDate;
        this.endDate = endDate;
        this.cours = cours;
        this.salle = salle;
    }
    public LocalDateTime getStartDat(){
        return this.startDate;
    }
    public LocalDateTime getEndDate(){
        return this.endDate;
    }
    public Cours getCours(){
        return this.cours;
    }
    public Salle getSalle(){
        return this.salle;
    }
}