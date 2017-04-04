import java.util.*;

public class StringToInteger{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); //Starting scanner
		String S = in.next(); 
		int result = 0; //Initializing result integer
		int factor = 1;
		for(int i=S.length()-1;i>=0;i--){ // Starting from the end of the array
			result += (S.charAt(i)-'0') * factor; //Use the technique of factoring, if S='1234' the we do 4*1 + 3*10 + 2*100 + 1*1000
			factor *= 10;
		}
		System.out.println(result);
		in.close();
	}
}