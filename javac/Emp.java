class Emp{
	int id=101;
	String ename;
	static String org_Name;
	
	static void get_Details(){
		int a=100;
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		System.out.println(e1.id);
		System.out.println(e1.ename);
		
		System.out.println(org_Name);
		System.out.println(a);
	}
	public static void main(String[] args){
    get_Details();
	}
	
}