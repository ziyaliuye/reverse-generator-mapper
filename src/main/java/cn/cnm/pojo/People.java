package cn.cnm.pojo;

import javax.persistence.*;

public class People {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 名字
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    private Integer flowerid;

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
     * 获取名字
     *
     * @return NAME - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return flowerid
     */
    public Integer getFlowerid() {
        return flowerid;
    }

    /**
     * @param flowerid
     */
    public void setFlowerid(Integer flowerid) {
        this.flowerid = flowerid;
    }
}