


public class DBConnection {
	
	private static DBConnection instance;
	private String username = "toto";
	
	private DBConnection() {
		System.out.println("Constructeur de DBConnection - ");
		}
	
	public synchronized static DBConnection getInstance() {
		if (instance == null)
			instance = new DBConnection();
		
		return instance;
		}
	public String getUser() {
		return username;
	}
}
