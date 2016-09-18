import java.util.Scanner;


public class ArrayDemo {
		public String[] studentArray(){
			
			System.out.println("Enter the number of Students");
			Scanner sc= new Scanner(System.in);
			int number = sc.nextInt();
			String[] studentName = new String[number];
			
			for(int i = 0; i<number ; i++){
				System.out.println("Enter Name of student");
				studentName[i] = sc.next();
			}
			return studentName;
		}
}