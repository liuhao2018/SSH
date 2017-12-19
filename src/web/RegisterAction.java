package web;

import com.opensymphony.xwork2.ActionSupport;
import domain.User;
import org.apache.struts2.ServletActionContext;
import service.IUserService;

/**
 * @author liuhao
 */
public class RegisterAction extends ActionSupport {

    private IUserService userService;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setName(name);
        userService.save(user);
        ServletActionContext.getResponse().getWriter().write("Hello " + name);
        return NONE;
    }
}
