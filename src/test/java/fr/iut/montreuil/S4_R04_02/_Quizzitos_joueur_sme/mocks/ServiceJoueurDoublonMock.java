package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import java.util.ArrayList;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.*;

public class ServiceJoueurDoublonMock implements IserviceJoueur {

    private ArrayList<JoueurDTO> joueurList= new ArrayList<>();

    @Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, JoueurNonExistantException, LangueNonRéférencéeException {
        {

        if (nom.equals("Joueur1")) return new JoueurDTO("Joueur1", "MemePseudo", 2003, LanguesEnum.FRANCAIS, new String[]{"danse, guitare"});

        else
            throw new JoueurDejaExistantException("Levé d 'exception de joueur en double depuis le Mock");
    }


}}
