
public class Etudiant{
    private String firstName;
    private String lastName;
    private String adresse;
    private int numeroTelephone;
    private String adresseMail;

    public Etudiant(String firstName, String lastName, String adresse, int numeroTelephone, String adresseMail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
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
    public int getNumeroTelephone(){
        return this.numeroTelephone;
    }
    public String getAdresseMail(){
        return this.adresseMail;
    }

}