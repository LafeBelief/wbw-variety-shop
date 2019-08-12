package cn.wbw.vs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 全局扫描配置
 * * @EnableTransactionManagement 开启 事物
 * * @MapperScan 开启 dao 扫描,扫描多个包
 *
 * @author wbw
 * @date 21:40
 */
@Configuration
@EnableTransactionManagement
@MapperScan("cn.wbw.vs.dao")
public class MyBatisConfig {
}
