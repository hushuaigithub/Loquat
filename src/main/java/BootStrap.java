import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({Configurations.class})
@SpringBootApplication
@ComponentScan(value = "com.luna.rest")
public class BootStrap {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootStrap.class, args);
    }
}
