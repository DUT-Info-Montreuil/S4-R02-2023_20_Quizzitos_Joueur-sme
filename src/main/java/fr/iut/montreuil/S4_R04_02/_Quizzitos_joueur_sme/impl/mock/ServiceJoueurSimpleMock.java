package src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.impl.mock;

import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.JoueurDTO;
import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.JoueurDejaExistantExcepetion;
import src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.LanguesEnum;

public class ServiceJoueurSimpleMock implements IserviceJoueur {

	@Override
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList)
			throws JoueurDejaExistantExcpetion {
		return new JoueurDTO("joueur", "kikou", 2002, LanguesEnum.FRANCAIS, "anime, sport, voyage, info");
	}
	

}
