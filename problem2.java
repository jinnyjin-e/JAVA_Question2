import java.util.Scanner;

class problem2{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int [] pass = new int[8];
		double p1;
		
		for(int i=0;i<8;i++){
			p1 = Math.random();
			pass[i]=(int)(9*p1+1);
		}
		for(int i=0;i<8;i++){
			System.out.print(pass[i]);
		}
		
	}
}