package cn.cnm.test;

import cn.cnm.mapper.FlowerMapper;
import cn.cnm.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lele
 * @version 1.0
 * @Description
 * @Email 414955507@qq.com
 * @date 2019/11/8 17:13
 */
public class JavaMapperDemo {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            System.out.println(new File("").getAbsolutePath());
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();

            /* 创建MapperHelper对象, 通过这个对象对MyBatis原生对象做处理, 其他地方不变 */
            // 获取sqlSession的配置对象
            Configuration configuration = session.getConfiguration();
            MapperHelper mapperHelper = new MapperHelper();
            // 对MyBatis原生对象做处理， 其他地方都正常使用
            mapperHelper.processConfiguration(configuration);

            // 获取接口的实现类, 由MyBatis自动产生代理对象
            FlowerMapper flowerMapper = session.getMapper(FlowerMapper.class);
            // 开始调用实例的方法， MyBatis会自动寻找对应的XML文件中的SQL并执行
            Flower flower = flowerMapper.selectByPrimaryKey(1);
            System.out.println(flower);
            // 关闭连接， 不然一直处于连接状态
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}