class test {
	 int a=100;
	public static void main(String[] args){
		test t1=new test();
		test t2=new test();
		System.out.println(t1.a);
		System.out.println(t2.a);
		
		t2.a=10;
		System.out.println(t1.a);
		System.out.println(t2.a);
	}
}