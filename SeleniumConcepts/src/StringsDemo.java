
public class StringsDemo {

	public static void main(String[] args) {
		// String : it is one of the prebuilt class in java which as powerful methods
		// there are two types of defining strings
		
		String name = " mounikao /mounika/testing ";		// string literal( anyways java complier intern covert that to string class object)
		String name1 = new String("mounika1");		// creating a string class object
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("o"));		// if there is no char with "o" it will give -1
		System.out.println(name.substring(2, 7));  // prints from 2 to 7th index
		System.out.println(name.substring(2));     // prints from 2nd index to till last index
		System.out.println(name.concat("sharab testing"));  	//Concatenate the string
		System.out.println(name.length());
		System.out.println(name.trim());			// trims wide spaces( leading and trailing spaces(starting and ending spaces but not the spaces b/w in the string))
		System.out.println(name.trim().length());
		System.out.println(name.toUpperCase());
		String name2 = "Mounika Sharab";
		String splitedStrings1[]= name2.split(" ");
		String Reverse1="";
		for(int j=splitedStrings1.length-1;j>=0;j--) {
			//System.out.print(splitedStrings1[j]);
			//reversing and storing in another string
			Reverse1 = Reverse1+splitedStrings1[j];
			
			
		}
		System.out.println("test");
		System.out.println(Reverse1);
		String	splitedStrings[]= name.split("/");		//split method will return no of strings so we need to store them in a array 
		System.out.println(splitedStrings[0]);
		System.out.println(name.replace("m", "r"));
		
		// to check whether string is palendrome or not
		String s = "mounika";
		String t = "";
		for (int i = s.length()-1;i>=0;i--) {
			t = t + s.charAt(i);
				
		}
		System.out.println(t);
		if (s.equals(t)) {
			System.out.println("it is palendrome");
				}
		else {
			System.out.println("not a palendrome");
		}
		

	}
	
}
