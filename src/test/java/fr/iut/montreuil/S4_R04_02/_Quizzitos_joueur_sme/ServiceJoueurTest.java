package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurDateFormatMock;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurDoublonMock;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurSimpleMockOk;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class ServiceJoueurTest extends TestCase {

    public void testServiceJoueurDoublonTest() throws JoueurDejaExistantException {
        IserviceJoueur serviceJoueur = new ServiceJoueurDoublonMock();

        JoueurDTO joueur1 = serviceJoueur.ajouterJoueur("John Doe", "john123", 1990, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});

        JoueurDTO joueur2 = serviceJoueur.ajouterJoueur("John Doe", "john123", 1990, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});

        assertNull(joueur2);
    }

    public void testServiceJoueurAjoutTest() {
        IserviceJoueur serviceJoueur = new ServiceJoueurSimpleMockOk();

        JoueurDTO joueur = serviceJoueur.ajouterJoueur("John Doe", "john123", 1990, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});

        assertNotNull(joueur);
    }

    public void testServiceJoueurDateFormatTest() {
        IserviceJoueur serviceJoueur = new ServiceJoueurDateFormatMock();

        JoueurDTO joueur = serviceJoueur.ajouterJoueur("John Doe", "john123", 30000, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});

        assertNull(joueur);
    }
}
