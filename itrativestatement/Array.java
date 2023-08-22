class Test{
	public static void main(String[] args){
	int[] ids={101,102,103,104};
	String[] enames={"modi","rahul","sonia","priyanka"};
	String[] sizes={"s","m","l","xl"};
	
	
	for(int i=0;i<=enames.length-1;i++){
		System.out.println(enames[i]);
	}
	
	for(int id:ids){
		System.out.println(id);
	}
	for(String ename:enames){
		System.out.println(ename);
	}
	for(String size:sizes){
		System.out.println(size);
	}
	
	}
	
}