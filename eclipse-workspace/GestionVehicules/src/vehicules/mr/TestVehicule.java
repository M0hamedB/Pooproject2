// TestVehicule.java
package vehicules.mr;

import java.util.ArrayList;
import java.util.List;

public class TestVehicule {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", 2022, 15000.0, 5);
        Moto moto = new Moto("Harley Davidson", 2021, 8000.0, true);

        // Utilisation de la méthode afficherInfo()
        voiture.afficherInfo();
        moto.afficherInfo();

        // Conduite des véhicules
        voiture.conduire(1000.0);
        moto.conduire(500.0);

        // Utilisation du polymorphisme avec une liste de Vehicule
        List<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(voiture);
        vehicules.add(moto);

        // Affichage des informations en utilisant une boucle
        for (Vehicule v : vehicules) {
            v.afficherInfo();
        }
    }
}
