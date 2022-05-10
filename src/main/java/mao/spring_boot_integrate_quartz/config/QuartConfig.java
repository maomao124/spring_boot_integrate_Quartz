package mao.spring_boot_integrate_quartz.config;

import mao.spring_boot_integrate_quartz.QuartzJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project name(项目名称)：spring_boot_integrate_Quartz
 * Package(包名): mao.spring_boot_integrate_quartz.config
 * Class(类名): QuartConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/10
 * Time(创建时间)： 21:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class QuartConfig
{
    @Bean
    public JobDetail jobDetail()
    {
        return JobBuilder.newJob(QuartzJob.class).storeDurably().build();
    }

    @Bean
    public Trigger trigger()
    {
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(jobDetail()).withSchedule(cronScheduleBuilder).build();
    }
}
