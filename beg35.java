import java.util.Scanner;
public class numeric {
    
 public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
		String s =in.nextLine();
		count(s);

	}
	public static void count(String e){
		char[] ch = e.toCharArray();
		int num = 0;
		for(int i = 0; i < e.length(); i++){
			if(Character.isDigit(ch[i])){
				num ++ ;
			}
		}

		System.out.println( + num);
			}
}
