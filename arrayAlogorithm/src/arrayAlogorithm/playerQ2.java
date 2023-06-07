package arrayAlogorithm;

//Get below Main compile and run correctly by writing Player class 
//public class Main {
//public static void main(String [] args)
//{
////Every player has name, total_wickets and role attributes
//Player ashwin = new Player("Ashwin", 455, "Bowler");
//Player shammi = new Player("Shammi", 344, "Bowler");
////If below line un-commented, it should be compile time error 
////Player p3 = new Player();
//if ( ashwin.getTotalWickets() > shammi.getTotalWickets() )
//System.out.println(ashwin);
//else
//System.out.println(virat);
//}
//}

public class playerQ2 {
	String name,role;
	int totalWicket;
	

	
	public playerQ2(String name,int totalWicket,String role) {
		this.name=name;
		this.totalWicket=totalWicket;
		this.role=role;
	}
	
	public int getTotalWickets() {
		 return totalWicket;
		
	 }
	
	
	public String toString() {
		
		return name;
	}
	
	
	public static void main(String [] args){
	//Every player has name, total_wickets and role attributes
	playerQ2 ashwin = new playerQ2("Ashwin", 455, "Bowler");
	playerQ2 shammi = new playerQ2("Shammi", 344, "Bowler");
	//If below line un-commented, it should be compile time error ---- Because default Constructor is not Declared
	//Player p3 = new Player();    
	if ( ashwin.getTotalWickets() > shammi.getTotalWickets() )
	System.out.println(ashwin);
	else
	System.out.println(shammi);
	}
	}


