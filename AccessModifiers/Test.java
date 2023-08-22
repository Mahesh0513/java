class Parent{
    private void m1(){
        System.out.println("private");
    }

    protected void m2(){
        System.out.println("protected");
}
}
class child extends Parent{
    void m3(){
        System.out.println("default");

    }
    public static void main(String[] args){
        Parent a=new Parent();
        //a.m1();
        a.m2();
        child b=new child();
        //b.m1();
        b.m2();
        b.m3();
        Parent c=new child();
       // c.m1();
        c.m2();
        c.m3();

    }
}