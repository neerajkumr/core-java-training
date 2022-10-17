package Loggers;

import java.nio.file.FileAlreadyExistsException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogE1 {
	
	private final static Logger logr=Logger.getLogger("LogExample");
	
	public static void main(String[] args) {
		/*
		 * SEVERE
		 * WARNING
		 * INFO
		 * CONFIG
		 * FINE 
		 * FINER
		 * FINEST
		 * BASED ON THE SET LEVEL WE GET THE INFO ON TO FILE OR CONSOLE BASED ON THE HANDLER
		 */
		LogManager.getLogManager().reset();//it will get rid of the root handler (i.e console)
		logr.setLevel(Level.ALL);//all levels are logged
		//console handler
		
		ConsoleHandler ch=new ConsoleHandler();
		ch.setLevel(Level.INFO);
		logr.addHandler(ch);
		
		//file handler
		
		try {
			FileHandler fh = new FileHandler("MyLogger.log",true);//setting true will append the log not override
			//fh.setFormatter(new SimpleFormatter());//default is XML formatter
			fh.setLevel(Level.INFO);
			logr.addHandler(fh);
			throw new java.io.IOException("couldn't read file");
		}
		catch (FileAlreadyExistsException e) {
			logr.log(Level.SEVERE,"The file is already exists",e.getMessage());
			
			
		}
		catch(java.io.IOException e1) {
			logr.log(Level.SEVERE,"coudn't open the file",e1);
		}
		
		logr.info("Info message");
		logr.log(Level.INFO,"info level");
		logr.log(Level.WARNING, "all level logging");//Handled by root logger if no logger is present
		
	}

}
