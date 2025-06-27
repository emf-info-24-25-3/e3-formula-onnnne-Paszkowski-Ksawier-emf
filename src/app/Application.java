package app;

import modele.Pilote;
import modele.Pneu;
import modele.TypePneu;
import modele.Voiture;

public class Application {

    public static void main(String[] args) {
        
        // ---------------------------------------------------------------------------------------
        // Etape 1 : Création d'une voiture de Formule 1
        // ---------------------------------------------------------------------------------------

        Voiture Ferrari = new Voiture(16, "Ferrari");

        // ---------------------------------------------------------------------------------------
        // Etape 2 : Afficher la voiture
        // ---------------------------------------------------------------------------------------

        System.out.println("Voici la première voiture : "+ Ferrari);

        // ---------------------------------------------------------------------------------------
        // Etape 3 : Création d'un pilote de Formule 1 et afficher ses informations
        // ---------------------------------------------------------------------------------------

        Pilote pilote1 = new Pilote("Charles", "Leclerc", Ferrari);

        pilote1.getNombrePneusEnReserve();
        pilote1.setNombreCourses(16);
        pilote1.setNombrePoint(65);
        pilote1.setNombreVictoires(3);
        pilote1.setNombrePodiums(7);

        // ---------------------------------------------------------------------------------------
        // Etape 4 : Afficher le Pilote
        // ---------------------------------------------------------------------------------------

        System.out.println("Voici les premier pilote : "+ pilote1);

        // ---------------------------------------------------------------------------------------
        // Etape 5 : Tests des méthodes de la classe Pilote
        // ---------------------------------------------------------------------------------------

        Pneu pneu1 = new Pneu(TypePneu.DUR_BLANC, 1.5);
        Pneu pneu2 = new Pneu(TypePneu.MEDIUM_JAUNE, 1.8);
        Pneu pneu3 = new Pneu(TypePneu.TENDRE_ROUGE, 2.0);
        Pneu pneu4 = new Pneu(TypePneu.DUR_BLANC, 1.6);
        Pneu pneu5 = new Pneu(TypePneu.MEDIUM_JAUNE, 1.7);

        // deposerPneuEnReserve() 5 fois de types différents

        pilote1.deposerPneuEnReserve(pneu1);
        pilote1.deposerPneuEnReserve(pneu2);
        pilote1.deposerPneuEnReserve(pneu3);
        pilote1.deposerPneuEnReserve(pneu4);
        pilote1.deposerPneuEnReserve(pneu5);

        // retirerPneuEnReserve() de type TENDRE_ROUGE et l'afficher

        pilote1.retirerPneuEnReserve(TypePneu.TENDRE_ROUGE);
        System.out.println("Le pneu "+ TypePneu.TENDRE_ROUGE +" à été retiré :"+ pneu3.toString());

        // getNombrePneusEnReserve() et afficher le nombre de pneus en réserve

        System.out.println("Nombre de pneus en réserve : "+ pilote1.getNombrePneusEnReserve());

        // getPneusEnReserveSansTrous() et afficher les pneus en réserve

        System.out.println("Pneu en réserve sans trous :");


        // pressionMoyenneDesPneusEnReserveFormatee() et afficher la pression moyenne des
        // pneus

        System.out.println("Pression moyenne des pneus en réserve : "+ pilote1.pressionMoyenneDesPneusEnReserveFormatee());

        // compterNombrePneusEnReserveDeType() et afficher le nombre de pneus en réserve
        // de type DUR_BLANC

        System.out.println("Nombre de pneus en réserve de type DUR_BLANC : "+ pilote1.compterNombrePneusEnReserveDeType(TypePneu.DUR_BLANC));

        // Créer les 3 pneus et ajout le lot de pneus pour le pilote et afficher réussi
        // ou échoué

        Pneu pneu6 = new Pneu(TypePneu.DUR_BLANC, 1.3);
        Pneu pneu7 = new Pneu(TypePneu.DUR_BLANC, 1.2);
        Pneu pneu8 = new Pneu(TypePneu.DUR_BLANC, 1.1);

        Pneu[] LotDePneu = new Pneu[]{pneu6, pneu7, pneu8};

        pilote1.ajouterLotDePneu(LotDePneu);

        // Supprimer les pneus de pression inférieure à 1.4 et afficher le nombre de
        // pneus supprimés

        System.out.println("Nombre de pneus suppriméws de pression inférieure à 1.4 : "+ pilote1.supprimerPneusDePressionInferieure(1.4));
        

        // ---------------------------------------------------------------------------------------

    }

}
