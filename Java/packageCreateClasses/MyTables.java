package packageCreateClasses;

public class MyTables {
	
	int tableInt [];
	String tableStr [];
	
	
	
	
	public MyTables(){
		
	}
	public MyTables(int [] tableInt, String [] tableStr){
		//this.tableInt = new int[tableInt.length];
		//this.tableStr = new String[tableStr.length];
		setTableIntAndStr(tableInt, tableStr);
	}
	public MyTables(int [] tableInt){
		this.tableInt = new int[tableInt.length];
		setTableInt(tableInt);
	}
	public MyTables(String [] tableStr){
		this.tableStr = new String[tableStr.length];
		setTableStr(tableStr);
	}
	
	
	public void setTableIntAndStr(int[] tableInt, String[] tableStr){	
		this.tableInt = tableInt;
		this.tableStr = tableStr;
	}
	
	
	public void setTableInt(int[] tableInt){
		this.tableInt = tableInt;
	}
	public int[] getTableInt(){
		return tableInt;
	}
	
	public void setTableStr(String[] myTableStr){
		this.tableStr = myTableStr;
	}
	public String[] getTableStr(){
		return tableStr;
	}
	
	public void displayTableIntAndStr(){
		
		for(int i=0; i < tableInt.length; i++){
			System.out.println(tableInt[i]);
		}
		
		for(int i=0; i < this.tableStr.length; i++){
			System.out.println(this.tableStr[i]);
		}
	}
	
	public void displayTableInt(){
		for(int i=0; i<tableInt.length; i++){
			System.out.println(tableInt[i]);
		}
	}
	public void displayTableStr(){
		for(int i=0; i<tableStr.length; i++){
			System.out.println(tableStr[i]);
		}
	}
	
	
	public void searchNumber(int nb){
	
		int num = 0;
		String positionNb = "";
		for(int i=0; i<tableInt.length; i++){
			if(tableInt[i]==nb){
				positionNb = positionNb + " " + i;
				num = num +1;
			}
		}
		
		System.out.println("Le nombre " + nb + " a été trouvé " + num + " fois");
		System.out.println("A la position : " + positionNb);
	}
	
	public void searchWord(String word){
		
		int num = 0;
		String positionStr = "";
		
		for(int i=0; i<tableStr.length; i++){
			if(tableStr[i]==word){
				positionStr = positionStr + " " + i;
				num = num +1;
			}
		}
	
		System.out.println("Le mot " + word + " a été trouvé " + num + " fois");
		System.out.println("A la position : " + positionStr);
	}
}
