
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqliteDB db = new SqliteDB();
		
		db.printDb();
		
		db.closeConnection();

	}

}
