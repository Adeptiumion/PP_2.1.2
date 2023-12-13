import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld secondBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat firstCat = applicationContext.getBean("cat", Cat.class);
        Cat secondCat = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean == secondBean);
        System.out.println(firstCat == secondCat);
    }
}