package inheritance2;
//müþteri iþlerini yapacak sýnýf
public class CustomerManager {
	
      public void add(Logger logger) {
    	  //müþteri ekleme kodlarý
    	  System.out.println("müþteri eklendi");
    	  
    	  //DatabaseLogger logger =new DatabaseLogger();
    	 //yukarýdakine gerek yok çünkü iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanýrsa new lenmez
    	  logger.log();
      }
}
