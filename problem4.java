import java.util.Scanner;

class problem4{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int a,b,chck=0;
		
		System.out.printf("a´Â? ");
		a=ms.nextInt();
		System.out.printf("b´Â? ");
		b=ms.nextInt();
		
		for(int i=a;i<b;i++){
			
			for(int k=2;k<i;k++){
				if(i%k==0) chck++;	
			}
			if(chck==0) System.out.println(i);
			chck=0;
		}
		
	}
}