class VehiculeSportFactory implements VehiculeFactory {
    @Override
    public Voiture createVoiture() {
        return new VoitureSport();
    }

    @Override
    public Moto createMoto() {
        return new MotoSportive();
    }
}