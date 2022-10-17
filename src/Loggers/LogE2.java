package Loggers;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogE2 {

	private final static Logger login = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		login.setLevel(Level.ALL);
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.ALL);
		login.addHandler(ch);
		login.config("====>performing operarions on numbers");
		Scanner sc=new Scanner(System.in);
		try {
			login.info("Enter the 1st integer");
			int s1=sc.nextInt();
			login.info("Enter the 2nd integer");
			int s2=sc.nextInt();
			login.info("Enter the 3rd integer");
			int s3=sc.nextInt();
			int s=(s1*s2)/s3;
			login.log(Level.INFO,"the result is "+s);
			
		}
		catch(InputMismatchException e) {
			login.warning("====Not an Integer=====");
		}
		catch(ArithmeticException e) {
			login.log(Level.WARNING,"===Divide by zero=== "+e);
		}
		login.info("All logging info is noted");
		sc.close();
		
	}

}
