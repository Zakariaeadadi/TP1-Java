public class Etager {

    private Livre[] livres;
    private int     capacite;
    private int     nbLivres;

    public Etagere(int capacite) {
        this.capacite = capacite;
        this.livres   = new Livre[capacite];
        this.nbLivres = 0;
    }

    public int getCapacite() { return capacite; }
    public int getNbLivres() { return nbLivres; }

    public void ajouter(Livre livre) {
        if (nbLivres >= capacite) {
            System.out.println("Étagère pleine ! Impossible d'ajouter le livre.");
        } else {
            livres[nbLivres++] = livre;
        }
    }

    public Livre getLivre(int position) {
        if (position < 1 || position > nbLivres) {
            System.out.println("Position invalide : " + position);
            return null;
        }
        return livres[position - 1];
    }

    public int chercher(String titre, String auteur) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].getTitre().equalsIgnoreCase(titre) && livres[i].getAuteur().equalsIgnoreCase(auteur))
                return i + 1;
        }
        return 0;
    }

    public void supprimer(int position) {
        if (position < 1 || position > nbLivres) {
            System.out.println("Position invalide : " + position);
            return;
        }
        for (int i = position - 1; i < nbLivres - 1; i++)
            livres[i] = livres[i + 1];
            livres[--nbLivres] = null;
    }
}
