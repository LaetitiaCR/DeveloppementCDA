public class Calcul{
	
	float moyenneMDN;
	double aireSphere;
	double volumeSphere;
	double aireSecteurDisque;
	int nb1;
	int nb2;
	int tabDeuxNombres[] = new int[2];
	
	public Calcul(int x, int y){
		setMoyenneDeuxNombres(x, y);	
		setAireSecteurDisque(x,y);
		
	}
	public Calcul(int [] tabDeuxNombres){
		setInversionDeuxNombres(tabDeuxNombres);
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
	public void setInversionDeuxNombres(int [] tabDeuxNombres){
			this.nb1 = tabDeuxNombres[0];
			this.nb2= tabDeuxNombres[1];
			this.tabDeuxNombres[0] = nb2;
			this.tabDeuxNombres[1] = nb1;
	}

	public int [] getInversionDeuxNombres(){
			return tabDeuxNombres;
	}
}