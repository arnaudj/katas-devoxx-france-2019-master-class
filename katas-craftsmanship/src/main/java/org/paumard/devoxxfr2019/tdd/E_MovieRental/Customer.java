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

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + name() + "\n";
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            double thisAmount = rental.getCharge();
            totalAmount += thisAmount;
            frequentRenterPoints += rental.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + rental.tape().movie().name() + "\t" + thisAmount + "\n";

        }
        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;

    }

    private String name() {
        return _name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
}
