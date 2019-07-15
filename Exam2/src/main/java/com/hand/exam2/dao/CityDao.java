package com.hand.exam2.dao;

import com.hand.exam2.pojo.City;

import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:45
 * @Version 1.0.0
 */
public interface CityDao {
    List<City> listCitiesByCountryId(Integer countryId);
}
