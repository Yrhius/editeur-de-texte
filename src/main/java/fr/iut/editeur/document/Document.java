package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscule(int debut, int fin) {
        String milieu = texte.substring(debut, fin + 1);
        remplacer(debut, fin, milieu.toUpperCase());
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        effacer(0, texte.length()-1);
    }

    public void inserer(int debut, String texte) {
        remplacer(debut + 1, debut, texte);
    }
    public void minuscule(int debut, int fin){
        String milieu = texte.substring(debut, fin + 1);
        remplacer(debut, fin, milieu.toLowerCase());
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
