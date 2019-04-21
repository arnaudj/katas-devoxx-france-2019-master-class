package org.paumard.devoxxfr2019.tdd.E_MovieRental.model.price;

import org.paumard.devoxxfr2019.tdd.E_MovieRental.model.Movie;

public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}