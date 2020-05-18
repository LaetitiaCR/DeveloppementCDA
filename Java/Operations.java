
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
    	//calcul l'aire d'un secteur de disque après avoir entrer son rayn et son degré
    	 
    	rayon =5;
    	//degré du disque
    	
    	//int delta = 30;
    	boolean erreurDelta = false;
    	boolean estUnCaractere = false;
    	Scanner scan = new Scanner( System.in );
    	
		while(erreurDelta==false){
    		
    		System.out.println("Entrer delta un entier en degré : ");
    	
    		String sDelta = scan.next();
    		
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
		
		*/
    	
    	
    	
    	//inversion de deux nombres
    	
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
   
    	
    	
    	
    	//placement montant des intérêts simples
    	
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
    	
        
    	
    	
    	
    	//nombres premier à revoir
    	   	
    	//indique si le chifffre Entree est un nombre premier
    	
    	/*
    	//entrer un nombre différent de 0 et 1 et 2
    	float nbEntree=25;
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
    	boolean sortir = false;
    	while(nbImpair<=nbMaxPremierListe && sortir == false){
    		
    		if(nbImpair<3){
    				resultatDivision = nbEntree/2;
    				if(nbEntree==2){
						estNbPremier = true;
						//sortir = true;
						break;
    				}				
    		}
    		else{
				resultatDivision = nbEntree/nbImpair;
    		}
    		
    		if(sortir == false){
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
							//sortir = true;
						}
						else{
							//if(nbImpair<3)
							//estDivisibleParDeux = false;
							if (nbEntree<=7){
								if(nbEntree==1 || nbEntree==2){
									estNbPremier = false;
									sortir = true;
									break;
								}		
								else {
									estNbPremier = true;
									sortir=true;
									break;
								}
							}
						}
					}
					else{
						if(nbImpair<3){
							estNbPremier = true;
							sortir = true;
							break;
						}
					}
				}
				else{
					estNbPremier = false;
					sortir = true;
					break;
				}
				//i = i +2;
				if(sortir==false){
					nbImpair = nbImpair + 2;
				}
	    	}
    	}  	
	    
    	int nbEntreeInt = (int) nbEntree;
    	if (estNbPremier == true){
    		System.out.println(nbEntreeInt + " est un nombre premier");	
    	}
    	else{
    		System.out.println(nbEntreeInt + " n'est pas un nombre premier");	
    	}
 
    	*/
    	
    	
    	
    	
    	
    	
    	
    	
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
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
 
   	
    	//entrer une année et dire s'il elle est bissextile
    	
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
        
        GregorianCalendar calendarMarsDebut = new GregorianCalendar();
    	
        calendarMarsDebut.set(Calendar.YEAR, annee);
        calendarMarsDebut.set(Calendar.MONTH, moisMars-1);
        calendarMarsDebut.set(Calendar.DAY_OF_MONTH, jourDebutMars);
        
        //on enlève 1 jours au premier mars
        calendarMarsDebut.add(Calendar.DATE, -1);
        
        int dernierJourFevrier = calendarMarsDebut.get(Calendar.DAY_OF_MONTH);
        
        System.out.println(dernierJourFevrier);
        //si fevrier est sur 29 jours alors bissextile
        if(dernierJourFevrier==29){
        	System.out.println("L'année " + annee + " est une année bissextile");
        }
        else if(dernierJourFevrier==28){
        	System.out.println("L'année " + annee + " n'est pas une année bissextile");
        }
       
        
        
        
        
        
        
        
        
        
        //jeu ordinateur et un joueur avec 0, 1 et 2
       
        int min = 0;
        int max = 2;
        boolean estNbNegatif=false;
        String nbEntrerStr;
        int nbEntrerInt;
        Scanner scan = new Scanner( System.in );
        int scoreOrdinateur =0;
        int scoreJoueur = 0;
       // int nbQuitter =0;
        while (scoreJoueur <10 && scoreOrdinateur <10 && estNbNegatif==false){
        	System.out.println("Entrer un nombre 0, 1 ou 2, Entrer un nombre négatif pour sortir : ");
        	nbEntrerStr = scan.next();
        	nbEntrerInt = Integer.parseInt(nbEntrerStr);
        	if(nbEntrerInt == 0 || nbEntrerInt == 1 || nbEntrerInt == 2){	
        		int nbAleatoire = min + (int)(Math.random() * ((max - min) + 1));
        		System.out.println("Le nombre tiré par l'ordiateur est : " + nbAleatoire);
        		if((nbAleatoire-nbEntrerInt)==2){
        			scoreOrdinateur = scoreOrdinateur +2;
        		}
        		else if((nbEntrerInt - nbAleatoire)==2){
        			scoreJoueur = scoreJoueur + 2;
        		}
        		if((nbAleatoire-nbEntrerInt)==1){
        			scoreOrdinateur = scoreOrdinateur +1;
        		}
        		else if((nbEntrerInt - nbAleatoire)==1){
        			scoreJoueur = scoreJoueur + 1;
        		}
        	}
        	else if(nbEntrerInt < 0){
        		estNbNegatif = true;	//on quitte la partie
        	}
        	else{
        		System.out.println("Erreur");
        	}
        	
        	System.out.println("Les scores sont, pour l'ordinateur : " + scoreOrdinateur + " et pour le joueur : " + scoreJoueur);
        }
        
        if (scoreOrdinateur>scoreJoueur){
        	System.out.println("L'ordinateur a gagné et le joueur est perdant");
        }
        else if (scoreOrdinateur<scoreJoueur){
        	System.out.println("Le joueur a gagné et l'ordinateur est perdant");
        }
        else{
        	System.out.println("La partie n'a pas été terminée...");
        }
        
    
        
        
        
        
        //Jeu du pendu
        
        String mot = "";
        boolean aQuitter=false;
        while(mot.length()<5 && aQuitter==false){
        	System.out.println("Entrez un mot avec plus de 5 lettres, Quit pour quitter : ");
        	mot = scan.next();
        	//mot = mot.trim();
        	if(mot.equals("Quit")){
        		aQuitter = true;
        	}
        }
        
        if(aQuitter!=true){
        
	        String premiereLettre;
	        String derniereLettre;
	        String lettre;
	        String replacerPremiereLettre = "_";
	        String replacerDerniereLettre= "_";
	        boolean estGagner=false;     
        
        	premiereLettre = mot.substring(0,1);
        	derniereLettre = mot.substring(mot.length()-1, mot.length());
        	
        	while(estGagner == false && aQuitter == false){      		
    			System.out.println(replacerPremiereLettre + mot.substring(1, mot.length()-1) + replacerDerniereLettre);
    		
        		System.out.println("Entrez une lettre, Quit pour quitter : ");
        		lettre = scan.next();
        		
        		if(lettre.equals(premiereLettre)){
        			replacerPremiereLettre = lettre;
        		}
        		if(lettre.equals(derniereLettre)){
        			replacerDerniereLettre = lettre;
        		}
        		if(lettre.equals("Quit")){
        			aQuitter = true;
        		}
        		
        		if (replacerPremiereLettre!="_" && replacerDerniereLettre!="_" ){
        			System.out.println("Le mot est trouvé, il s'agit bien de : " + mot);
        			estGagner =true;
        		}
	        }        	
        }
        
        
        
       
        scan.close();
    }
}