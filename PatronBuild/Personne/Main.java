public class Main {
    public static void main(String[] args) {
        PersonneBuilder builder = new PersonneBuilder();
        Personne personne = builder.withNom("Jean").withPrenom("Pierre").withAge(30).withAdresse("123 rue de la paix 75002 Paris").withTelephone("01 23 45 67 89").build();
        System.out.println("la personnes est : " +personne);
    }
}