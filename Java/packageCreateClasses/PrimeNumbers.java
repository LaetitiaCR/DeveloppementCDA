package packageCreateClasses;

import java.text.DecimalFormat;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		/*
		Les nombres entiers qui se terminent par 0, 2, 4, 6 ou 8 sont divisibles par 2.
		Les nombres entiers qui se terminent par 0 ou 5 sont divisibles par 5.
		Les nombres entiers dont la somme des chiffres est divisible par 3 sont eux-mêmes
		divisibles par 3. 
		
		
		Un nombre premier est un entier naturel qui a exactement deux diviseurs : 1 et lui même
		*/
		
		int nbInt = 47;
		String nbStr = String.valueOf(nbInt);
		
		String lastNumberStr = nbStr.substring(nbStr.length()-1, nbStr.length()); 
		
		if (lastNumberStr.equals("0") || lastNumberStr.equals("2") || lastNumberStr.equals("4") || lastNumberStr.equals("5") || lastNumberStr.equals("6") || lastNumberStr.equals("8") ){
			System.out.println(nbInt + " n'est pas un nombre premier");
		}
		else{
			String oneNumberStr = "";
			int oneNumberInt = 0;
			for(int i =0; i< nbStr.length(); i++){
				oneNumberStr = nbStr.substring(i, i+1);
				oneNumberInt = oneNumberInt + Integer.parseInt(oneNumberStr);
			}
			
			float oneNumberFloat = oneNumberInt;	
			float resultatDivision = oneNumberFloat/3;
			String resultatDivisionStr = String.valueOf(resultatDivision);
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
			
				if (resultatApresVirguleInt > 0 || oneNumberInt == 3){
					System.out.println(nbInt + " est un nombre premier");
				}
				else{
					if (oneNumberInt != 3){
						System.out.println(nbInt + " n'est pas un nombre premier");
					}
				}
			}
		}	
		
	}

}
