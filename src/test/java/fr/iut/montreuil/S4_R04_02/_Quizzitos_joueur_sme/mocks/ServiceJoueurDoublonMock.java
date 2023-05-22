package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;

public class ServiceJoueurDoublonMock implements IserviceJoueur {

    private ArrayList<JoueurDTO> joueurList= new ArrayList<>();

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeDeNaissance, LanguesEnum langue,
                                   String centreDInteretListe) throws JoueurDejaExistantException {

        if (nom.equals("Joueur1")) return new JoueurDTO("Joueur1", "MemePseudo", 2003, LanguesEnum.FRANCAIS, "danse, guitare");

        else
            throw new JoueurDejaExistantException("Levé d 'exception de joueur en double depuis le Mock");
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
