import java.util.*;

public class licensen_keys{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); //Starting Scanner to accept inputs	
		String S = in.nextLine(); //Input Format: S=2-4A0r7-4k K=4
		String temp = " ";
		int index = S.indexOf(temp);//Split array using space - " "
		String S1 = S.substring(2, index);//Contains S=***
		String S2 = S.substring(index+3);//Contains K=***
		int K = Integer.parseInt(S2); //Contains K Value
		StringBuilder sb = new StringBuilder();
        for (int i = S1.length() - 1; i >= 0; i--)//Starting from the end of the array
            if (S1.charAt(i) != '-')
            	//Appends each character of input string to SB, also appends '-' if the length of SB is a multiple of K.
                sb.append(sb.length() % (K + 1) == K ? '-' : "").append(S1.charAt(i));  
        System.out.println(sb.reverse().toString().toUpperCase()); //Reverse the string and convert to uppercase
		in.close();
	}
}