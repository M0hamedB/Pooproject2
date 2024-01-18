// Moto.java
package vehicules.mr;

public class Moto extends Vehicule {
    private boolean sidecar;

    public Moto(String modele, int annee, double kilometrage, boolean sidecar) {
        super(modele, annee, kilometrage);
        this.sidecar = sidecar;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Moto - Modèle: " + modele + ", Année: " + annee + ", Kilométrage: " + kilometrage + " km, Sidecar: " + sidecar);
    }
}
