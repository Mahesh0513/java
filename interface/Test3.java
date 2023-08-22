interface Dao{
    int min_bal=5000;
}

class DaoImp1 implements Dao{
    static int min_bal=3000;
    public static void main(String[] args){

        System.out.println(Dao.min_bal);
    }
}