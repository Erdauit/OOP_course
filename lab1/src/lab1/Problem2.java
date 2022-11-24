package lab1;

public class Problem2 {
	public static final String obj;
	
	static {
		obj = "player";
	}
	
	private String model;
	public String currentMusic;
	public int cnt = 0;
	Switch status;
	
	public Problem2 () {
		this.status = Switch.OFF;
		this.currentMusic = "no music(((";
		this.model = "mp3";
	}
	public Problem2 (String currentMusic, String model) {
		this.currentMusic = currentMusic;
		this.model = model;
		this.status = Switch.OFF;
	}
	public Problem2 (String model) {
		this.currentMusic = "no music(((";
		this.model = model;
		this.status = Switch.OFF;
	}
	
	{
		cnt++;
	}
	
	public void changeMusic(String currentMusic) {
		this.currentMusic = currentMusic;
		System.out.println("Success!");
	}
	
	
	public void changeStatus(Switch status) {
		this.status = status;
		if (this.status == Switch.OFF) {
			System.out.println( "You paused this music");
		} else {
			System.out.println( "Music is playing...");
		}
	}
	
	public String getModel() {
		return model;
	}
	//model is the read only field that has not the setter,
	//outside classes cannot change the read only field, only read with getModel
	
	public String toString() {
		String information = "Short information: \n" +"Your player: "+ obj + "\n" + "  model: " +this.model + "\n" + "  Currently playing:" + this.currentMusic;
		return information;
	}
	
		
}
