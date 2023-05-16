package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;

public interface IserviceJoueur {
	
	JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList);
	
}
