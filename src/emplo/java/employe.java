package emplo.java;

public class employe extends salaire {
    private double hSupp;
    private double pHSupp;

    // Constructor
    public employe(int matricule, int recrutement, String nom, double hSupp, double pHSupp) {
        super(matricule, recrutement, nom);
        this.hSupp = hSupp;
        this.pHSupp = pHSupp;
    }

    // Getters and Setters
    public double getHSupp() {
        return hSupp;
    }

    public void setHSupp(double hSupp) {
        this.hSupp = hSupp;
    }

    public double getPHSupp() {
        return pHSupp;
    }

    public void setPHSupp(double pHSupp) {
        this.pHSupp = pHSupp;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.printf(", Nombre d'heures supplémentaires=%.1f, Prix par heure supplémentaire=%.1f%n", hSupp, pHSupp);
    }

    @Override
    public double salaires() {
        return super.salaires() + (hSupp * pHSupp);
    }
}
