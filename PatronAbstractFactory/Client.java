public class Client {
    public static void main(String[] args) {
        // Choix de la factory
        VehiculeFactory factory = new VehiculeSportFactory();

        // Création des véhicules
        Voiture voiture = factory.createVoiture();
        Moto moto = factory.createMoto();

        // Utilisation  des véhicules
        voiture.conduire(); // Pour Conduire une voiture de sport.
        moto.conduire();    // Pour  Conduire une moto sportive.

        // Channgement  de la  factory
        factory = new VehiculeFamilialeFactory();
        voiture = factory.createVoiture();
        moto = factory.createMoto();

        voiture.conduire(); // On aura donc :  Conduire une voiture familiale.
        moto.conduire();    // Ce qui nous donnera  : Conduire une moto classique.
    }
}





