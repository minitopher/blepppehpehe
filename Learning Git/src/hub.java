import java.util.Scanner;

public class hub {
	static String name;
	static Scanner sc = new Scanner(System.in);
	
	
	public static void name(){
		System.out.println("Enter your age name please:");
		name = sc.nextLine();
		if (name.length() > 5){
			System.out.println("Your future will have many ups and downs");
		}else{
			System.out.println("");
		}
	}

	public static void main(String args[]){
		System.out.println("I will tell your fortune.");
		name();
	}
}
