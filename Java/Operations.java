
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
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
        // %.4f veut dire nombre flottant avec 3 chiffres apr�s la virgule.
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
        
    	
    	/*
    	
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
    			System.out.println("Ne pas entrer de caractaires");
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
		
		*/
    	
    	
    	
    	nb1 = 15;
		nb2 = 10;
		System.out.println("Le premier nombre est " + nb1 + "et le deuxième nombre est " + nb2);
		int tabDeuxNombres [] =  new int[2];
		tabDeuxNombres[0]=nb1;
		tabDeuxNombres[1]=nb2;
		Calcul calc4 = new Calcul(tabDeuxNombres);
		//int tabDeuxNombresBis [] = new int[2];
		int tabDeuxNombresBis [] = calc4.getInversionDeuxNombres().clone();
    	tabDeuxNombres[0]=tabDeuxNombresBis[0];
    	tabDeuxNombres[1]=tabDeuxNombresBis[1];
    	nb1 = tabDeuxNombresBis[0];
    	nb2 = tabDeuxNombresBis[1];
    	System.out.println("En inversant, le premier nombre est " + nb1 + " et le deuxième nombre est " + nb2);
   
    	
    	
    	
    	double montantVersement = 1526812; 
    	double tauxPlacement = 0.5;
    	//int dureePlacementMois = 16;
    	int dureePlacementMois;
    	LocalDate dateDeb = LocalDate.now(); 
    	LocalDate dateFin = LocalDate.of(2021, Month.SEPTEMBER, 7); 
    	//LocalDate prochainAnniversaire = anniversaire.withYear(aujourdhui.getYear()); 
    	// Si l'anniversaire a déjà eu lieu cette année, on rajoute 1 an à la date. 
    	//if (prochainAnniversaire.isBefore(aujourdhui) || prochainAnniversaire.isEqual(aujourdhui)) { 
    	   // prochainAnniversaire = prochainAnniversaire.plusYears(1); 
    	//} 
    	Period periode = Period.between(dateDeb, dateFin); // Période entre les deux indicateurs temporels. 
    	//long nbJours = ChronoUnit.DAYS.between(dateDeb, dateFin); // Nombre exact de jours entre les deux indicateurs temporels. 
    	
    	System.out.println("La fin du placement sera dans " + periode.getYears() + " an(s), "
    						+ periode.getMonths() + " mois, "
    						+ periode.getDays() + " jours");
    	
    	dureePlacementMois = periode.getMonths() + periode.getYears() *12;
    	
    	
    	double interetSimple;
    	interetSimple = montantVersement*(1+tauxPlacement)*(dureePlacementMois/12);
    	System.out.println(dureePlacementMois + " " + interetSimple);
    	
        
    	
    	   	
    	//indique si le chifffre Entree est un nombre premier
    	
    	//entrer un nombre différent de 0 et 1 et 2
    	float nbEntree=26;
    	int nbMaxPremierListe = (int) Math.sqrt(nbEntree);
    	//liste des nombres premiers jusqu'à racine de nbEntree
    	
    	// on teste si N est divisible par 2, puis on teste les diviseurs impairs par ordre
    	// croissant tant que ceux-ci sont inférieur à √N
    	float resultatDivision=0;
    	String resultatDivisionStr;
    
    	boolean estNbPremier = false;
    	//boolean estDivisibleParDeux = true;
    	//resultatDivision = nbEntree/tabNombreIndivisible[i];
		DecimalFormat df2 = new DecimalFormat("#.##");
		
    	//int i=1;
    	int nbImpair=1;
    	while(nbImpair<=nbMaxPremierListe){
    		
    		if(nbImpair<3){
    				resultatDivision = nbEntree/2;
    				if(nbEntree==2){
						estNbPremier = true;
						break;
					}
    				
    		}
    		
    			
    		
    		else{
				resultatDivision = nbEntree/nbImpair;
    		}
    		
    		
			resultatDivisionStr = String.valueOf(df2.format(resultatDivision));
			int positionPoint = resultatDivisionStr.indexOf(".");
			int positionVirgule = resultatDivisionStr.indexOf(",");
			int positionPointOuVirgule;
			if ( positionPoint != -1 || positionVirgule != -1){
				if ( positionPoint != -1){
					positionPointOuVirgule = positionPoint + 1 ;
				}
				else {
					positionPointOuVirgule = positionVirgule + 1;
				}
				int finChaine = resultatDivisionStr.length();
				String resultatApresVirguleStr = resultatDivisionStr.substring(positionPointOuVirgule, finChaine); 
				int resultatApresVirguleInt = Integer.parseInt(resultatApresVirguleStr);
			
				if (resultatApresVirguleInt > 0){
					if(nbImpair>=3){
						estNbPremier = true;
						break;
					}
					
					
					else{
						//if(nbImpair<3)
						//estDivisibleParDeux = false;
						if (nbEntree<=7){
							if(nbEntree==1 || nbEntree==2){
								estNbPremier = false;
								break;
							}
							
							else {
								estNbPremier = true;
								break;
							}
					
						}
						
					}
					
					
				}
				else{
					if(nbImpair<3){
						estNbPremier = true;
						break;
					}
				}
			}
			else{
				estNbPremier = false;
				break;
			}
			//i = i +2;
			nbImpair = nbImpair + 2;
    	}


	
    	
    
    	int nbEntreeInt = (int) nbEntree;
    	if (estNbPremier == true){
    		System.out.println(nbEntreeInt + " est un nombre premier");	
    	}
    	else{
    		System.out.println(nbEntreeInt + " n'est pas un nombre premier");	
    	}
    	
    }
}