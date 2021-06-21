import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class BeanDef2 {
    @Bean
    public Bean2 bean2() {
        Bean2 bean2 = new Bean2();
        System.out.printf("Bean2 in bean definition: %s %n", bean2.hashCode());

        return bean2;
    }

    @Bean
    public String stringBean2(Bean2 bean2) {
        System.out.printf("Bean2 another bean def:%s%n", bean2().hashCode());

        return "";
    }

}
