// Voiture.java
package vehicules.mr;

public class Voiture extends Vehicule {
    private int nombreSieges;

    public Voiture(String modele, int annee, double kilometrage, int nombreSieges) {
        super(modele, annee, kilometrage);
        this.nombreSieges = nombreSieges;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Voiture - Modèle: " + modele + ", Année: " + annee + ", Kilométrage: " + kilometrage + " km, Nombre de sièges: " + nombreSieges);
    }
}
