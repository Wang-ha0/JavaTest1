package com.hand.exam2.service.impl;

import com.hand.exam2.dao.CityDao;
import com.hand.exam2.dao.impl.CityDaoImpl;
import com.hand.exam2.pojo.City;
import com.hand.exam2.service.CityService;

import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:44
 * @Version 1.0.0
 */
public class CityServiceImpl implements CityService {
    private CityDao cityDao =  new CityDaoImpl();

    @Override
    public List<City> listCitiesByCountryId(Integer countryId) {
        return cityDao.listCitiesByCountryId(countryId);
    }
}
