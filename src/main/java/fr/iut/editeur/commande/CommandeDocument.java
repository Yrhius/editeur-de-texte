package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    public abstract void commandeExecuter();

    @Override
    public void executer() {
        this.commandeExecuter();
        System.out.println(this.document);
    }
}
