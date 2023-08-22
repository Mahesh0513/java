class Dao{
    final void m1(){
        System.out.println("dao-m1 method");
    }
}

class Test extends Dao{
    void m1(){
        System.out.println("Test-m1 method");

    }

    public static void main(String[] args){
       Test a= new Test();
       a.m1();
    }
}