import java.util.Scanner;

class problem6{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int m,y,d;
		
		System.out.print("�� ��: ");
		y=ms.nextInt();
		System.out.print("�� ��: ");
		m=ms.nextInt();
		
		switch(m){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			d=31;
			break;
			
			case 4: case 6: case 9: case 11:
			d=30;
			break;
			
			case 2:
			if(((y%4==0)&&(y%100!=0))||(y%400==0)) d=29;
			else d=28;
			break;
			
			default:
			System.out.print("�׷� ���� �����ϴ�.");
			return;
		}
		System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.",y,m,d);
		
		
	}
}