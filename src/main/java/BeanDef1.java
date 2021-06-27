import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDef1 {

    @Bean
    public Bean1 bean1() {
        Bean1 bean1 = new Bean1();
        System.out.printf("Bean1 instance in bean1() method: %s %n", bean1.hashCode());

        return bean1;
    }

    @Bean
    public String notBean1() {
        Bean1 bean1 = bean1();
        System.out.printf("Bean1 instance in notBean1() method:%s%n", bean1.hashCode());

        return bean1.getMessage();
    }

}
