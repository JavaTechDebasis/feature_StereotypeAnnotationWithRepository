import com.spring.annotation.beans.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoTypeAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.spring.annotation.beans");
        Robot robot = applicationContext.getBean("ios", Robot.class);
        robot.walk(40, "Left");
    }
}
