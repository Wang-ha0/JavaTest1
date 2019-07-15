package com.hand.exam2.pojo;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:42
 * @Version 1.0.0
 */
public class City {
    private Integer cityId;
    private String city;


    public City() {
    }

    public City(Integer cityId, String city) {
        this.cityId = cityId;
        this.city = city;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", city='" + city + '\'' +
                '}';
    }
}
