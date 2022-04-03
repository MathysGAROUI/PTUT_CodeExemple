package src.fr.pieces;

import src.fr.divers.Radio;

import java.util.ArrayList;
import java.util.List;

public class Voiture extends Vehicule implements Motorise {
	
    private List<Roue> mesRoues = new ArrayList<>();
    private Moteur monMoteur;
    
    public Voiture() {
    	//Constucteur
    }
    
	public void faireLePlein() {
		// m�thode de l'interface motorise
	}
	
	@Override
	public void rouler(int vitesse) {
		// m�thode de la classe src.fr.pieces.Vehicule
	}
	
	public void remplacerMoteur(Moteur nouveauMoteur) {
		this.monMoteur = nouveauMoteur;
	}
	
	public void ecouterMusique(Radio radio) {
		radio.lancerTitre();
	}

}