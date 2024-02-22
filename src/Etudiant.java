import java.util.List;
import java.util.ArrayList;

public class Etudiant{
    private String firstName;
    private String lastName;
    private String adresse;
    private List<Groupe> groupe;
    private List<Note> note;
    private int telephone;
    private String adresseMail;

    public Etudiant(String firstName, String lastName,String adresse,Groupe groupe,Note note,int telephone,String adresseMail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.groupe = new ArrayList<>();
        this.note = new ArrayList<>();
        this.telephone = telephone;
        this.adresseMail = adresseMail;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public List<Groupe> getGroupe(){
        return this.groupe;
    }
    public List<Note> getNote(){
        return this.note;
    }
    public int getTelephone(){
        return this.telephone;
    }
    public String getAdresseMail(){
        return this.adresseMail;
    }


}