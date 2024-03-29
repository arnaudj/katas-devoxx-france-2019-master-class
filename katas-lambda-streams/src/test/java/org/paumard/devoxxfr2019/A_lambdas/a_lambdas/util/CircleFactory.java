/*
 * Copyright (C) 2019 José Paumard
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

package org.paumard.devoxxfr2019.A_lambdas.a_lambdas.util;

import org.paumard.devoxxfr2019.A_lambdas.a_lambdas.model.Circle;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface CircleFactory extends Supplier<Circle> {

    static CircleFactory createFactory(Supplier<Circle> supplier) {
        return supplier::get;
    }

    static CircleFactory createFactory(Function<String, Circle> ctor, String color) {
        return () -> ctor.apply(color);
    }

    default List<Circle> getThree() {
        //return List.of(get(), get(), get());
        return IntStream.range(0, 3)
                .mapToObj(index -> get())
                .collect(Collectors.toList());
    }
}
