package com.hand.exam2.service;

import com.hand.exam2.pojo.Film;

import java.util.List;


/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 15:05
 * @Version 1.0.0
 */
public interface FilmService {
    List<Film> listFilmsByCustomerId(Integer CustomerId);

}
