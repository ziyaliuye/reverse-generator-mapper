package cn.cnm.test;

import cn.cnm.mapper.AirportMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lele
 * @version 1.0
 * @Description
 * @Email 414955507@qq.com
 * @date 2019/11/8 17:13
 */
public class SpringMapperDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        // 直接获取Mapper的接口即可
        AirportMapper airportMapper = applicationContext.getBean("airportMapper", AirportMapper.class);
    }
}
