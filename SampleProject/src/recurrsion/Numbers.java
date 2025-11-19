package recurrsion;

public class Numbers {

	public static void main(String[] args) {

		int num = 5;
		numberRecursion(num);

	}

	private static void numberRecursion(int num) {
		if(num < 1)
			return ;
		
		//System.out.println(num );
		numberRecursion(num -1);
		System.out.println(num);
		
	}

}
