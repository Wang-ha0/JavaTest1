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
        List<City> cities = cityService.listCitiesByCountryId(Integer.parseInt(PropertiesUtils.getValue("countryId")));
        System.out.println(cities);
        FilmServiceImpl filmService = new FilmServiceImpl();
        List<Film> films = filmService.listFilmsByCustomerId(Integer.parseInt(PropertiesUtils.getValue("customerId")));
        System.out.println(films);
    }

}
