package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.*;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;

public class JoueurSI implements IserviceJoueur {

	@Override
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList)
			throws JoueurDejaExistantException {
		// TODO Auto-generated method stub
		return null;
	}

}
