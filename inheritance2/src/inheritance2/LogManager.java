package inheritance2;
//yanl�� kullan�m tek tek if kullan�lmaz her birine class a��p extends ettik
//birbirinin alternatifi olan kodlarda if kullan�lmaz.
public class LogManager {
  public void log(int logType) {//loglamak
	  if(logType==1) {
		  System.out.println("veri taban�na logland�.");
		  
	  }else if(logType==2) {
		  System.out.println("dosyaya logland�.");
		  
	  }else {
		  System.out.println("Email g�nderildi.");
	  }
  }
}
