package emplo.java;

public class vendeur extends salaire {
    private double vente;
    private double pourcentage;

    // Constructor
    public vendeur(int matricule, int recrutement, String nom, double vente, double pourcentage) {
        super(matricule, recrutement, nom);
        this.vente = vente;
        this.pourcentage = pourcentage;
    }

    // Getters and Setters
    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.printf(", Total des ventes par mois (Dinars)=%.1f, Pourcentage sur les ventes: %.1f%%%n", vente, pourcentage * 100);
    }

    @Override
    public double salaires() {
        return super.salaires() + (vente * pourcentage);
    }
}
