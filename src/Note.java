import java.time.LocalDateTime;

public class Note{
    private String nomControle;
    private Integer note;
    private int coefficient;
    private LocalDateTime date;
    private Matiere matiere;
    
    public Note(String nomControle,Integer note,int coefficient,LocalDateTime date,Matiere matiere){
        this.nomControle = nomControle;
        this.note = note;
        this.coefficient = coefficient;
        this.date = date;
        this.matiere = matiere;
    }
    public String getnomControle(){
        return this.nomControle;
    }
    public Integer getNote(){
        return this.note;
    }
    public int getCoefficient(){
        return this.coefficient;
    }
    public LocalDateTime getDate(){
        return this.date;
    }
    public Matiere getMatiere(){
        return this.matiere;
    }
}