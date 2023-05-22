package fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.impl;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.IserviceJoueur;

import java.util.ArrayList;
import java.util.List;

import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.modeles.*;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.exceptions.*;
import fr.iut.montreuil.S4_R04_02._Quizzitos_joueur_sme.utils.enums.*;

public abstract  class ServiceJoueurBean implements IserviceJoueur {

	private List<JoueurDTO> listeJoueurs;
	
	@Override
	public JoueurDTO ajouterJoueur(String nom, String pseudo, int anneeNaiss, LanguesEnum langue, String[] interetList)
			throws JoueurDejaExistantException, ParametreManquantException, DateFormatIncorrecteException, LangueNonRéférencéeException {
		JoueurDTO joueur;
        List<String> pseudoListe = listeJoueurs.stream().map(JoueurDTO::getPseudo).toList();
		if(nom.equals("") | nom.isEmpty()){
            throw new ParametreManquantException("nom manquant");
        }
        else if(pseudo.equals("") | pseudo.isEmpty()){
            throw new ParametreManquantException("pseudo manquant");
        }
		if(anneeNaiss<1930 || anneeNaiss>2023){
            throw new DateFormatIncorrecteException();
        }
		if(pseudoListe.contains(pseudo)) {
			throw new JoueurDejaExistantException();
		}
		if(langue.toString().isEmpty()) {
			throw new LangueNonRéférencéeException();
		}
		
		
		joueur = new JoueurDTO(nom, pseudo, anneeNaiss, langue, interetList);
		listeJoueurs.add(joueur);
		return joueur;
	}

}
