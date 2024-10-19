package emplo.java;

public class salaire {
    protected int matricule;
    protected int recrutement; 
    protected String nom;

   
    public salaire(int matricule, int recrutement, String nom) {
        this.matricule = matricule;
        this.recrutement = recrutement;
        this.nom = nom;
    }

    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getRecrutement() {
        return recrutement;
    }

    public void setRecrutement(int recrutement) {
        this.recrutement = recrutement;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Recrutement: " + recrutement + ", Matricule: " + matricule;
    }

    public void affiche() {
        System.out.println(toString());
    }

    
    public double salaires() {
        if (recrutement < 2005) {
            return 400.0;
        } else {
            return 280.0;
        }
    }
}
