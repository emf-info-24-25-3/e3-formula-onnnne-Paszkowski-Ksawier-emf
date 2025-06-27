package modele;

public class Pilote {

    public int NOMBRE_PNEUS_EN_RESERVE = 16;
    private String nom;
    private String nationalite;
    private int nombrePoint;
    private int nombreCourses;
    private int nombreVictoires;
    private int nombrePodiums;
    private Pneu[] pneusEnReserve;
    private Voiture voiture;

    public Pilote(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;
    }

    public Pilote(String nom, String nationalite, Voiture voiture){
        this.nom = nom;
        this.nationalite = nationalite;
        this.voiture = voiture;

    }

    public boolean deposerPneuEnReserve(Pneu pneu){
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] == null) {
                pneusEnReserve[i] = pneu;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public Pneu retirerPneuEnReserve(TypePneu type){
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i].equals(type)) {
                pneusEnReserve[i] = null;
                return pneusEnReserve[i];
            } else {
                continue;
            }
        }
        return null;
    }

    public int compterNombrePneusEnReserveDeType(TypePneu type){
        int compterPneuDeType = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i].equals(type)) {
                compterPneuDeType ++;
            } else {
                continue;
            }
        }
        return compterPneuDeType;
    }

    public int getNombrePneusEnReserve(){
        int compterPneu = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                compterPneu ++;
            } else {
                continue;
            }
        }
        return compterPneu;
    }

    public Pneu[] getPneusEnReserveSansTrous(){
        Pneu[] listPneus = new Pneu[0];
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                
            }
        }
        return listPneus;
    }

    public String pressionMoyenneDesPneusEnReserveFormatee(){
        double moyennePression;
        double calcPressionMoyenne = 0.00;
        int nbPneu = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                nbPneu ++;
                calcPressionMoyenne += pneusEnReserve[i].getPression();
            }
        }
        moyennePression = (calcPressionMoyenne / nbPneu);
        return ("Pression moyenne des pneus est : "+ moyennePression);
    }

    public int supprimerPneusDePressionInferieure(double pression){
        int comptePneuSuprime = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i].getPression() < pression) {
                pneusEnReserve[i] = null;
                comptePneuSuprime ++;
            }
        }
        return comptePneuSuprime;
    }

    public boolean ajouterLotDePneu(Pneu[] pneus){
        for (int i = 0; i < pneus.length; i++) {
            
        }
        return true;
    }

    public String getNom(){
        return nom;
    }

    public String getNationalite(){
        return nationalite;
    }

    public int getNombrePoints(){
        return nombrePoint;
    }

    public void setNombrePoint(int nombrePoints){
        nombrePoint = 0;
    }

    public int getNombreCourses(){
        return nombreCourses;
    }

    public void setNombreCourses(int nombreCourses){
        nombreCourses = 0;
    }

    public int getNombreVictoires(){
        return nombreVictoires;
    }

    public void setNombreVictoires(int nombreVictoires){
        nombreVictoires = 0;
    }

    public int getNombrePodiums(){
        return nombrePodiums;
    }

    public void setNombrePodiums(int nombrePodiums){
        nombrePodiums = 0;
    }

    @Override
    public String toString() {
        String resultat = "Pilote: "+ nom +" ("+ nationalite +")\n";
        if (voiture != null) {
            String nomEquipe = voiture.getNomEquipe();
            int numero = voiture.getNumero();

            resultat += "-> Voiture"+ nomEquipe +"("+ numero +")\n";

            resultat += "-> Points: "+ nombrePoint +"\n";
            
            resultat += "-> Courses: "+ nombreCourses +"\n";

            resultat += "-> Victoires: "+ nombreVictoires +"\n";

            resultat += "-> Podiums: "+ nombrePodiums +"\n";
        } else {
            resultat += "-> Pas de voiture assignée.\n";
        }

        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                TypePneu type = pneusEnReserve[i].getType();

                resultat += "-> Pneu en réserve: "+ type +"\n";
            }
        }
        return resultat;
    }

}