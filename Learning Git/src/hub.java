import java.util.Scanner;

public class hub {
	static String name;
	static Scanner sc = new Scanner(System.in);
	static String[] fortunes= {"Your future will have many ups and downs.",
			"You are doomed to die tomorrow.", 
			"Look out for a man with brown hair and a mustache tomorrow...", 
			"Your future is very muddled I need to look further.."
			,"Seize the day you do not have much time left." };
	
	
	public static void name(){
		System.out.println("Enter your name please:");
		name = sc.nextLine();
		int random = (int) (Math.random()*5);
		if (name.length() > 5){
			System.out.println("Your future will have many ups and downs");
		}else if (name.length() <= 5){
			System.out.println(fortunes[random]);
		}
	}

	public static void main(String args[]){
		System.out.println("I will tell your fortune.");
		for(int i = 0; i<4; i++){
			name();
		}
	}
}