import java.time.LocalDateTime;

public class Note{
    private String nomControle;
    private Etudiant etudiant;
    private Matiere matiere;
    private int coefficient;
    private float note;
    
    public Note(String nomControle,Etudiant etudiant, Matiere matiere, int coefficient, float note){
        this.nomControle = nomControle;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.coefficient = coefficient;
        this.date = date;
        this.note = note;
    }
    public String getNomControle(){
        return this.nomControle;
    }
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public int getCoefficient(){
        return this.coefficient;
    }
    public LocalDateTime getDate(){
        return this.date;
    }
    public float getNote(){
        return this.note;
    }
}
