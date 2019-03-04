import java.util.regex.*;

public class patterncopy{
	public static void main(String args[]){
		String phone = "0929-671789";
		String text = "1231XXwdkpokpXXppdsdplXXlsdplsplXX";
		Pattern pattern = Pattern.compile("0929-671789");
		Pattern pattern2 = Pattern.compile(".XX");
		Matcher matcher = pattern.matcher(phone);
		Matcher matcher2 = pattern2.matcher(text);
		if(matcher.find())
			System.out.println("GOOD JOB");
		while(matcher2.find())
			System.out.println("GOOD JOB 2");
			System.out.print(matcher2.group());
	}
}
