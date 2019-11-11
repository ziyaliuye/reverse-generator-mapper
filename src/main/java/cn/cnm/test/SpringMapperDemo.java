package cn.cnm.test;

import cn.cnm.mapper.FlowerMapper;
import cn.cnm.pojo.Flower;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

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
        FlowerMapper flowerMapper = applicationContext.getBean("flowerMapper", FlowerMapper.class);

        // 通用Mapper中Example改成统一的Example， 和原生的XxxExample还是有点区别
        Example example = new Example(Flower.class);
        // 还是照常创建匹配规则
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("name", "%牛%");

        List<Flower> list = flowerMapper.selectByExample(example);
        list.forEach(o -> System.out.println(o.getName()));
    }
}
