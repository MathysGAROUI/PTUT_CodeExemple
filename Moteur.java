public  abstract class Moteur{
	
    private static int identifiantUniqueMoteur;

	public int getIdentifiantUniqueMoteur() {
		return identifiantUniqueMoteur++;
	}
	
}