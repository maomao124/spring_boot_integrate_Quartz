package mao.spring_boot_integrate_quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Project name(项目名称)：spring_boot_integrate_Quartz
 * Package(包名): mao.spring_boot_integrate_quartz
 * Class(类名): Schedule
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/10
 * Time(创建时间)： 21:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class Schedule
{
    private static final Logger log = LoggerFactory.getLogger(Schedule.class);

    @Scheduled(cron = "0/1 * * * * ?")
    public void print()
    {
        log.info(Thread.currentThread().getName()+"：hello");
    }
}
