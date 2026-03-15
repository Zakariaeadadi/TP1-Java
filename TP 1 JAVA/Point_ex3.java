public class Point_ex3 {

    String nom;
    double abscisse;

    Point_Ex3(String nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    void translate(double valeur) {
        this.abscisse += valeur;
    }

    public static void main(String[] args) {
        Point_Ex3 p = new Point_Ex3("Origine", 1.3);

        System.out.println("Avant translation :");
        p.affiche();

        p.translate(5.9);
        System.out.println("Après translation (+5.9) :");
        p.affiche();
    }
}
