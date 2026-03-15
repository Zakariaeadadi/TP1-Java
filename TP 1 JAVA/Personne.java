public class Personne {

    String cin;
    String nom;
    String prenom;
    String email;
    int age;

    void initialiser(String cin, String nom, String prenom, String email, int age) {
        this.cin    = cin;
        this.nom    = nom;
        this.prenom = prenom;
        this.email  = email;
        this.age    = age;
    }

    void afficherPersonne() {
        System.out.println("CIN: "+this.CIN+ "Nom: "+this.Nom + "Prenom: " +this.Prenom+ "Email: " +this.Email+ "Age: " +this.Age);
    }

    public static void main(String[] args) {
        Personne a;
        a = new Personne();
        a.initialiser("CD234", "zakaria", "adadi", "z.ssd@gmai.com", 20);
        a.afficherPersonne();
    }
}
