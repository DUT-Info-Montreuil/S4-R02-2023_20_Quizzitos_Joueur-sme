package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.impl.mock;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.*;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.*;


public class ServiceJoueurSimpleMock implements IserviceJoueur {

	@Override
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList)
			throws JoueurDejaExistantException {
		String[] s = {"anime", "voiture", "voyage"};
		return new JoueurDTO("joueur", "kikou", 2002, LanguesEnum.FRANCAIS, s);
	}
	

}
