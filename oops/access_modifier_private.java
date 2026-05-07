package oops;

public class access_modifier_private {
    public static void main(String[] args) {

    Mybankac acc = new Mybankac();
    acc.username = "bhavya kumawat";
    acc.setpass("asdfghjk");
     System.out.println(acc.username);
    }
}

    class Mybankac{
  public String username;
  private String password;
  public void setpass(String pwd){
    password = pwd;
  }
  }