package in.zipgo.mavenTest;

public class SystemProperty {
	
	public static void main(String[] args) 
    { 
        // Printing Name of the system property 
        System.out.println("user.dir: "+System.getProperty("user.dir")); // current directory 
        System.out.println("user.dir: "+System.getProperty("user.home")); // home directory 
  
        // Fetches the property set with 'home' key 
        System.out.println("home: "+System.getProperty("home")); 
        // Resulting in Null as no property is present 
  
        // Printing 'name of Operating System' 
        System.out.println("os.name: "+System.getProperty("os.name")); 
  
        // Printing 'JAVA Runtime version' 
        System.out.println("version: "+System.getProperty("java.runtime.version" )); 
  
        // Printing 'name' property 
        System.out.println("name: "+System.getProperty("name" )); 
        // Resulting in Null as no property is present 
    } 

}
