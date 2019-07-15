package com.hand.exam2.pojo;

import java.util.Date;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author 王灏
 * @Date 2019/7/15 14:59
 * @Version 1.0.0
 */
public class Film {
    private Integer filmId;
    private String title;
    private Date rentalDate;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", rentalDate=" + rentalDate +
                '}';
    }
}
