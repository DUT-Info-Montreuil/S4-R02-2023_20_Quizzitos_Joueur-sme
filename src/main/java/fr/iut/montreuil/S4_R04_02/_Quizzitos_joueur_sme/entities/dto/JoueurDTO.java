package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.LanguesEnum;

public class JoueurDTO {
	
	private String nom;
	private String pseudo;
	private int anneeNaiss;
	private LanguesEnum langue;
	private String[] interetList;

	public JoueurDTO(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList) {
		this.nom = nom;
		this.pseudo = pseudo;
		this.anneeNaiss = anneeNaiss;
		this.langue = langue;
		this.interetList = interetList;
	}
}
