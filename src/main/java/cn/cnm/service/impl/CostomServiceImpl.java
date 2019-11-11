package cn.cnm.service.impl;

import cn.cnm.mapper.CostomFlowerMapper;
import cn.cnm.mapper.FlowerMapper;
import cn.cnm.pojo.Flower;
import cn.cnm.service.CostomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author lele
 * @version 1.0
 * @Description
 * @Email 414955507@qq.com
 * @date 2019/11/11 11:31
 */
public class CostomServiceImpl implements CostomService {
    @Autowired
    private CostomFlowerMapper costomFlowerMapper;

    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public List<Flower> getAll() {
        return costomFlowerMapper.selectAll();
    }

    @Override
    public List<Flower> mySelect() {
        return flowerMapper.mySelect();
    }
}
