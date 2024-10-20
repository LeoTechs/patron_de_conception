public class PersonneBuilder{
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private String  telephone;

    public PersonneBuilder withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public PersonneBuilder withPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public PersonneBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PersonneBuilder withAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public PersonneBuilder withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public Personne build() {
        return new Personne(nom, prenom, age, adresse, telephone);
    }
}