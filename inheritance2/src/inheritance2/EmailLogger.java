package inheritance2;

public class EmailLogger extends Logger {
	@Override  //Logger da ayn�s� var ama eziyoruz
	public void log() {
    	System.out.println("Email yolland�.");
    } 
}
