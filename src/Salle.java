import java.util.List;
import java.util.ArrayList;

public class Salle{
    private String nom;
    private int nbPlace;
    private boolean salleOrdinateur;
    public Horaire horaire;

    public Salle(String nom, int nbPlace, boolean salleOrdinateur, Horaire horaire){
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.salleOrdinateur = salleOrdinateur;
        this.horaire = horaire;
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
     * Permet d'obtenir les horaires pris
     * @return une liste d'horraire
     */
    public Horaire getHoraires(){
        return this.listeHorraires;
    }
}