package action;

import com.opensymphony.xwork2.ActionSupport;


//除了实现Action接口（类中只重写execute方法），还可以通过集成ActionSupport类
public class ByeAction extends ActionSupport {
    private int account;
    private int password;


    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    //处理登陆的方法
    public String login(){
       System.out.println("你已经登录了");
       return ERROR;
    }

    //处理退出的方法
    public String exit(){
        System.out.println("你已经退出了");
        return ERROR;
    }
}
