package org.paumard.devoxxfr2019.tdd.E_MovieRental.model.price;

import org.paumard.devoxxfr2019.tdd.E_MovieRental.model.Movie;

public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

}