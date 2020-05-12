public class Calcul{
	
	float moyenneMDN;
	double aireSphere;
	double volumeSphere;
	double aireSecteurDisque;
	
	public Calcul(int x, int y){
		setMoyenneDeuxNombres(x, y);	
		setAireSecteurDisque(x,y);
	}
	public Calcul(int rayon){
		setAireSphere(rayon);
		setVolumeSphere(rayon);
	}
	public void setMoyenneDeuxNombres(int x, int y){
        this.moyenneMDN = (x+y) /2;
    }
    public float getMoyenneDeuxNombres(){  
        return moyenneMDN;
    }
    public void setAireSphere(int rayon){
		this.aireSphere = 4 * Math.PI * (rayon*rayon);
    }
    public double getAireSphere(){
    	return aireSphere;
    }
    public void setVolumeSphere(int rayon){
		this.volumeSphere = (4 * Math.PI * (rayon*rayon*rayon))/3;
    }
    public double getVolumeSphere(){
    	return volumeSphere;
    }
    public void setAireSecteurDisque(int rayon, int delta){
		this.aireSecteurDisque = (Math.PI * delta * (rayon*rayon))/360;
    }
    public double getAireSecteurDisque(){
    	return aireSecteurDisque;
    }
    
}