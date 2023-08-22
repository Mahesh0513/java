class Test{
	static void m1(){
		for(int i=100;i>=10;i--){
			if(i==95){
				//continue;
				break;
			}
			System.out.println(i);
		}
	}
	 public static void main(String[] args){
		 m1();
	 }
}