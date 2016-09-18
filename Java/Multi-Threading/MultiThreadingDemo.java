import java.util.Scanner;
public class MultiThreadingDemo extends Thread{
public void run(){
	System.out.println("You are successfully connected to the server thread");
}
public String user(){	
	System.out.println("Enter username");
	Scanner sc= new Scanner(System.in);
	String name = sc.next();
	if(name.equals("Mansi")){
	System.out.println("Hello   "+name+"  browser thread is going to start  \n");
	System.out.println("******************************************************");
	(new Thread(new MultiThreadingDemo())).start();}
	else {
		
		System.out.println("You did not enter the correct username");
	}
	return name;
}
}