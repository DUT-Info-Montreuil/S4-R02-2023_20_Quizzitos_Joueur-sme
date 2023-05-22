package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.impl.ServiceJoueurBean;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurDateFormatMock;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurDoublonMock;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurParamVideMock;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks.ServiceJoueurSimpleMockOk;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.DateFormatIncorrecteException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurNonExistantException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.LangueNonRéférencéeException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.ParametreManquantException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;



/**
 * Unit test for simple App.
 */
public class ServiceJoueurTest  {
    private IserviceJoueur serviceJoueur ;

    @BeforeEach
    public void init() {
        serviceJoueur = new ServiceJoueurBean();
    }

    @Test
    public void testServiceJoueurDoublonTest() throws JoueurDejaExistantException, DateFormatIncorrecteException, ParametreManquantException, LangueNonRéférencéeException, JoueurNonExistantException {
      //   serviceJoueur = new ServiceJoueurDoublonMock();
                assertThrows(JoueurDejaExistantException.class,
                ()->{
                    JoueurDTO joueur1 = serviceJoueur.ajouterJoueur("Joueur1", "Joueur1", 1990, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});
                });
    }
    @Test
    public void testServiceJoueurAjoutTest() throws DateFormatIncorrecteException, JoueurDejaExistantException, ParametreManquantException, LangueNonRéférencéeException, JoueurNonExistantException {
       //  serviceJoueur = new ServiceJoueurSimpleMockOk();

        JoueurDTO joueur = serviceJoueur.ajouterJoueur("John Doe", "john123", 1990, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});

        assertNotNull(joueur);
    }
    @Test
    public void testServiceJoueurDateFormatTest() throws DateFormatIncorrecteException, JoueurDejaExistantException, ParametreManquantException, LangueNonRéférencéeException, JoueurNonExistantException {
       //  serviceJoueur = new ServiceJoueurDateFormatMock();

        assertThrows(DateFormatIncorrecteException.class,
                ()->{
                    JoueurDTO joueur = serviceJoueur.ajouterJoueur("John Doe", "john123", 30000, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});
                });
    }
    @Test
    public void testServiceJoueurParamVide() throws ParametreManquantException {
        // serviceJoueur = new ServiceJoueurParamVideMock();

        assertThrows(ParametreManquantException.class,
                ()->{
                    JoueurDTO joueur = serviceJoueur.ajouterJoueur("", "john123", 30000, LanguesEnum.ANGLAIS, new String[]{"football", "movies"});
                });
    }
}
