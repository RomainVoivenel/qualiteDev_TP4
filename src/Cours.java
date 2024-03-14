import java.util.List;
import java.util.ArrayList;

public class Cours {
    private Matiere matiere;
    private Horaire horaire;
    private List<Groupe> lesGroupes;
    private User utilisateur;

    public Cours(Matiere matiere, Horaire horaire, User utilisateur){
        this.matiere = matiere;
        this.horaire = horaire;
        this.lesGroupes = new ArrayList<>();
        this.utilisateur = utilisateur;
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

    public User getUtilisateur(){
        return this.utilisateur;
    }

    public void ajouterGroupe(Groupe groupe){
        this.lesGroupes.add(groupe);
    }
}
