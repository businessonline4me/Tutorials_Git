package JavaExamples;

//Understanding of Constructors & Objects

public class PuppyCO{

	   public PuppyCO(String name){
	      // This constructor has one parameter, name.
	      System.out.println("Passed Name is :" + name ); 
	   }
	   public static void main(String []args){
	      // Following statement would create an object myPuppy
	      PuppyCO myPuppy = new PuppyCO( "tommy" );
	   }
	}
