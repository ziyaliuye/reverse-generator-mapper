package cn.cnm.pojo;

import javax.persistence.*;

public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "portName")
    private String portname;

    @Column(name = "cityName")
    private String cityname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return portName
     */
    public String getPortname() {
        return portname;
    }

    /**
     * @param portname
     */
    public void setPortname(String portname) {
        this.portname = portname == null ? null : portname.trim();
    }

    /**
     * @return cityName
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * @param cityname
     */
    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }
}