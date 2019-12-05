import java.util.Scanner;

class problem6{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int m,y,d;
		
		System.out.print("몇 년: ");
		y=ms.nextInt();
		System.out.print("몇 월: ");
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
			System.out.print("그런 달은 없습니다.");
			return;
		}
		System.out.printf("%d년 %d월은 %d일까지 있습니다.",y,m,d);
		
		
	}
}