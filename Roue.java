public class Roue{
	
    private String type = "";
    private String marque = "";
    private boolean neige = false;
    private int nbrBoulons;
    private List<Boulons>  boulons = new ArrayList<>();

    public Roue(String marque, int numero){
        // Constructeur
    }

    public boolean isNeige(){        
        return neige;
    }
}