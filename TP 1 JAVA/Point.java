public class Point {
    private char nom;
    private double abscisse;

    public void initialiser(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void initialiser_objet(Point p) {
        this.nom = p.nom;
        this.abscisse = p.abscisse;
    }

    public void afficher() {
        System.out.println(" Nom: "+this.nom);
        System.out.println(" Abscisse: "+this.abscisse);
    }

    public void translate(double abscisse) {
        this.abscisse += abscisse;
    }
}