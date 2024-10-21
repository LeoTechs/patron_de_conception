// Utilisattion du patron Factory 
public class Main {
    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("A");
        product.reconnaitre(); // Affiche "Ceci est un produitA"
    }

}