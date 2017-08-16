package animal;

public class Athletes {

	static private int count = 0;
	private int speed;
	private String name;
	
	public Athletes(int speed, String name) {
		this.speed = speed;
		this.name = name;
		count++;
	}
	
	public int getSpeed() {
		
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	static public int getCount() {
		return count;
	}
	}

