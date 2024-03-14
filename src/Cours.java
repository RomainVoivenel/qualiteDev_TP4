import java.util.List;
import java.util.ArrayList;

public class Cours {
    private Matiere matiere;
    private Horaire horaire;
    private List<Groupe> lesGroupes;
    private List<User> lesUser;

    public Cours(Matiere matiere, Horaire horaire){
        this.matiere = matiere;
        this.horaire = horaire;
        this.lesGroupes = new ArrayList<>();
        this.lesUser = new ArrayList<>();
    }

    public Matiere getMatiere(){
        return this.matiere;
    }

    public Horaire getHoraire(){
        return this.horaire;
    }

    public List<Groupe> getLesGroupes(){
        return this.lesGroupes;
    }

    public List<User> getLesUser(){
        return this.lesUser;
    }

    public void ajouterGroupe(Groupe groupe){
        this.lesGroupes.add(groupe);
    }

    public void ajouterUser(User user){
        this.lesUser.add(user);
    }

    @Override

    public String toString(){
        return "Matiere :" + this.matiere + "horaire :" + this.horaire + "\n" 
        + "les Groupes :" + this.lesGroupes + "\n" + "les utiliseurs :" + this.lesUser;
    }
}
