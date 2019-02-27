package in.zipgo.mavenTest;

import java.io.File;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    
    @Test
    public static void xyz() {
    	
    	System.out.println("App Class");
    	
    /*	System.out.println("TestNG Test");
    	String home = System.getProperty("user.home"); //it will take current user location
		File f = new File(home + File.separator + "Downloads" + File.separator + "Testing"); //file.separator will seprate the file
		System.out.println(f);
		System.out.println(home+ File.separator + "Downloads/"+ File.separator);
		String S = home+ File.separator + "Downloads";
		System.out.println(S);
		
		
		 // prints the name of the system property
	      System.out.println(System.getProperty("user.dir"));

	      // prints the name of the Operating System
	      System.out.println(System.getProperty("os.name"));

	      // prints Java Runtime Version
	      System.out.println(System.getProperty("java.runtime.version" ));*/
		
    }
}
