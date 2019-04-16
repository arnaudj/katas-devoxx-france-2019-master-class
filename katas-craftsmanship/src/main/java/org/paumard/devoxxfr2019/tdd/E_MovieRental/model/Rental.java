/*
 * This class is copied from the book Refactoring by Martin Fowler
 * and provided here for convenience only. The copyright is the
 * property of the original authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.paumard.devoxxfr2019.tdd.E_MovieRental.model;

public class Rental {

    private Tape _tape;
    private int _daysRented;

    public Rental(Tape tape, int daysRented) {
        _tape = tape;
        _daysRented = daysRented;
    }

    public int daysRented() {
        return _daysRented;
    }

    public Tape tape() {
        return _tape;
    }

    public double getCharge() {
        //determine amounts for each line
        double thisAmount = 0;
        switch (tape().movie().priceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented() > 2)
                    thisAmount += (daysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented() > 3)
                    thisAmount += (daysRented() - 3) * 1.5;
                break;

        }
        return thisAmount;
    }

    public int getFrequentRenterPoints() {
        // add frequent renter points
        // add bonus for a two day new release rental
        if ((tape().movie().priceCode() == Movie.NEW_RELEASE) && daysRented() > 1)
            return 2;
        return 1;
    }
}