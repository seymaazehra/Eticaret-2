package inheritance2;

public class DatabaseLogger extends Logger {
	@Override  //Logger da ayn�s� var ama eziyoruz
	public void log() {
    	System.out.println("Database yolland�.");
    } 
}