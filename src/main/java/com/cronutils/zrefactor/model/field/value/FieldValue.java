package com.cronutils.zrefactor.model.field.value;

/*
 * Copyright 2015 jmrozanec
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Encapsulates a field value, allowing us to
 * manipulate different types of values in a homogeneous way
 * @param <T>
 */
public abstract class FieldValue<T> {
    /**
     * Allows to obtain the value
     * @return some value, never null
     */
    public abstract T getValue();

    /**
     * String representation of encapsulated value.
     * @return String, never null
     */
    public final String toString(){
        return String.format("%s", getValue());
    }
}

