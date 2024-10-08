package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void commandeExecuter() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;debut;fin;chaine");
        }else if(parameters.length == 4) {
            this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), parameters[3]);
        }else{
            this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), "");
        }
    }

    @Override
    public String getDescriptionCommande() {
        return "Cette fonction permet de remplacer une partie du texte par un autre morceau de texte";
    }

}