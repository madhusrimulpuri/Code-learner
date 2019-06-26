package madhumulpuri;
import java.lang.String;
public class colourcode {
		public static  void main(String[] args){
			switch(args[0]){
			case "B":
				System.out.println("Blue");
				break;
			case "G":
				System.out.println("Green");
				break;
			case "O":
				System.out.println("Orange");
				break;
			case "Y":
				System.out.println("Yellow");
				break;
			case "W":
				System.out.println("White");
				break;
			default:System.out.println("Invalide Code");
			 break;
			}
		}
}

