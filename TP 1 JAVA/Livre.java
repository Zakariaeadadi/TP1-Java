public class Livre {

    private String  titre;
    private String  auteur;
    private int     nombrePages;
    private double  prix;
    private boolean prixFixe;

    public Livre(String titre, String auteur, int nombrePages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.prix = -1;
        this.prixFixe = false;
    }

    public Livre(String titre, String auteur, int nombrePages, double prix) {
        this(titre, auteur, nombrePages);
        this.prix = prix;
        this.prixFixe = true;
    }

    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public int getNombrePages(){
        return nombrePages;
    }
    public double getPrix(){
        return prix;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public void setNombrePages(int n){
        this.nombrePages = n;
    }

    public void setPrix(double prix) {
        if (prixFixe) {
            System.out.println("Erreur : le prix a déjà été fixé pour ce livre.");
        } else {
            this.prix= prix;
            this.prixFixe = true;
        }
    }

    public boolean isPrixFixe() {
        return prixFixe;
    }

    public String toString() {
        String descPrix = (!prixFixe || prix == -1) ? "Prix pas encore donné" : prix + " MAD";
        return "Livre => titre=|"" + titre + "|", auteur=|"" + auteur + "|", pages=" + nombrePages + ", prix=" + descPrix;
    }

    public int compare(Livre autre) {
        if (this.nombrePages == autre.nombrePages) return 0;
        return (this.nombrePages > autre.nombrePages) ? 1 : -1;
    }
}
