package mao.spring_boot_integrate_quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootIntegrateQuartzApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootIntegrateQuartzApplication.class, args);
    }

}
