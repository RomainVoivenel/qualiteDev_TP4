import java.util.List;
import java.util.ArrayList;

public class Salle{
    private String nom;
    private int nbPlace;
    private boolean salleOrdinateur;
    public List<Horaire> listeHorraires;

    public Salle(String nom, int nbPlace, boolean salleOrdinateur){
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.salleOrdinateur = salleOrdinateur;
        this.listeHorraires = new ArrayList<>();
    }

    /**
     * Permet de changer le nom de la salle
     * @param nom un String qui sera le nom de la classe
     */
    public void setNom(String nom){
        this.nom = nom;
    }
    /**
     * Permet d'obtenir le nom de la classe
     * @return un String qui est le nom de la classe
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Permet de modifier le nombre de place disponible dans la classe
     * @param nbPlace un int qui sera le nombre de place disponible
     */
    public void setNbPlace(int nbPlace){
        this.nbPlace = nbPlace;
    }
    /**
     * Permet d'obtenir le nombre de place disponible dans la classe
     * @return un int qui est le nombre de place disponible
     */
    public int getNbPlace(){
        return this.nbPlace;
    }

    /**
     * Permet de savoir si la salle contient des ordinateurs pour que les étudiants puissent travailler dessus
     * @return un boolean
     */
    public boolean estSalleOrdinateur(){
        return this.salleOrdinateur;
    }

    /**
     * Permet d'ajouter des horraire pour une salle si cette horraire n'est pas prise
     * @param horaire un horaire
     */
    public void ajouterHorraire(Horaire horaire){
        this.listeHorraires.add(horaire);
    }
    /**
     * Permet d'obtenir les horaires pris
     * @return une liste d'horraire
     */
    public List<Horaire> getListeHoraires(){
        return this.listeHorraires;
    }

    @Override

    public String toString(){
        return "Nom :" + this.nom + "Nombre de Place :" + this.nbPlace + "\n" 
        + "Si c'est une salle des ordinateurs :" + this.salleOrdinateur + "\n" + "Liste des Horraires :" + this.listeHorraires;
    }

}