abstract class dia{
      
     abstract void login();

      void logout(){
        System.out.println("logout succufully");
      }
}

class dia_imp extends dia{
     
     void login(){
        System.out.println("login succufully");
     }
}

class Test{
 public static void main(String[] args){

   dia_imp a=new dia_imp();

    a.login();
    a.logout();
 }
}