import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.logging.Logger;

@Configuration
public class AppConfig {

    public static Logger configLogger = Logger.getLogger(AppConfig.class.getName());

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        configLogger.info("HelloWorld bean has been creating!");
        return helloWorld;
    }

    @Bean("cat")
    @Scope("prototype") // 4. Настройте этот бин так, чтобы он создавался новым при каждом запросе.
    public Cat getCat() {
        configLogger.info("Cat bean has been creating!");
        return new Cat();
    }
}