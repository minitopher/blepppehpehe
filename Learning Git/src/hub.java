import java.util.Scanner;
import java.util.Random;

public class hub {
	static String name;
	static Scanner sc = new Scanner(System.in);
	static String[] fortunes= {"Your future will have many ups and downs","You are doomed to die tomorrow", "", "" ,"" };
	
	
	public static void name(){
		System.out.println("Enter your age name please:");
		name = sc.nextLine();
		
		if (name.length() > 5){
			System.out.println("Your future will have many ups and downs");
		}else if (name.length() <= 5){
			System.out.println("You are doomed to die tomorrow");
		}
	}

	public static void main(String args[]){
		System.out.println("I will tell your fortune.");
		name();
	}
}
