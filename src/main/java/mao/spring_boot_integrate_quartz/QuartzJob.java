package mao.spring_boot_integrate_quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Project name(项目名称)：spring_boot_integrate_Quartz
 * Package(包名): mao.spring_boot_integrate_quartz
 * Class(类名): QuartzJob
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/10
 * Time(创建时间)： 21:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class QuartzJob extends QuartzJobBean
{

    private static final Logger log = LoggerFactory.getLogger(QuartzJob.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException
    {
        log.info("任务执行...");
    }
}
