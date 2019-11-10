package cn.cnm.pojo;

import javax.persistence.*;

public class Flower {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 花名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 价格
     */
    private Float price;

    /**
     * 原产地
     */
    private String production;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取花名
     *
     * @return NAME - 花名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置花名
     *
     * @param name 花名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取原产地
     *
     * @return production - 原产地
     */
    public String getProduction() {
        return production;
    }

    /**
     * 设置原产地
     *
     * @param production 原产地
     */
    public void setProduction(String production) {
        this.production = production == null ? null : production.trim();
    }
}