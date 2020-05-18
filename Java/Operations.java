
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
import java.util.GregorianCalendar;
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
    	
    	Period periode = Period.between(dateDeb, dateFin); // Période entre les deux indicateurs temporels.  
    	
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
 
    	
    	//Trier une liste par ordre croissant
    	// sans doublons
    	int tabNombreEntree [] = {20, 1, 10, 15, 3 };
    	int tabNombreTrier [] = new int [tabNombreEntree.length];
    	int position1;
    	int position2;
    	int count=0;
    	String strTabNombreTrier = "";
    	for (int i=0; i < tabNombreEntree.length; i++) {
    		position1 = i;
    		for (int y=0; y<tabNombreEntree.length; y++){
	    		if (tabNombreEntree[position1]<tabNombreEntree[y]){
	    			count++;
	    		}
    		}
    		
    		if (count == 0){
    			position2 = tabNombreEntree.length-1;
    			tabNombreTrier[position2] = tabNombreEntree[position1];
    			
    		}
    		else if (count == tabNombreEntree.length-1){
    			position2 = 0;
    			tabNombreTrier[position2] = tabNombreEntree[position1];
    			
    		}
    		else{
    			position2 = tabNombreEntree.length - count -1 ;
    			tabNombreTrier[position2] = tabNombreEntree[position1];
    		}
    		
    		count=0;
    		
    	}
    	
    	for (int i=0; i < tabNombreTrier.length; i++) {
    		strTabNombreTrier = strTabNombreTrier + " "  + tabNombreTrier[i] ;
    	}
    	System.out.println("La liste entrée à été triée par ordre croissant" + strTabNombreTrier);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
    	int annee = 2024;
    	int moisFevrier = 2;
    	int jourDebutFevrier = 1;
    	
    	GregorianCalendar calendarFevrierDebut = new GregorianCalendar();
    	
    	//Calendar calendar = Calendar.getInstance();
    	//calendar.setTime(2018, 11, 01);
    	calendarFevrierDebut.set(Calendar.YEAR, annee);
    	//les mois comme à zéro
    	calendarFevrierDebut.set(Calendar.MONTH, moisFevrier-1);
    	calendarFevrierDebut.set(Calendar.DAY_OF_MONTH, jourDebutFevrier);
        int nomJourDebutFevrier = calendarFevrierDebut.get(Calendar.DAY_OF_WEEK);
        System.out.println(nomJourDebutFevrier);
        
        switch (nomJourDebutFevrier) {
		    case 1:
		    	System.out.println("dimanche");
				break;
				
			case 2:
				System.out.println("lundi");
				break;
				
			case 3:
				System.out.println(" mardi");
				break;
				
			case 4:
				System.out.println("mercredi");
				break;
			case 5:
				System.out.println("jeudi");
				break;
			case 6:
				System.out.println("vendredi");
				break;
			case 7:
				System.out.println("samedi");
				break;
			
			default:
				System.out.println("erreur");
				break;
        }
        
       
       
      
    	int moisMars = 3;
    	int jourDebutMars = 1;
        
        
    	//int jourFin = 29;	
        
        GregorianCalendar calendarMarsDebut = new GregorianCalendar();
    	
    	//Calendar calendar = Calendar.getInstance();
    	//calendar.setTime(2018, 11, 01);
        calendarMarsDebut.set(Calendar.YEAR, annee);
        calendarMarsDebut.set(Calendar.MONTH, moisMars-1);
        calendarMarsDebut.set(Calendar.DAY_OF_MONTH, jourDebutMars);
        
        //on enlève 1 jours à mars
        calendarMarsDebut.add(Calendar.DATE, -1);
        
        int dernierJourFevrier = calendarMarsDebut.get(Calendar.DAY_OF_MONTH);
        
        System.out.println(dernierJourFevrier);
        
        if(dernierJourFevrier==29){
        	System.out.println("L'année " + annee + " est une année bissextile");
        }
        else if(dernierJourFevrier==28){
        	System.out.println("L'année " + annee + " n'est pas une année bissextile");
        }
       
        
        
        
        
        
        //jeu ordinateur et un joueur
       
        int min = 0;
        int max = 2;
        String nbEntrerStr;
        int nbEntrerInt;
        Scanner maSaisie = new Scanner( System.in );
        int scoreOrdinateur =0;
        int scoreJoueur = 0;
        int nbQuitter =0;
        while (scoreJoueur <=10 || scoreOrdinateur <=10 || nbQuitter > 0){
        	System.out.println("Entrer un nombre 0, 1 ou 2, Entrer un nombre négatif pour sortir : ");
        	nbEntrerStr = maSaisie.next();
        	nbEntrerInt = Integer.parseInt(nbEntrerStr);
        	if(nbEntrerInt == 0 || nbEntrerInt == 1 || nbEntrerInt == 2){	
        		int nbAleatoire = min + (int)(Math.random() * ((max - min) + 1));
        		System.out.println("Le nombre tiré par l'ordiateur est : " + nbAleatoire);
        		if(nbAleatoire>nbEntrerInt){
        			scoreOrdinateur = scoreOrdinateur +1;
        		}
        		else if(nbAleatoire<nbEntrerInt){
        			scoreJoueur = scoreJoueur + 1;
        		}
        	}
        	else if(nbEntrerInt < 0){
        		break;	//on quitte la partie
        	}
        	else{
        		System.out.println("Erreur");
        	}
        	
        	System.out.println("Les scores sont, pour l'ordinateur : " + scoreOrdinateur + " et pour le joueur : " + scoreJoueur);
        }
       
        maSaisie.close();
        
    }
}