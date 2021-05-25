package inheritance2;
//yanlýþ kullaným tek tek if kullanýlmaz her birine class açýp extends ettik
//birbirinin alternatifi olan kodlarda if kullanýlmaz.
public class LogManager {
  public void log(int logType) {//loglamak
	  if(logType==1) {
		  System.out.println("veri tabanýna loglandý.");
		  
	  }else if(logType==2) {
		  System.out.println("dosyaya loglandý.");
		  
	  }else {
		  System.out.println("Email gönderildi.");
	  }
  }
}
