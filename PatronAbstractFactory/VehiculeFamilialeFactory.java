class VehiculeFamilialeFactory implements VehiculeFactory {
    @Override
    public Voiture createVoiture() {
        return new VoitureFamiliale();
    }

    @Override
    public Moto createMoto() {
        return new MotoClassique();
    }
}