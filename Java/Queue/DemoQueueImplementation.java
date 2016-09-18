import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class DemoQueueImplementation {
		public int queue1(){
			Queue tokenNumber = new LinkedList();
			System.out.println("Enter the Number of tokens to be assign");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 0; i < n; i++){
				System.out.println("Please enter the value of token");
				tokenNumber.add(sc.nextInt());
			}
			int sizeOfQueue = tokenNumber.size();
			int FirstElementofQueue = (Integer) tokenNumber.peek();
			System.out.println("Please enter your token number");
			int number2 = sc.nextInt();
			int timeToWait = (number2 - FirstElementofQueue)*5;
			System.out.println("YOur waiting time is"+timeToWait+"mins");
			return timeToWait;
		}
}