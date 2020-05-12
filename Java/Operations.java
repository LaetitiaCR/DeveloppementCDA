
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Operations{

    public static void main(String[] args){ 
    
    	int nb1 =2;
    	int nb2 = 1;
        Calcul calc1 = new Calcul(nb1, nb2);
        System.out.println(calc1.getMoyenneDeuxNombres());
        
       
        int rayon = 18;
        
        Calcul calc2 = new Calcul(rayon);
        // %.4f veut dire nombre flottant avec 3 chiffres après la virgule.
        System.out.printf("%.4f\n",calc2.getAireSphere()); 
        
    	
    	NumberFormat formatter = null;
        formatter=java.text.NumberFormat.getInstance(java.util.Locale.FRENCH); 
        //POUR AJOUTER LES SEPARATEUR ENTRE LES MILIERS
        formatter = new DecimalFormat("##,###.## ");
        System.out.println(formatter.format(calc2.getVolumeSphere()));
    	
        //ou autre façon
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.FRANCE);
    	dfs.setGroupingSeparator(' ');     
        DecimalFormat df = new DecimalFormat("#,###.00", dfs);
    	System.out.println(df.format(calc2.getVolumeSphere()));
        
    	
    	
    	
    	rayon =5;
    	//degré du disque
    	
    	//int delta = 30;
    	boolean erreurDelta = false;
    	boolean estUnCaractere = false;
    	Scanner myInput = new Scanner( System.in );
    	
		while(erreurDelta==false){
    		
    		System.out.println("Entrer delta un entier en degré : ");
    	
    		String sDelta = myInput.next();
    		
    		for (int i=0; i < sDelta.length(); i++){
    		
    			if (! Character.isDigit(sDelta.charAt(i))){
    			
    				estUnCaractere = true;
    			}
    		}
    		
    		if (estUnCaractere==true){
    			
    			estUnCaractere=false;
    			erreurDelta = false;
    			System.out.println("Ne pas entrer de caractères");
    		}
    		else{
    			
				int delta = Integer.parseInt(sDelta);
				
				if (delta > 360){
    				System.out.println("Entrer une valeur inférieur à 360");
    				erreurDelta = false;
    			}
    			else{
    				Calcul calc3 = new Calcul(rayon, delta);
    				System.out.println(calc3.getAireSecteurDisque());
    				erreurDelta=true;
    			}
    				
    					
    		}
    		
    		
    		
		    	
		 
		}
    		
    	
    	
    	myInput.close();
    	
    	
    }
}