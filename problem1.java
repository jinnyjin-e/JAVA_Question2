class problem1{
	public static void main(String [] args){
		int we,a;
		String il="";
		
		we = Integer.parseInt(args[0]);
		a = (3*we+5)%7;
		
		switch(a){
			case 0:
			il="��";
			break;
			
			case 1:
			il="��";
			break;
			
			case 2:
			il="ȭ";
			break;
			
			case 3:
			il="��";
			break;
			
			case 4:
			il="��";
			break;
			
			case 5:
			il="��";
			break;
			
			case 6:
			il="��";
			break;
		}
		
		System.out.printf("A�� ���� %d��° ��ǥ�� %s�����Դϴ�.",we,il);
		
		
	}
}