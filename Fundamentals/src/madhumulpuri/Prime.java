package madhumulpuri;
import java.lang.String;
public class Prime {
		public static void main(String args[]){
			Integer n=Integer.parseInt(args[0]);
			int count=0;
			for(int i=1;i<=n;i++){
					if(n%i==0){
						count++;
					}
					
			}
			if(count==2){
				System.out.println("is prime number");
			}else{
				System.out.println("is not a  prime number");
			}
		}

}
