import domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IUserService;
import service.impl.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService service = context.getBean("userService", UserServiceImpl.class);
        User user = new User();
        user.setName("exception");
        service.save(user);
    }
}
