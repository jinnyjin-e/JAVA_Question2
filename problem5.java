import java.util.Scanner;

class problem5{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int a,b,cnt=0;
		int []g1 = new int [20];
		int []g2 = new int [20];
		int []cg = new int [100];
		
		System.out.printf("a´Â? ");
		a=ms.nextInt();
		System.out.printf("b´Â? ");
		b=ms.nextInt();
		
		for(int i=1;i<=a;i++){
			if(a%i==0){
				g1[cnt] = i;
				cnt++;
			}
		}
		cnt=0;
		for(int i=1;i<=b;i++){
			if(b%i==0){
				g2[cnt] = i;
				cnt++;
			}
		}
		cnt=0;
		for(int i=0;i<g1.length-1;i++){
			for(int j=0;j<g2.length;j++){
				if(g1[i]==g2[j]&&(g1[i]!=0||g2[j]!=0)){
					cg[cnt]=g2[j];
					cnt++;
					
				}
			}
		}
		
		for(int i=0;i<cg.length;i++){
			if(cg[i]!=0) System.out.print(cg[i]+" ");
		}
		
	}
}