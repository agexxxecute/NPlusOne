package org.nplusone;

import org.nplusone.service.DirectorService;
import org.nplusone.service.MovieService;

public class App {
    public static void main(String[] args) {
        DirectorService directorService = new DirectorService();
        MovieService movieService = new MovieService();
        System.out.println(directorService.findById(1));
    }
}
