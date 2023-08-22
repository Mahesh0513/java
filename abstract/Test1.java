abstract class calc {

    public abstract int cal_age();
}

class calc_imp1 extends calc{
    public int cal_age(){

        return 23;
    }
}

public class Test{
    public static void main(String[] args){

       int age= new calc_imp1().cal_age();

       System.out.println(age);
    }
}