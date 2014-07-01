

/**
 * 
 * @author Alain
 *
 *Class pout connecter le programme a une base de données.
 */
public class DBConnection {
	
	private static DBConnection instance;
	private String username = "toto";
	
	private DBConnection() {
		System.out.println("Constructeur de DBConnection - ");
		}
	
	/**
	 * lmimite l'instanstiation de la connection a une instance and rends l'instance sur demande.
	 * 
	 * @Instance l'instance singleton de la connection
	 */
	public synchronized static DBConnection getInstance() {
		if (instance == null)
			instance = new DBConnection();
		
		return instance;
		}
	public String getUser() {
		return username;
	}
}
