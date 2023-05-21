package src.main.java.fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles;

public interface IserviceJoueur {
	
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) throws JoueurDejaExistantException;
}
