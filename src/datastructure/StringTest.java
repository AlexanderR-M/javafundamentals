package datastructure;

import java.security.Policy.Parameters;

public class StringTest {
	
	private static String[] parameters;

	public static void main(String[] args) {
		
		String querySQL = 
				"select * from user where username = 'Alex' and email = 'alex@'"; 
		querySQL = 
				"select * from user where username = ?";
		String[] params = {"alex", "r@gmail.com"};
		System.out.println(sqlProcess(params, querySQL));
		
	
	}
	
	private static String sqlProcess(String[] params, String sql) {
		
		char[] characters = sql.toCharArray();
		int i = 0;
		String sum = "";
		for (char chararcter : characters) {
			System.out.println("The current character is " + characters);
			if (chararcter != '?') {
				sum += characters; 
			}
			else {
				sum += params[i];
				i++;
			}
		}
		
		System.out.println("sub string " + sql.subSequence(0, 10));
		
		
		return "";
	}

}

