package packageCallClasses;

import packageCreateClasses.MyTables;

public class MyTablesCall {

	public static void main(String[] args) {
		int [] tabInt = {};
		String [] tabStr = {};
		
		
		
		tabInt = new int [5];
		tabInt[0]=1;
		tabInt[1]=2;
		tabInt[2]=3;
		tabInt[3]=4;
		tabInt[4]=5;
		
		
		tabStr = new String [4];
		tabStr[0]="A";
		tabStr[1]="B";
		tabStr[2]="D";
		tabStr[3]="E";
		
		
		//tabInt =  {1, 2, 3, 4, 5, 6};
		//String [] tabStr = {"A", "B", "D", "E"};
		
		
		
		
		if (tabInt.equals(null) && tabStr.equals(null)){	
			System.out.println("Aucun tableau n'a été indiqué donc il n' y a pas de tableau à afficher."); 
			
		}
		else if(tabInt.length!=0 && tabStr.length!=0){
			MyTables myTab = new MyTables(tabInt, tabStr);
			myTab.displayTableIntAndStr();
		}
		else if(tabInt.length!=0 && tabStr.length==0){
			MyTables myTab = new MyTables(tabInt);
			myTab.displayTableInt();
			
			
		}
		else if(tabStr.length!=0 && tabStr.length==0){
			MyTables myTab = new MyTables(tabStr);
			myTab.displayTableStr();
		}
		else{
			
		}
		
		
		int nb = 4;
		String word = "D";
			
		//affiche position mot ou lettre d'un tableau (à partir de zero)
		if(tabInt.length!=0 && tabStr.length!=0){
			if (nb != 999){
				MyTables myTab = new MyTables(tabInt);
				myTab.searchNumber(nb);
				
			}
			if(word != "AZ"){
				MyTables myTab = new MyTables(tabStr);	
				myTab.searchWord(word);
				
			}
		}
		
		if(tabInt.length!=0 && tabStr.length==0){
			if (nb != 999){
				MyTables myTab = new MyTables(tabInt);
				myTab.searchNumber(nb);
				
			}
		}
		if(tabStr.length!=0 && tabInt.length==0){
			if(word != "AZ"){
				MyTables myTab = new MyTables(tabStr);	
				myTab.searchWord(word);
				
			}	
		}
		if(tabStr.length==0 && tabStr.length==0){
			if(nb == 999 && word == "AZ"){
				System.out.println("Ni nombre, ni mot n'ont été indiqués.");
			}
		}
	}

	

}
