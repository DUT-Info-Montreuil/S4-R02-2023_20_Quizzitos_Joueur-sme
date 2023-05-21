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
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getAnneeNaiss() {
		return anneeNaiss;
	}

	public void setAnneeNaiss(int anneeNaiss) {
		this.anneeNaiss = anneeNaiss;
	}

	public LanguesEnum getLangue() {
		return langue;
	}

	public void setLangue(LanguesEnum langue) {
		this.langue = langue;
	}

	public String[] getInteretList() {
		return interetList;
	}

	public void setInteretList(String[] interetList) {
		this.interetList = interetList;
	}
	
}
