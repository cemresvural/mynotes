import java.util.Date;
import java.util.Scanner;



public class Whiledng {
public static void main(String[] args) throws  InterruptedException {
	/*int i=0;
	while(i<10) {
		System.out.println(i);
		i++;
	}*/
	/*while(true) {
		System.out.println(new Date());
		Thread.sleep(1000);
	}*/
	
	/*Scanner scanner=new Scanner(System.in);
	while(true) {
		//String text=scanner.nextLine();
		//System.out.println(text.toUpperCase());
	
		int i=scanner.nextInt();
		System.out.println(Math.pow(i,2));
		
		
	}*/
	
	//do while
	/*int i=0;
	do {
		System.out.println(i++);
	}while(i<10);
	*/
	/*String password=null;
	Scanner scanner =new Scanner(System.in);
	
	do {
		System.out.print("Password: ");
		password=scanner.nextLine();
	}while(!password.equals("456"));
	System.out.println("Welcome");*/
	
	
	Scanner scanner=new Scanner(System.in); 
	/*int starCount=scanner.nextInt();
    int i=1;
    while(i<=starCount) {
    	int j=0;
    	while(j<i) {
    		System.out.print("*");
    		j++;
    	}
    	System.out.println();
    	i++;
    }*/
	/*long total =0;
	while(true) {
		int x=scanner.nextInt();
		if(x==0) {
			break;
		}
		total += x;
	}
	System.out.println(total);
    
	*/
	
	//1-100 even numbers
	/*int x=0;
	int y=100;
	while(x<y) {
		if(x % 2==0) {
			System.out.println(x);
		}
		x++;
	}*/
	//
	/*int x=0;
	int max=Integer.MAX_VALUE;
	int min=Integer.MIN_VALUE;
	while(x<10) {
		int input=scanner.nextInt();
		if(input<min) min=input;
		if(input>max) max=input;
		x++;
	}
	System.out.println("Min:"+ min);
	System.out.println("Max:"+ max);
*/
	//
	/*float average=0.0f;
	int count =0;
	while(true) {
		int number=scanner.nextInt();
		if(number== 0) break;
		count++;
		average += number;
	}
	System.out.println(average/count);
	*/
	//
	int positiveCount=0;
	int negativeCount=0;
	
	while(true) {
		int x = scanner.nextInt();
		if(x==0)
			break;
		if(x>0) {
			positiveCount++;
		}else if(x<0) {
			negativeCount++;
		}else {
			break;
		}
	}
	System.out.println("Positive: " + positiveCount);
	System.out.println("Negative: " + negativeCount);
	
	
	
	
	
	

	
	
}
}
