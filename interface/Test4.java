interface Dao{
    public              int min_bal1=500;
    public static       int min_bal2=500;
    public static final int min_bal3=500;
}

class DaoImp1 implements Dao{
    static int min_bal=10000;

    public static void main(String[] args){

        System.out.println(Dao.min_bal1);
        System.out.println(Dao.min_bal2);
        System.out.println(Dao.min_bal3);
        System.out.println(min_bal);
    }
}