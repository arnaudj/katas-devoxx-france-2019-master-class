package org.paumard.devoxxfr2019.tdd.E_MovieRental.model.price;

import org.paumard.devoxxfr2019.tdd.E_MovieRental.model.Movie;

public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}