import java.util.ArrayList;
import java.util.List;

public class Groupe{
    private String nom;
    private List<Etudiant> lesEtudiants;
    private List<Cours> lesCours;

    public Groupe(String nom){
        this.nom = nom;
        this.lesEtudiants = new ArrayList<>();
        this.lesCours = new ArrayList<>();
    }
    /**
     * Permet d'obtenir le nom du groupe
     * @return le nom du groupe
     */
    public String getNom(){
        return this.nom;
    }
    /**
     * Permet d'obtenir la liste d'étudiants présents dans le groupe
     * @return une liste d'étudiants
     */
    public List<Etudiant> getEtudiants(){
        return this.lesEtudiants;
    }
    /**
     * Permet d'obtenir la liste de cours pour ce groupe
     * @return une liste de cours
     */
    public List<Cours> getCours(){
        return this.lesCours;
    }
    /**
     * Permet d'ajouter un étudiant au groupe
     * @param etudiant l'étudiant a ajouter
     */
    public void ajouterEtudiant(Etudiant etudiant){
        this.lesEtudiants.add(etudiant);
    }
    /**
     * Permet d'ajouter un cours au groupe
     * @param cours le cours a ajouter
     */
    public void ajouterCours(Cours cours){
        this.lesCours.add(cours);
    }
    public boolean enleverEtudiant(Etudiant etudiant){
        if (this.lesEtudiants.contains(etudiant)){
            this.lesEtudiants.remove(etudiant);
            return true;
        }
        return false;
    }
    public boolean enleverCours(Cours cours){
        if (this.lesCours.contains(cours)){
            this.lesCours.remove(cours);
            return true;
        }
        return false;
    }
}
