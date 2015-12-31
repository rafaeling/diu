package WarmCoffee;
import java.sql.*;


public class DBHandler {
	private Connection dbConnection=null;
	
	
	
	public DBHandler() {
	}
	public DBHandler(String file){
		connect(file);
	}

	public void closeConnection(){
		try {
			dbConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void connect(String file){
		try {
		      Class.forName("org.sqlite.JDBC");
		      dbConnection = DriverManager.getConnection("jdbc:sqlite:"+file);
		      //dbConnection.setAutoCommit(false);
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Opened database successfully");
	}
	
	/*public void insertBrand(String name,String country) throws SQLException{
	      PreparedStatement stmt;	
			stmt = dbConnection.prepareStatement("INSERT INTO BRAND (BRAND_NAME, COUNTRY) values (?, ?)");
		    stmt.setString(1, name);
		    stmt.setString(2, country);
		    stmt.executeUpdate();
		    stmt.close();
		    dbConnection.commit();
	}
	public void insertCap(String name,int brandId,String description,boolean owned) throws SQLException{
		PreparedStatement stmt;
			stmt = dbConnection.prepareStatement("INSERT INTO CAP (CAP_NAME,CAP_BRAND,DESCRIPTION,OWNED) values (?, ?, ?, ?)");
		    stmt.setString(1, name);
		    stmt.setInt(2,brandId);
		    stmt.setString(3, description);
		    stmt.setBoolean(4, owned);
		    stmt.executeUpdate();
		    stmt.close();
		    dbConnection.commit();	
	}
	public ArrayList<Brand> getBrands(){
		Statement stmt;
		try {
			stmt = dbConnection.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM BRAND");
		return parseBrand(rs);  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<Cap> getCaps(){
		Statement stmt;
		try {
			stmt = dbConnection.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM CAP");
		return parseCap(rs);  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private ArrayList<Brand> parseBrand(ResultSet rs) throws SQLException{
		ArrayList<Brand> result=new ArrayList<Brand>();
			while ( rs.next() ) {
			     int id = rs.getInt("BRAND_ID");
			     String  name = rs.getString("BRAND_NAME");
			     String country  = rs.getString("COUNTRY");
			     result.add(new Brand(id,name,country));
			  }
		rs.close();		
		return result;
	}
	private ArrayList<Cap> parseCap(ResultSet rs) throws SQLException{
		ArrayList<Cap> result=new ArrayList<Cap>();
		while ( rs.next() ) {
		     int id = rs.getInt("CAP_ID");
		     String  name = rs.getString("CAP_NAME");
		     int brandId = rs.getInt("CAP_BRAND");
		     String description=rs.getString("DESCRIPTION");
		     boolean owned=rs.getBoolean("OWNED");
		     result.add(new Cap(id,name,brandId,description,owned));
		  }
		rs.close();
		return result;
	}*/
	
	
	
	/*public void executeQuery(String query){
		try {
			Statement stmt = dbConnection.createStatement();
			ResultSet rs = stmt.executeQuery( "SELECT * FROM BRAND;" );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	
	//Not parametrized
	public void sendQuery(String sqlQuery){
	Statement stmt;
	try {
		stmt = dbConnection.createStatement();
		stmt.executeUpdate(sqlQuery);	
		stmt.close();
		//dbConnection.commit();
	} catch (SQLException e) {
		e.printStackTrace();
	}	
	}
	
	 public static void main(String[] args) {
	       DBHandler dbHandler=new DBHandler("warm-coffee.db");
	       dbHandler.createTables();
	       dbHandler.closeConnection();

		  
	 }
	 
	 private void createTables(){
	       this.sendQuery("CREATE TABLE IF NOT EXISTS user(" +
		       		"username TEXT PRIMARY KEY NOT NULL," +
		       		"password TEXT NOT NULL)");
	       this.sendQuery("CREATE TABLE IF NOT EXISTS events(" +
		       		"id INTEGER PRIMARY KEY AUTOINCREMENT," +
		       		"name TEXT NOT NULL," +
		       		"date TEXT NOT NULL," +
		       		"organizer TEXT NOT NULL," +
		       		"FOREIGN KEY(organizer) REFERENCES user(username)) ");
	       this.sendQuery("CREATE TABLE IF NOT EXISTS sectors( " +
	    		    "id INTEGER PRIMARY KEY AUTOINCREMENT)");
		 
	       this.sendQuery("CREATE TABLE IF NOT EXISTS sectoruser(" +
	       		"user TEXT NOT NULL," +
	       		"sector INTEGER NOT NULL," +
	       		"date TEXT NOT NULL," +
	       		"FOREIGN KEY(user) REFERENCES user(username)," +
	       		"FOREIGN KEY(sector) REFERENCES sectors(id)," +
	       		"PRIMARY KEY(user,sector,date))");
	       this.sendQuery("CREATE TABLE IF NOT EXISTS eventuser(" +
	       		"user TEXT NOT NULL," +
	       		"event INTEGER NOT NULL," +
	       		"FOREIGN KEY(user) REFERENCES user(username)," +
	       		"FOREIGN KEY(event) REFERENCES events(id)," +
	       		"PRIMARY KEY(user,event))");
		 
	 }
	 
	
}
