import java.util.Scanner;

class problem3{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		double kml,kml2;
		String l,lo;	
		
		System.out.print("어느 단위 사용?: ");
		l = ms.nextLine();
		System.out.printf("몇 %s?: ",l);
		kml = ms.nextDouble();
		
		switch(l){
			case "km":
			kml2 = 0.62*kml;
			lo="mile";
			break;
			
			case "mile":
			kml2 = 1.61*kml;	
			lo="km";
			break;
			
			default:
			System.out.printf("옳지않은 단위입니다.");
			return;
		}
		
		System.out.printf("%.1f%s를 %s로 변환하면 %.2f%s입니다.",kml,l,lo,kml2,lo);
			
		
		
		
	}
}