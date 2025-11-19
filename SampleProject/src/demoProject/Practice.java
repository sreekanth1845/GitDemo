package demoProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public class ABC{
		public static void sample() {
			System.out.println("Srikanth");
		}
	}
	public static void main(String[] args) {
		
//		outer:
//	        for(int i=0;i<3;i++){
//	            for(int j=0;j<3;j++){
//	                if(i==1 && j==1)
//						break outer;
//						
//	                System.out.println(i+" "+j);
//	            }
//	        }
//		
//		//To remove duplicates from an array
//		List<String> list = Arrays.asList("abc", "def", "xyz", "mno", "pqr", "def", "xyz", "stu");
//		
//		Set<String> set = new LinkedHashSet<String>();
//		list.stream().filter(s -> set.add(s)).forEach(System.out::println);
//		
//		set.addAll(list);
//		System.out.println(set);
//		
		
		ABC.sample();

		String st = new String("hi Mr. Buddy");
		System.out.println(st.hashCode());
		System.out.println("hi Mr. Buddy".hashCode());

		System.out.println( "hi Mr. Buddy" == st );
		System.out.println(st.contains("hi Mr. Buddy"));
		System.out.printf("sdgfhkjl %s jhkk \n", st);

		System.out.println( "hi Mr. Buddy" );
		
		int num = 10;
		for(int i=0; i<=num; i++) {
			if(i < 3) {
				System.out.println("qwerty");
			}
			else
				break;
			System.out.println(100);
		}
		
		Map<String, String> userRoles = new HashMap<>();
		userRoles.put("anna.smith", "Developer");
		System.out.println("Contains anna.smith? " + userRoles.containsKey("anna.smith"));
	}

}