package Patrie1;

public class TestAbonnements {

    public static void main(String[] args) {

        
        Abonnement[] abonnements = new Abonnement[3];

        abonnements[0] = new AbonnementVideo("Netflix", 100, 4, true, true);
        abonnements[1] = new AbonnementMusique("Spotify", 50, 2, 25, true);
        abonnements[2] = new AbonnementJeux("GamePass", 80, 2, 60, 50);

        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Cout: " + a.calculerCoutMensuel());
            System.out.println("Score: " + a.calculerScoreSatisfaction());
            System.out.println("---------------");
        }

       
        Reducible[] reducibles = new Reducible[2];
        reducibles[0] = (Reducible) abonnements[0];
        reducibles[1] = (Reducible) abonnements[1];

        for (Reducible r : reducibles) {
            System.out.println("Reduction 20%: " + r.AppliquerReduction(20));
            System.out.println("Reduction 50%: " + r.AppliquerReduction(50));
        }
    }
}