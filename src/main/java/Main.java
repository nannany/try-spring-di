import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanDef1.class, BeanDef2.class);

        Bean1 bean1 = applicationContext.getBean(Bean1.class);
        System.out.printf("Bean1 instance from container:%s%n", bean1.hashCode());

        Bean2 bean2 = applicationContext.getBean(Bean2.class);
        System.out.printf("Bean2 instance from container:%s%n", bean2.hashCode());

        applicationContext.close();

    }
}
