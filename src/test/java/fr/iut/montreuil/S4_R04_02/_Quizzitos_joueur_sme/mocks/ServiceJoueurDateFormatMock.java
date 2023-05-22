package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.*;

public class ServiceJoueurDateFormatMock implements IserviceJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, JoueurNonExistantException, LangueNonRéférencéeException {
        if ( anneeNaiss > 1924 && anneeNaiss < 2020 ) {

                return new JoueurDTO(nom, pseudo, anneeNaiss, langue, interetList);

        } else {
            throw new DateFormatIncorrecteException("Levé d 'exception Date incorrecte depuis le Mock");
        }
    }
}