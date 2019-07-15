package com.hand.exam2;


import com.hand.exam2.pojo.City;
import com.hand.exam2.pojo.Film;
import com.hand.exam2.service.CityService;
import com.hand.exam2.service.impl.CityServiceImpl;
import com.hand.exam2.service.impl.FilmServiceImpl;
import com.hand.exam2.util.PropertiesUtils;

import java.io.IOException;
import java.util.List;


public class Application {

    public static void main(String[] args) throws IOException {
        CityService cityService = new CityServiceImpl();
        int countryId = Integer.parseInt(PropertiesUtils.getValue("countryId"));
        List<City> cities = cityService.listCitiesByCountryId(countryId);
        System.out.println("Country ID:" + countryId);
        System.out.println("城市 ID | 城市名称");
        for (City city : cities) {
            System.out.println(city.getCityId() + " | " + city.getCity());
        }
        FilmServiceImpl filmService = new FilmServiceImpl();
        int customerId = Integer.parseInt(PropertiesUtils.getValue("customerId"));
        List<Film> films = filmService.listFilmsByCustomerId(customerId);
        System.out.println("Customer ID:" + customerId);
        System.out.println("Film ID | Film 名称 | 租用时间");
        for (Film film : films) {
            System.out.println(film.getFilmId() + " | " + film.getTitle() + " | " + film.getRentalDate());
        }
    }

}
