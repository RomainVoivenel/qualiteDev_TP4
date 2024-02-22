public class Salle{
    private String nom;
    private int nbPlace;
    private boolean salleOrdinateur;
    public Salle(String nom, int nbPlace, boolean salleOrdinateur){
        this.nom = nom;
        this.nbPlace = nbPlace;
        this.salleOrdinateur = salleOrdinateur;
    }
    public String getNom(){
        return this.nom;
    }
    public int getNbPlace(){
        return this.nbPlace;
    }
    public boolean estSalleOrdinateur(){
        return this.salleOrdinateur;
    }
}