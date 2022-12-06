import java.util.*;
import java.util.Scanner;
public class nothing {
	
	public static int maximumChars(String str)
    {
        int n = str.length();
        int res = -1;
         
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (str.charAt(i) == str.charAt(j))
                    res = Math.max(res,(j - i - 1));
                          
        return res;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 int noc = maximumChars(str);
		 System.out.println(noc);
	}

}
