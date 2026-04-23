package Patrie1;

public class AbonnementJeux extends Abonnement {

    private int nbJeuxInclus;
    private int heuresJeuParMois;

    public AbonnementJeux(String nom, double prixBase, int nbProfils, int jeux, int heures) {
        super(nom, prixBase, nbProfils);
        this.nbJeuxInclus = jeux;
        this.heuresJeuParMois = heures;
    }

    @Override
    public double calculerCoutMensuel() {
        double total = getPrixBase();
        if (nbJeuxInclus > 50) total += 25;
        if (heuresJeuParMois > 40) total += 15;
        return total;
    }

    @Override
    public int calculerScoreSatisfaction() {
        int score = 40;
        if (nbJeuxInclus >= 30) score += 20;
        if (heuresJeuParMois >= 20) score += 20;
        if (getNbProfils() >= 2) score += 10;
        return Math.min(score, 100);
    }
}
