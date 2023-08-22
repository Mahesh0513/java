class test{
	static int a=100;
	       int b=200;
		public static void main(String[] args){
			int c=300;
			
			test t1=new test();
			test t2= new test();
			
			System.out.println(a+t1.b+c);
			
			t1.a=1;
			t2.b=19;
			System.out.println(t2.a);
			
            a=2;
			System.out.println(a);
			
			
		}
}