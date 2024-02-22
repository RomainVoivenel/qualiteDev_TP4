import java.time.LocalDateTime;

public class Note{
    private String nomControle;
    private Integer note;
    private int coefficient;
    private LocalDateTime date;
    
    public Note(String nomControle, Integer note, int coefficient,LocalDateTime date){
        this.nomControle = nomControle;
        this.note = note;
        this.coefficient = coefficient;
        this.date = date;
    }
    public String getnomControle(){
        return nomControle;
    }
    public Integer getNote(){
        return note;
    }
    public int getCoefficient(){
        return coefficient;
    }
    public LocalDateTime getDate(){
        return date;
    }
}