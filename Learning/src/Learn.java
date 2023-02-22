import java.util.Arrays;

public class Learn {
	public static void main(String args[])
	{
		System.out.println("Print java");
		String s1="java"; String s2 ="";
		char [] ch = s1.toCharArray();
		Arrays.sort(ch);
		for(char ele : ch)
		{
			s2=s2+ele;
		}
		System.out.println(s2);
	}

}
