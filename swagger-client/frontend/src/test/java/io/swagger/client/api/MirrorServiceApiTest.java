/*
 * Example of REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * API tests for MirrorServiceApi
 */

public class MirrorServiceApiTest {

    private final MirrorServiceApi api = new MirrorServiceApi();

    
    /**
     * Reflects value back
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reflectUsingGETTest() throws ApiException {
        String response = api.reflectUsingGET("some text");
        assertEquals("some text (reflected)", response);

        // TODO: test validations
    }
    
}
