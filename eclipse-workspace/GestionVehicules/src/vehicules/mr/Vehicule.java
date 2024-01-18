// Vehicule.java
package vehicules.mr;

public abstract class Vehicule {
    protected String modele;
    protected int annee;
    protected double kilometrage;
    protected static final double KILOMETRAGE_MAX = 190.0; // exemple de kilométrage maximal autorisé

    public Vehicule(String modele, int annee, double kilometrage) {
        this.modele = modele;
        this.annee = annee;
        this.kilometrage = kilometrage;
    }

    public abstract void afficherInfo();

    public void conduire(double distance) {
        if (distance <= KILOMETRAGE_MAX) {
            this.kilometrage += distance;
            System.out.println("Conduite de " + distance + " km effectuée. Kilométrage actuel : " + this.kilometrage + " km.");
        } else {
            System.out.println("La distance de conduite dépasse le kilométrage maximal autorisé.");
        }
    }
}
