/*
 * Copyright (C) 2017 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package com.authlete.common.api;


/**
 * Settings of {@link AuthleteApi} implementation.
 *
 * @author Takahiko Kawasaki
 *
 * @since 2.9
 */
public class Settings
{
    private int connectionTimeout;
    private int readTimeout;


    /**
     * Get the timeout value in milliseconds for socket connection.
     * The default value is 0 and it means an infinite timeout.
     *
     * @return
     *         The connection timeout value in milliseconds.
     */
    public int getConnectionTimeout()
    {
        return connectionTimeout;
    }


    /**
     * Set the timeout value in milliseconds for socket connection.
     * A timeout of zero is interpreted as an infinite timeout.
     *
     * <p>
     * JAX-RS Client API has not standardized the way to set a
     * connection timeout value. Therefore, if <a href=
     * "https://github.com/authlete/authlete-java-jaxrs"
     * >authlete-java-jaxrs</a> is used as {@link AuthleteApi}
     * implementation and if the JAX-RS Client implementation
     * is not supported by the implementation of {@code
     * setConnectionTimeout()} of authlete-java-jaxrs, the value
     * given to {@code setConnectionTimeout()} won't have any
     * effect. See README in authlete-java-jaxrs for details.
     * </p>
     *
     * @param timeout
     *         The connection timeout value in milliseconds.
     *
     * @return
     *         {@code this} object.
     *
     * @throws IllegalArgumentException
     *         The given timeout value is negative.
     */
    public Settings setConnectionTimeout(int timeout)
    {
        if (timeout < 0)
        {
            throw new IllegalArgumentException("timeout value cannot be negative.");
        }

        this.connectionTimeout = timeout;

        return this;
    }


    /**
     * Get the read timeout in milliseconds.
     *
     * @return
     *         The read timeout in milliseconds.
     *
     * @since 2.10
     */
    public int getReadTimeout()
    {
        return readTimeout;
    }


    /**
     * Set the read timeout in milliseconds.
     * A timeout of zero is interpreted as an infinite timeout.
     *
     * <p>
     * JAX-RS Client API has not standardized the way to set
     * a read timeout value. Therefore, if <a href=
     * "https://github.com/authlete/authlete-java-jaxrs"
     * >authlete-java-jaxrs</a> is used as {@link AuthleteApi}
     * implementation and if the JAX-RS Client implementation
     * is not supported by the implementation of {@code
     * setReadTimeout()} of authlete-java-jaxrs, the value
     * given to {@code setReadTimeout()} won't have any effect.
     * See README in authlete-java-jaxrs for details.
     * </p>
     *
     * @param timeout
     *         The read timeout in milliseconds.
     *
     * @return
     *         {@code this} object.
     *
     * @since 2.10
     */
    public Settings setReadTimeout(int timeout)
    {
        if (timeout < 0)
        {
            throw new IllegalArgumentException("timeout value cannot be negative.");
        }

        this.readTimeout = timeout;

        return this;
    }
}
