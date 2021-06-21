import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanDef1 {

    @Bean
    public Bean1 bean1() {
        Bean1 bean1 = new Bean1();
        System.out.printf("Bean1 in bean definition: %s %n", bean1.hashCode());

        return bean1;
    }

    @Bean
    public String stringBean1(Bean1 bean1) {
        System.out.printf("Bean1 another bean def:%s%n", bean1().hashCode());

        return bean1.getMessage();
    }

}
