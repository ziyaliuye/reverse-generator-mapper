package cn.cnm.test;

import cn.cnm.pojo.Flower;
import cn.cnm.service.CostomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lele
 * @version 1.0
 * @Description
 * @Email 414955507@qq.com
 * @date 2019/11/8 17:13
 */
public class CostomMapperDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        // 直接获取Mapper的接口即可
        CostomService costomService = applicationContext.getBean("costomService", CostomService.class);

        List<Flower> list = costomService.getAll();
        list.forEach(System.out::println);

        /* 自定义的SQL */
        List<Flower> myList1 = costomService.mySelect();
        myList1.forEach(System.out::println);
        System.out.println("二级缓存不生效， 因为都是在同一个sqlSession中");
        List<Flower> myList2 = costomService.mySelect();
        myList2.forEach(System.out::println);
    }
}