import java.time.LocalDateTime;

public class Note{
    private String nomControle;
    private Etudiant etudiant;
    private Matiere matiere;
    private double note;
    
    public Note(String nomControle,Etudiant etudiant, Matiere matiere, double note){
        this.nomControle = nomControle;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.coefficient = coefficient;
        this.note = note;
    }
    public String getNomControle(){
        return this.nomControle;
    }
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public LocalDateTime getDate(){
        return this.date;
    }
    public float getNote(){
        return this.note;
    }
}
