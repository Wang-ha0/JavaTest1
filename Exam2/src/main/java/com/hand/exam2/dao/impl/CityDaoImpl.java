package com.hand.exam2.dao.impl;

import com.hand.exam2.dao.CityDao;
import com.hand.exam2.pojo.City;
import com.hand.exam2.pojo.Country;
import com.hand.exam2.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:46
 * @Version 1.0.0
 */
public class CityDaoImpl implements CityDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    @Override
    public List<City> listCitiesByCountryId(Integer countryId) {
        List<City> cities = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select city_id,city from city where country_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,countryId);
            ResultSet resultSet = pstmt.executeQuery();
            City city = null;
            while(resultSet.next()){
                city = new City();
                city.setCityId(resultSet.getInt(1));
                city.setCity(resultSet.getString(1));
                cities.add(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
        return cities;
    }
}
