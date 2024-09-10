package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {



    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;début;texte");
            return;
        }
        this.document.inserer(Integer.parseInt(parameters[1]),parameters[2]);
    }
}
