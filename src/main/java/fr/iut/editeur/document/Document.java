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


    /**
     *
     * @param debut
     * @param fin
     * @param remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     *
     * @param debut
     * @param fin
     */
    public void majuscule(int debut, int fin) {
        String milieu = texte.substring(debut, fin + 1);
        remplacer(debut, fin, milieu.toUpperCase());
    }

    /**
     *
     * @param debut
     * @param fin
     */

    /**
     *
     * @param debut
     * @param fin
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     *
     */
    public void clear() {
        effacer(0, texte.length()-1);
    }

    /**
     *
     * @param debut
     * @param texte
     */
    public void inserer(int debut, String texte) {
        remplacer(debut + 1, debut, texte);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.texte;
    }
}
