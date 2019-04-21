package org.paumard.devoxxfr2019.tdd.E_MovieRental.model.price;

import org.paumard.devoxxfr2019.tdd.E_MovieRental.model.Movie;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}