package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMinuscule extends CommandeDocument{

    public CommandeMinuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : minuscule;debut;fin");
            return;
        }else {
            this.document.minuscule(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "Cette fonction permet de passer en minuscule une partie du texte";
    }
}