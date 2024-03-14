import java.time.LocalDateTime;

public class Note{
    private String nomControle;
    private Etudiant etudiant;
    private int coefficient;
    private LocalDateTime date;
    private float note;
    
    public Note(String nomControle,Etudiant etudiant, int coefficient,LocalDateTime date,float note){
        this.nomControle = nomControle;
        this.etudiant = etudiant;
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

    @Override

    public String toString(){
        return "Nom du Controle :" + this.nomControle + "Etudiant :" + this.etudiant + "\n" 
        + "Coefficient :" + this.coefficient + "\n" + "Date :" + this.date+ "Note :" + this.note;
    }
}
