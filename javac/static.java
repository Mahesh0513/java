class account{
	static int min_bal=500;
    public static void main(String[] args){
		account a1=new account();
		account a2= new account();
		
		 System.out.println(min_bal);
		 System.out.println(a1.min_bal);
         System.out.println(a2.min_bal);
		  System.out.println(account.min_bal);
		  
		  min_bal=20000;
		  a1.min_bal=50000;
		  //account.min_bal=60000;
		  System.out.println(min_bal);
	}
}