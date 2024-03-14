import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Cours> lesCours;


    public User(String name){
        this.name = name;
        this.LesCours = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public Cours getCours(){
        return this.lesCours;
    }

    public boolean creerCours(LocalDateTime startDate, LocalDateTime endDateTime, Matiere matiere, Salle salle){
        for (Cours cours : this.lesCours){
            if (cours.getHoraire().getStartDate() <= startDate && cours.getHoraire().getEndDate() >= endDateTime){
                this.lesCours.add(new Cours(matiere, new Horaire(startDate, endDateTime)));
                return true
            }
        }
        return false

    }
    public void ajouterNote(Etudiant etudiant, Note note){
=======
    }
    public boolean ajouterNote(Etudiant etudiant, Note note){
        for (Cours cours : this.lesCours){
            for (Groupe groupe : cours.getLesGroupes()){
                if (groupe.contains(etudiant)){
                    etudiant.ajouterNote(note);
                }
            }
        }
    }
    public double calculerMoyenne(Groupe unGroupe){
        double res = null;
        int cpt = 0
        for (Cours cours : this.lesCours){
            for(Groupe groupe : cours.getLesGroupes()){
                if (groupe.equals(unGroupe)){
                    for (Etudiant etudiant : groupe.getEtudiants()){
                        for (Note note : etudiant.getNotes()){
                            if (res == null || res < note.getNote()){
                                res += note.getNote();
                                cpt += 1;
                            }
                        }
                    }
                }
            }
        }
        if (cpt != 0){
            return res/cpt;
        }
        return null;
    }
    public double notePlusBasse(Groupe unGroupe){
        double res = null;
        for (Cours cours : this.lesCours){
            for(Groupe groupe : cours.getLesGroupes()){
                if (groupe.equals(unGroupe)){
                    for (Etudiant etudiant : groupe.getEtudiants()){
                        for (Note note : etudiant.getNotes()){
                            if (res == null || res > note.getNote()){
                                res = note.getNote();
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
    public double notePlusHaute(Groupe unGroupe){
        double res = null;
        for (Cours cours : this.lesCours){
            for(Groupe groupe : cours.getLesGroupes()){
                if (groupe.equals(unGroupe)){
                    for (Etudiant etudiant : groupe.getEtudiants()){
                        for (Note note : etudiant.getNotes()){
                            if (res == null || res < note.getNote()){
                                res = note.getNote();
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
