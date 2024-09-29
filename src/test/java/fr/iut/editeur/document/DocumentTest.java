package fr.iut.editeur.document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {

    @Test
    public void testConstructeur() {
        Document doc =new Document();
        assertTrue(doc.getTexte().equals(""));
    }

    @Test
    public void testSetTexte() {
        Document doc =new Document();
        doc.setTexte("test");
        assertTrue(doc.getTexte().equals("test"));
    }

    @Test
    public void testAjouter() {
        Document doc =new Document();
        doc.setTexte("test");
        doc.ajouter(" continue");
        assertTrue(doc.getTexte().equals("test continue"));
    }

}