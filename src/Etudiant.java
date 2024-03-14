import java.util.List;
import java.util.ArrayList;

public class Etudiant{
    private String firstName;
    private String lastName;
    private String adresse;
    private List<Groupe> groupes;
    private List<Note> notes;
    private int telephone;
    private String adresseMail;

    public Etudiant(String firstName, String lastName,String adresse,Groupe groupe,Note note,int telephone,String adresseMail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.groupes = new ArrayList<>();
        this.notes = new ArrayList<>();
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
    public List<Groupe> getGroupes(){
        return this.groupes;
    }
    public List<Note> getNotes(){
        return this.notes;
    }
    public int getTelephone(){
        return this.telephone;
    }
    public String getAdresseMail(){
        return this.adresseMail;
    }
    public void ajouterGroupe(Groupe groupe){
        this.groupes.add(groupe);
    }
    public void ajouterNote(Note note){
        this.notes.add(note);
    }

    @Override
    
    public String toString(){
        return "Prenom :" + this.firstName + "Nom :" + this.lastName + "\n" 
        + "Adresse :" + this.adresse + "Groupes :" + this.groupes  + "\n" 
        + "Notes :" + this.notes + "Telephone :" + this.telephone + 
        "Adresse mail :" + this.adresseMail;
    }
}