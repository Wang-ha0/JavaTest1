package com.hand.exam2.dao.impl;

import com.hand.exam2.dao.FilmDao;
import com.hand.exam2.pojo.City;
import com.hand.exam2.pojo.Film;
import com.hand.exam2.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 15:09
 * @Version 1.0.0
 */
public class FilmDaoImpl implements FilmDao {
    Connection conn = null;
    PreparedStatement pstmt = null;
    @Override
    public List<Film> listFilmsByCustomerId(Integer CustomerId) {
        List<Film> films = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            String sql = " SELECT f.film_id,f.title,r.rental_date " +
                    " FROM customer c,rental r,inventory i, film f " +
                    " WHERE c.customer_id = ? AND c.customer_id = r.customer_id AND r.inventory_id = i.inventory_id AND i.film_id = f.film_id" +
                    " ORDER BY r.return_date DESC ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,CustomerId);
            ResultSet resultSet = pstmt.executeQuery();
            Film film = null;
            while(resultSet.next()){
                film = new Film();
                film.setFilmId(resultSet.getInt(1));
                film.setTitle(resultSet.getString(2));
                film.setRentalDate(new Date(resultSet.getDate(3).getTime()));
                films.add(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
        return films;
    }

    @Override
    public List<Film> listFilmsByIds(List<Integer> ids) {
        return null;
    }
}
