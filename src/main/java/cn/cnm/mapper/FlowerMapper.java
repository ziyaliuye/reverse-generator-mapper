package cn.cnm.mapper;

import cn.cnm.pojo.Flower;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface FlowerMapper extends Mapper<Flower> {
    /*
     * 自定义SQL
     */
    List<Flower> mySelect();
}