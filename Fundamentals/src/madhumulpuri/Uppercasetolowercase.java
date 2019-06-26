package madhumulpuri;
import java.lang.String;
public class Uppercasetolowercase {
		public static void main(String args[]){
		 char x='a';  
		 char y='A';
		 if(args[0].equals("a")){
			 int b=(int)x-32;
			 System.out.println((char)b);
		 }
		 else if(args[0].equals("A")){
			 int b=(int)y+32;
			 System.out.println((char)b);
		 }
				 
		}
}
