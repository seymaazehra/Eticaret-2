package inheritance2;

public class FileLogger extends Logger {
	@Override  //Logger da ayn�s� var ama eziyoruz
	public void log() {
    	System.out.println("File yolland�.");
    } 
}
