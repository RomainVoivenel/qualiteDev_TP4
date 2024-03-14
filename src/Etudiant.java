import java.util.List;
import java.util.ArrayList;

public class Etudiant{
    private String firstName;
    private String lastName;
    private String adresse;
    private List<Groupe> lesGroupe;
    private List<Note> lesNotes;
    private int telephone;
    private String adresseMail;

    public Etudiant(String firstName, String lastName,String adresse,int telephone,String adresseMail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.lesGroupe = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
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
        return this.lesGroupe;
    }
    public List<Note> getNotes(){
        return this.lesNotes;
    }
    public int getTelephone(){
        return this.telephone;
    }
    public String getAdresseMail(){
        return this.adresseMail;
    }
    public void ajouterGroupe(Groupe groupe){
        this.lesGroupe.add(groupe);
    }
    public void ajouterNote(Note note){
        this.note.add(note);
    }
    @Override
    public boolean equals(Object objet){
        if (objet == null) {return false;}
        if (objet == this) {return true;}
        if (! (objet instanceof Etudiant)) {return false;}
        Etudiant etudiant = (Etudiant)objet;
        return this.firstName.equals(etudiant.getFirstName()) &&
        this.lastName.equals(etudiant.getLastName()) &&
        this.adresse.equals(etudiant.getAdresse()) &&
        this.lesGroupe.equals(etudiant.getGroupe()) &&
        this.lesNotes.equals(etudiant.getNotes()) &&
        this.telephone == etudiant.getTelephone() &&
        this.adresseMail.equals(etudiant.getAdresseMail());
    }
}