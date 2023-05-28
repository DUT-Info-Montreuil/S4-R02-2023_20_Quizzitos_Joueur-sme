package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.mocks;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.StatistiquePartie;


import java.util.ArrayList;

public class ServiceJoueurRecupStatsMock implements IserviceJoueur {
	ArrayList<StatistiquePartie> statsPartie = new ArrayList<StatistiquePartie>();
	
	@Override
    public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, JoueurNonExistantException, LangueNonRéférencéeException {
        return null;
    }
	
	@Override
	pubic StatistiquePartie insererStatsJoueur(String nom, int score, int nbQuestions, int temps) throws DonneeIncorrectException {
		StatistiquePartie stats = new StatistiquePartie(score, nbQuestions, temps);
		statsPartie.add(stats);
		return stats;
	}
	
	@Override
	public StatistiquePartie récupérerStatsPartie(String nom) throws AucuneStatsException, DonneeIncorrectException{
		return statsPartie;
	}
	
}
