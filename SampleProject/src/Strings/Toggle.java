package Strings;

public class Toggle {

	public static void main(String[] args) {
		
		String str = "PrepInsTa";
		String s = "";
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) 
				s = s + Character.toLowerCase(str.charAt(i));
			else
				s = s + Character.toUpperCase(str.charAt(i));				
		}
		
		System.out.println(s);

	}

}