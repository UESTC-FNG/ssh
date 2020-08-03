package action;

import bo.PersonBo;
import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    private int number;
    private String title;
    private PersonBo personBo;

    public PersonBo getPersonBo() {
        return personBo;
    }

    public void setPersonBo(PersonBo personBo) {
        this.personBo = personBo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String execute() throws Exception {
        //使用struts2框架，不用new对象直接可以使用类中声明的对象用于前后端传值
      if (personBo.getName().equals("王明杰")){
          return ERROR;
      }
        return SUCCESS;
    }
}
