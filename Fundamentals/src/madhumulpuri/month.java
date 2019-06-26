package madhumulpuri;
import java.lang.String;
public class month {
		public static void main(String args[]){
			Integer n=Integer.parseInt(args[0]);
			 if(n<=12){
				 switch(n){
				 case 1:
					 System.out.println("januvary");
					 break;
				 case 2:
					 System.out.println("febravay");
					 break;
				 case 3:
					 System.out.println("march");
					 break;
				 case 4:
					 System.out.println("April");
					 break;
				 case 5:
					 System.out.println("may");
					 break;
				 case 6:
					 System.out.println("june");
					 break;
				 case 7:
					 System.out.println("july");
					 break;
				 case 8:
					 System.out.println("august");
					 break;
				 case 9:
					 System.out.println("september");
					 break;
				 case 10:
					 System.out.println("october");
					 break;
				 case 11:
					 System.out.println("November");
					 break;
				 case 12:
					 System.out.println("December");
					 break;
				 }
			}
			 else if(n>12){
				 System.out.println("Invalid Month");
			 }
			 else if(n.equals(" ")){
			 
				 System.out.println("enter the month");
			 
			 }
	}
	}


