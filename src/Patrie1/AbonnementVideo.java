package Patrie1;
public class AbonnementVideo extends Abonnement implements Reducible {
    private boolean optionHD;
    private boolean option4K;
    public AbonnementVideo(String nom, double prixBase, int nbProfils, boolean hd, boolean k4) {
        super(nom, prixBase, nbProfils);
        this.optionHD = hd;
        this.option4K = k4;
    }
    @Override
    public double calculerCoutMensuel() {
        double total = getPrixBase();
        if (optionHD) total += 10;
        if (option4K) total += 20;
        return total;
    }
    @Override
    public int calculerScoreSatisfaction() {
        int score = 60;
        if (optionHD) score += 10;
        if (option4K) score += 20;
        if (getNbProfils() >= 4) score += 10;
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