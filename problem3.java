import java.util.Scanner;

class problem3{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		double kml,kml2;
		String l,lo;	
		
		System.out.print("��� ���� ���?: ");
		l = ms.nextLine();
		System.out.printf("�� %s?: ",l);
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
			System.out.printf("�������� �����Դϴ�.");
			return;
		}
		
		System.out.printf("%.1f%s�� %s�� ��ȯ�ϸ� %.2f%s�Դϴ�.",kml,l,lo,kml2,lo);
			
		
		
		
	}
}