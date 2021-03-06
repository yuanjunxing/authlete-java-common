/*
 * Copyright (C) 2019 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.authlete.common.dto;


import java.io.Serializable;


/**
 * Request to Authlete's {@code /api/pushed_auth_req} API.
 *
 * <p>
 * The authorization server can implement a pushed authorization request
 * endpoint which is defined in "OAuth 2.0 Pushed Authorization Requests"
 * by using the Authlete API.
 * </p>
 *
 * <p>
 * Request parameters to the API are as follows.
 * </p>
 *
 * <blockquote>
 * <dl>
 *
 * <dt><b><code>parameters</code></b> (REQUIRED)</dt>
 * <dd>
 * <p>
 * Request parameters that the pushed authorization request endpoint of the
 * authorization server implementation received from the client application.
 * Its format is {@code application/x-www-form-urlencoded}.
 * </p>
 * </dd>
 *
 * <dt><b><code>clientId</code></b> (OPTIONAL)</dt>
 * <dd>
 * <p>
 * The client ID extracted from the {@code Authorization} header of the request
 * to the pushed authorization request endpoint.
 * </p>
 * <p>
 * If the pushed authorization request endpoint of the authorization server
 * implementation supports Basic Authentication as a means of client
 * authentication, and the request from the client application contained its
 * client ID in the {@code Authorization} header, the value should be extracted
 * and set to this parameter.
 * </p>
 * </dd>
 *
 * <dt><b><code>clientSecret</code></b> (OPTIONAL)</dt>
 * <dd>
 * <p>
 * The client secret extracted from the {@code Authorization} header of the
 * request to the pushed authorization request endpoint.
 * </p>
 * <p>
 * If the pushed authorization request endpoint of the authorization server
 * implementation supports Basic Authentication as a means of client
 * authentication, and the request from the client application contained its
 * client secret in the {@code Authorization} header, the value should be
 * extracted and set to this parameter.
 * </p>
 * </dd>
 *
 * <dt><b><code>clientCertificate</code></b> (OPTIONAL)</dt>
 * <dd>
 * <p>
 * The client certificate used in the TLS connection between the client
 * application and the pushed authorization request endpoint of the
 * authorization server.
 * </p>
 * </dd>
 *
 * <dt><b><code>clientCertificatePath</code></b> (OPTIONAL)</dt>
 * <dd>
 * <p>
 * The client certificate path presented by the client during client
 * authentication. Each element is a string in PEM format.
 * </p>
 * </dd>
 *
 * </dl>
 * </blockquote>
 *
 * @since 2.51
 */
public class PushedAuthReqRequest implements Serializable
{
    private static final long serialVersionUID = 1L;


    /**
     * Request parameters of the request to the pushed authorization request
     * endpoint.
     */
    private String parameters;


    /**
     * Client ID extracted from the Authorization header.
     */
    private String clientId;


    /**
     * Client secret extracted from the Authorization header.
     */
    private String clientSecret;


    /**
     * Client certificate.
     */
    private String clientCertificate;


    /**
     * Client certificate path.
     */
    private String[] clientCertificatePath;


    /**
     * Get the request parameters that the pushed authorization request
     * endpoint received from the client application.
     *
     * @return
     *         Request parameters in {@code application/x-www-form-urlencoded}
     *         format.
     */
    public String getParameters()
    {
        return parameters;
    }


    /**
     * Set the request parameters that the pushed authorization request
     * endpoint received from the client application.
     *
     * @param parameters
     *         Request parameters in {@code application/x-www-form-urlencoded}
     *         format.
     *
     * @return
     *         {@code this} object.
     */
    public PushedAuthReqRequest setParameters(String parameters)
    {
        this.parameters = parameters;

        return this;
    }


    /**
     * Get the client ID extracted from the {@code Authorization} header of the
     * request to the pushed authorization request endpoint.
     *
     * @return
     *         The client ID.
     */
    public String getClientId()
    {
        return clientId;
    }


    /**
     * Set the client ID extracted from the {@code Authorization} header of the
     * request to the pushed authorization request endpoint.
     *
     * @param clientId
     *         The client ID.
     *
     * @return
     *         {@code this} object.
     */
    public PushedAuthReqRequest setClientId(String clientId)
    {
        this.clientId = clientId;

        return this;
    }


    /**
     * Get the client secret extracted from the {@code Authorization} header of
     * the request to the pushed authorization request endpoint.
     *
     * @return
     *         The client secret.
     */
    public String getClientSecret()
    {
        return clientSecret;
    }


    /**
     * Set the client secret extracted from the {@code Authorization} header of
     * the request to the pushed authorization request endpoint.
     *
     * @param clientSecret
     *         The client secret.
     *
     * @return
     *         {@code this} object.
     */
    public PushedAuthReqRequest setClientSecret(String clientSecret)
    {
        this.clientSecret = clientSecret;

        return this;
    }


    /**
     * Get the client certificate used in the TLS connection between the client
     * application and the pushed authorization request endpoint.
     *
     * @return
     *         The client certificate.
     */
    public String getClientCertificate()
    {
        return clientCertificate;
    }


    /**
     * Set the client certificate used in the TLS connection between the client
     * application and the pushed authorization request endpoint.
     *
     * @param certificate
     *         The client certificate.
     *
     * @return
     *         {@code this} object.
     */
    public PushedAuthReqRequest setClientCertificate(String certificate)
    {
        this.clientCertificate = certificate;

        return this;
    }


    /**
     * Get the client certificate path presented by the client during client
     * authentication.
     *
     * @return
     *          The client certificate path. Each element is a string in PEM
     *          format.
     */
    public String[] getClientCertificatePath()
    {
        return clientCertificatePath;
    }


    /**
     * Set the client certificate path presented by the client during client
     * authentication.
     *
     * @param path
     *         The client certificate path.
     *
     * @return
     *         {@code this} object.
     */
    public PushedAuthReqRequest setClientCertificatePath(String[] path)
    {
        this.clientCertificatePath = path;

        return this;
    }
}
