package madhumulpuri;
import java.lang.String;
public class palindrome {
public static void main(String[] args) {
			Integer n=Integer.parseInt(args[0]);
			int s,k=0;
			 while(n>0){
					s=(n%10);
					k=k*10+s;
					n=(n/10);  	
				   }
			 if(n==k){
				 System.out.println("is a palindrome");
			 }else{
				 System.out.println("is a palindrome");
			 }

		}

	}


