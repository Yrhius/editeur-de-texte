package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscule;debut;fin");
        }else {
            this.document.majuscule(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "Cette fonction permet de passer en majuscule une partie du texte";
    }
}
