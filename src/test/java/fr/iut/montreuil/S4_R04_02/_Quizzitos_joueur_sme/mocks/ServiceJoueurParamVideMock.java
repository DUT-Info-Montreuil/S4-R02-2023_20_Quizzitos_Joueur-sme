package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.*;

public class ServiceJoueurParamVideMock implements IserviceJoueur {
    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, JoueurNonExistantException, LangueNonRéférencéeException {
       if (nom.isEmpty()) {
           throw new ParametreManquantException("Parametre du pseudo vide");
       } else {
           return new JoueurDTO(nom,pseudo,anneeNaiss,langue,interetList);
       }
    }
}
