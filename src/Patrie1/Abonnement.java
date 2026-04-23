package Patrie1;

public abstract class Abonnement {

    private String nom;
    private double prixBase;
    private int nbProfils;

    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        this.prixBase = (prixBase > 0) ? prixBase : 50;
        this.nbProfils = (nbProfils > 0) ? nbProfils : 1;
    }

    // 🔹 Getters / Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrixBase() { return prixBase; }
    public void setPrixBase(double prixBase) {
        this.prixBase = (prixBase > 0) ? prixBase : 50;
    }

    public int getNbProfils() { return nbProfils; }
    public void setNbProfils(int nbProfils) {
        this.nbProfils = (nbProfils > 0) ? nbProfils : 1;
    }

    
    public boolean estPartageFamilial() {
        return nbProfils >= 3;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix Base: " + prixBase);
        System.out.println("Nb Profils: " + nbProfils);
        System.out.println("Partage familial: " + estPartageFamilial());
    }

    
    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();
}