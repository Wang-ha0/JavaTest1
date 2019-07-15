package com.hand.exam2.dao;

import com.hand.exam2.pojo.Film;

import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 15:08
 * @Version 1.0.0
 */
public interface FilmDao {
    List<Film> listFilmsByCustomerId(Integer CustomerId);

    List<Film> listFilmsByIds(List<Integer> ids);
}
