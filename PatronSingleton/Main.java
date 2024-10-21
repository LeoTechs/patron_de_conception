public class Main {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance(); // Créons un Singleton singleton1

        Singleton singleton2 = Singleton.getInstance(); // Créons un Singleton singleton2

      /* Comparons les deux instances pour nous rassurer qu'elles sont identiques */

        System.out.println(singleton1==singleton2);
    }
}