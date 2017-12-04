
public class Main {
	
	public static void main(String[] args) {
		
		TrippleDice x = new TrippleDice();
		
		x.Roll();
		
		System.out.println(x);
		//calls toString method from tripple dice
		//prints average of 3 dice rolls
		Dice x2 = new Dice(3);
		x2.Roll();
		System.out.println(x2);
		//call toString from root Object
		//not the tripple dice class 
		//print memory location 

}
}