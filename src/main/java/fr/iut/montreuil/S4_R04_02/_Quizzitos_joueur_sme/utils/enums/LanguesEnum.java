package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums;

public enum LanguesEnum {
	
	FRANCAIS(1,"FR","Française"), ANGLAIS(2,"EN","Anglaise"), ALLEMAND(3,"DE","Allemande"), ESPANOLE(4,"ES","Espagnole"), ITALIEN(5,"IT","Italienne");

	private final int i;
	private final String code;
	private final String label;
	
	LanguesEnum(int i, String code, String label) {
		this.i = i;
		this.code = code;
		this.label = label;
	}
}
