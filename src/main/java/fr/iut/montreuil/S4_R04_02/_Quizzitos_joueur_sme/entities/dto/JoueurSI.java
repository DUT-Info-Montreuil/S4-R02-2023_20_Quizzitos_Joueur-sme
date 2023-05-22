package src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto;

import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.JoueurDTO;
import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.JoueurDejaExistantException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.LanguesEnum;

public class JoueurSI implements IserviceJoueur {

	@Override
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList)
			throws JoueurDejaExistantException {
		// TODO Auto-generated method stub
		return null;
	}

}
