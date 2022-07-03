package mypackage;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methods of strings
		System.out.println("Methods of String:");
		
		String s=new String("Hello Folks.!!");
		System.out.println(s.length());
		
		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(4));
		
		//string comparision
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		
		//IsEmpty
		String s4="Hi";
		System.out.println(s4.isEmpty());
		
		//loLowerCase
		String s5="MRUTHYUNJAYA Mendu";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Hello Folks";
		String replace=s6.replace("Hello", "Hi");
		System.out.println(replace);
		
		//equals
		String x="Welcome to JAVA";
		String y="WeLCOmE to JaVA";
		System.out.println(x.equals(y));
		
		System.out.println("\n");
		System.out.println("Creating String Buffer");
		
		//Creating a string buffer
		StringBuffer sb1=new StringBuffer("Welcome to Java!");
		sb1.append("Enjoy your learning");
		System.out.println(sb1);
		
		//insert method
		sb1.insert(0, "simpli");
		System.out.println(sb1);
		
		//replace method
		StringBuffer sb2=new StringBuffer("Hello");
		sb2.replace(0,3,"hEL");
		System.out.println(sb2);
		
		//delete method
		sb2.delete(0, 1);
		System.out.println(sb2);
		
		//String Builder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb3=new StringBuilder("Happy");
		sb3.append("Learning");
		System.out.println(sb3);
		
		System.out.println(sb3.delete(0, 1));
		
		System.out.println(sb3.insert(1, "Welcome"));
		
		System.out.println(sb3.reverse());
		
		//Conversion
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str="Hello";
		
		//Conversion of String object to String Buffer
		StringBuffer sbr=new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		//Conversion from string object to String Builder
		StringBuilder sbl=new StringBuilder(str);
		sbl.append("World");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
		
		
	}

}
