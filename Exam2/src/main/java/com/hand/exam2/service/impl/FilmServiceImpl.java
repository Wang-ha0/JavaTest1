package com.hand.exam2.service.impl;

import com.hand.exam2.dao.FilmDao;
import com.hand.exam2.dao.impl.FilmDaoImpl;
import com.hand.exam2.pojo.Film;
import com.hand.exam2.service.FilmService;

import java.util.List;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 15:08
 * @Version 1.0.0
 */
public class FilmServiceImpl implements FilmService {
    private FilmDao filmDao = new FilmDaoImpl();
    @Override
    public List<Film> listFilmsByCustomerId(Integer CustomerId) {
        return filmDao.listFilmsByCustomerId(CustomerId);
    }


}
