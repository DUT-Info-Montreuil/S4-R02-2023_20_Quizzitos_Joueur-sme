package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.DateFormatIncorrecteException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurDejaExistantException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.JoueurNonExistantException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.LangueNonRéférencéeException;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.ParametreManquantException;

public interface IserviceJoueur {
	
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, JoueurNonExistantException, LangueNonRéférencéeException;
}
