class problem1{
	public static void main(String [] args){
		int we,a;
		String il="";
		
		we = Integer.parseInt(args[0]);
		a = (3*we+5)%7;
		
		switch(a){
			case 0:
			il="일";
			break;
			
			case 1:
			il="월";
			break;
			
			case 2:
			il="화";
			break;
			
			case 3:
			il="수";
			break;
			
			case 4:
			il="목";
			break;
			
			case 5:
			il="금";
			break;
			
			case 6:
			il="토";
			break;
		}
		
		System.out.printf("A의 다음 %d번째 발표는 %s요일입니다.",we,il);
		
		
	}
}