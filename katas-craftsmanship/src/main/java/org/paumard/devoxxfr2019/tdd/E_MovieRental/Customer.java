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

package org.paumard.devoxxfr2019.tdd.E_MovieRental;

import org.paumard.devoxxfr2019.tdd.E_MovieRental.model.Rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<>();

    public Customer(String name) {
        _name = name;
    }

    public String statement() {

        String result = "Rental Record for " + name() + "\n";
        for (Rental rental : _rentals) {
            result += "\t" + rental.tape().movie().name() + "\t" + rental.getCharge() + "\n";

        }
        //add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;

    }

    private double getTotalCharge() {
        return _rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

    private int getTotalFrequentRenterPoints() {
        return _rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }

    private String name() {
        return _name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
}
