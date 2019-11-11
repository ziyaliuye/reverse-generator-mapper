package cn.cnm.custom;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * @author lele
 * @version 1.0
 * @Description 定义一个接口，需要和Mapper接口一样定义一个泛型
 * 继承Mapper接口或者它的子接口, 可以继承多个接口自由组合
 * @Email 414955507@qq.com
 * @date 2019/11/11 11:05
 */
public interface MyMapper<T> extends SelectAllMapper<T>, SelectByExampleMapper<T> {
}
