package mypackage;

import java.util.regex.*;

public class RegularDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="[a-z]+";
		String check="ReguLar ExprEssions";
		
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		
		while(c.find()) {
			System.out.println(check.substring(c.start(),c.end()));
		}
	}

}
