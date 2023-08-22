class A{
     
     public void m1(){
        System.out.println("public");
     }

      void m2(){
         System.out.println("default");
     }
     protected void m3(){
         System.out.println("protected");
     }
     private void m4(){
         System.out.println("private");
     }
     public static void m5(){
         System.out.println("static");
     }

     public static void main(String[] args){
           A a=new A();

           a.m1();
           a.m2();
           a.m3();
           a.m4();
           a.m5();
             m5();



     }
}