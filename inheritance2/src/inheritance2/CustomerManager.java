package inheritance2;
//m��teri i�lerini yapacak s�n�f
public class CustomerManager {
	
      public void add(Logger logger) {
    	  //m��teri ekleme kodlar�
    	  System.out.println("m��teri eklendi");
    	  
    	  //DatabaseLogger logger =new DatabaseLogger();
    	 //yukar�dakine gerek yok ��nk� i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullan�rsa new lenmez
    	  logger.log();
      }
}
