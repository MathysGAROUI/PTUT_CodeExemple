package src.fr.pieces;

public  abstract class Moteur{

	//Exemple de commentaire

	/* Autre exemple
	sur deux lignes
	*/

	/********
	 * Encore un exemple
	 * sur plusieurs lignes
	 */

    private static int identifiantUniqueMoteur;//Commentaire accolé à une ligne

	public int getIdentifiantUniqueMoteur() {
		return identifiantUniqueMoteur++;
	}
	
}