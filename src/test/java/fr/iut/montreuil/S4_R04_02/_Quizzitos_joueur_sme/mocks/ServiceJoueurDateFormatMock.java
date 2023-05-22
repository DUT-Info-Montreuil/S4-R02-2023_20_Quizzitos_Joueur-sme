package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.DateFormatIncorrecteException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;

public class ServiceJoueurDateFormatMock implements IserviceJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue, String centreDInteretListe) throws DateFormatIncorrecteException {

        if ( anneeDeNaissance > 1924 && anneeDeNaissance < 2020 )

            return new JoueurDTO(nom,pseudo,anneeDeNaissance,langue,centreDInteretListe);

        else
            throw new DateFormatIncorrecteException("Levé d 'exception Date incorrecte depuis le Mock");
    }


    @Override
    public ArrayList<JoueurDTO> listerJoueur() {
        return null;
    }

    @Override
    public boolean supprimerJoueur(String pseudo) {
        return false;
    }
}