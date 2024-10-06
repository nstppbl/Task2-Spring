import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld beans are equals? - " + (helloWorldBean1 == helloWorldBean2));

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat beans are equals? = " + (catBean1 == catBean2));
    }
}