package oopörnek;

public class Car {
	
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	
	public Car() {
		
		/*this.color="bilgi yok";
		this.model="bilgi yok";
		this.engine=0;
		this.doors=0;*/
		this("bilgi yoookkk","byok",0,0);
	}
	
	
	
	public Car(String color, String model, double engine, int doors) {
		this.color=color;
		this.model=model;
		this.engine=engine;
		
		if(doors==2 || doors==4)
		{
			this.doors=doors;
			
		}
		else {
			
			System.out.println("hatalý giriþ ");
		}
		
		
	}
	
	
	public void goster() {
		System.out.println("arabanýn rengi"+color);
		System.out.println("arabanýn rengi"+model);
		System.out.println("arabanýn rengi"+engine);
		System.out.println("arabanýn rengi"+doors);
		
	}
	
	
	
	public void setcolor(String color) {
		
		this.color=color;
		
	}
	public String getcolor()
	{
		return this.color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		
		if(doors==2 || doors==4)
		{
			this.doors=doors;
			
		}
		else {
			
			System.out.println("hatalý giriþ ");
		}
	}
	
	public void start() {
		System.out.println("araba çalýþtý.");				 
	}

	public void stop() {
		System.out.println("araba durdu.");
	}
}
