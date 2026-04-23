package Patrie1;
public class AbonnementMusique extends Abonnement implements Reducible {
    private int nbPlaylists;
    private boolean optionOffline;
    public AbonnementMusique(String nom, double prixBase, int nbProfils, int playlists, boolean offline) {
        super(nom, prixBase, nbProfils);
        this.nbPlaylists = playlists;
        this.optionOffline = offline;
    }
    @Override
    public double calculerCoutMensuel() {
        double total = getPrixBase();
        if (optionOffline) total += 15;
        return total;
    }
    @Override
    public int calculerScoreSatisfaction() {
        int score = 50;
        if (nbPlaylists > 20) score += 20;
        if (optionOffline) score += 20;
        if (getNbProfils() > 1) score += 10;
        return Math.min(score, 100);
    }
    public double AppliquerReduction(double p) {
        if (EstEligibleReduction(p))
            return calculerCoutMensuel() * (1 - p / 100);
        return calculerCoutMensuel();
    }
    public boolean EstEligibleReduction(double p) {
        return p <= 30;
    }
}