public class Salle{
    private String nom;
    private int nbPlace;
    private boolean salleOrdinateur;

    public Salle(String nom, int nbPlace, boolean salleOrdinateur){
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.salleOrdinateur = salleOrdinateur;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }

    public void setNbPlace(int nbPlace){
        this.nbPlace = nbPlace;
    }
    public int getNbPlace(){
        return this.nbPlace;
    }

    public boolean estSalleOrdinateur(){
        return this.salleOrdinateur;
    }
}