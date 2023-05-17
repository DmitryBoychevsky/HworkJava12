package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

public class MovieManagerTest {

    Movie movie1 = new Movie("Бладшот", "боевик", 1);
    Movie movie2 = new Movie("Вперёд", "мультфильм", 2);
    Movie movie3 = new Movie("Отель Белград", "комедия", 3);
    Movie movie4 = new Movie("Джентельмены", "боевик", 4);
    Movie movie5 = new Movie("Человек-невидимка", "ужасы", 5);
    Movie movie6 = new Movie("Тролли. Мировой тур", "мультфильм", 6);
    Movie movie7 = new Movie("Номер один", "комедия", 7);

    @Test
    public void noMovies() {
        MovieManager manager = new MovieManager();

        Movie[] expected = {};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);

        Movie[] expected = {movie1};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFourMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);

        Movie[] expected = {movie1, movie2, movie3, movie4};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addSevenMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEqual() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        Movie[] expected = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMin() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMax() {
        MovieManager manager = new MovieManager(2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);

        Movie[] expected = {movie5, movie4};
        Movie[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
