package inheritance2;

public class FileLogger extends Logger {
	@Override  //Logger da aynýsý var ama eziyoruz
	public void log() {
    	System.out.println("File yollandý.");
    } 
}
