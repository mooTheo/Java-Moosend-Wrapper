/*
 * Moosend API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreatingACustomFieldRequest;
import io.swagger.client.model.CreatingACustomFieldResponse;
import io.swagger.client.model.CreatingAMailingListRequest;
import io.swagger.client.model.CreatingAMailingListResponse;
import io.swagger.client.model.DeletingAMailingListResponse;
import io.swagger.client.model.GettingAllActiveMailingListsResponse;
import io.swagger.client.model.GettingAllActiveMailingListsWithPagingResponse;
import io.swagger.client.model.GettingMailingListDetailsResponse;
import io.swagger.client.model.RemovingACustomFieldResponse;
import io.swagger.client.model.UpdatingACustomFieldRequest;
import io.swagger.client.model.UpdatingACustomFieldResponse;
import io.swagger.client.model.UpdatingAMailingListRequest;
import io.swagger.client.model.UpdatingAMailingListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MailingListsApi
 */
@Ignore
public class MailingListsApiTest {

    private final MailingListsApi api = new MailingListsApi();

    
    /**
     * Creating a custom field
     *
     * Creates a new custom field in the specified mailing list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void creatingACustomFieldTest() throws ApiException {
        String format = null;
        String apikey = null;
        String mailingListID = null;
        CreatingACustomFieldRequest body = null;
        CreatingACustomFieldResponse response = api.creatingACustomField(format, apikey, mailingListID, body);

        // TODO: test validations
    }
    
    /**
     * Creating a mailing list
     *
     * Creates a new empty mailing list in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void creatingAMailingListTest() throws ApiException {
        String format = null;
        String apikey = null;
        CreatingAMailingListRequest body = null;
        CreatingAMailingListResponse response = api.creatingAMailingList(format, apikey, body);

        // TODO: test validations
    }
    
    /**
     * Deleting a mailing list
     *
     * Deletes a mailing list from your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletingAMailingListTest() throws ApiException {
        String format = null;
        String apikey = null;
        String mailingListID = null;
        DeletingAMailingListResponse response = api.deletingAMailingList(format, apikey, mailingListID);

        // TODO: test validations
    }
    
    /**
     * Getting all active mailing lists
     *
     * Gets a list of your active mailing lists in your account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gettingAllActiveMailingListsTest() throws ApiException {
        String format = null;
        String apikey = null;
        String withStatistics = null;
        String shortBy = null;
        String sortMethod = null;
        GettingAllActiveMailingListsResponse response = api.gettingAllActiveMailingLists(format, apikey, withStatistics, shortBy, sortMethod);

        // TODO: test validations
    }
    
    /**
     * Getting all active mailing lists with paging
     *
     * Gets a list of your active mailing lists in your account. Because the results for this call could be quite big, paging information is required as input.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gettingAllActiveMailingListsWithPagingTest() throws ApiException {
        String format = null;
        String apikey = null;
        Double page = null;
        Double pageSize = null;
        String shortBy = null;
        String sortMethod = null;
        GettingAllActiveMailingListsWithPagingResponse response = api.gettingAllActiveMailingListsWithPaging(format, apikey, page, pageSize, shortBy, sortMethod);

        // TODO: test validations
    }
    
    /**
     * Getting mailing list details
     *
     * Gets details for a given mailing list. You may include subscriber statistics in your results or not. Any segments existing for the requested mailing list will not be included in the results.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gettingMailingListDetailsTest() throws ApiException {
        String format = null;
        String mailingListID = null;
        String apikey = null;
        String withStatistics = null;
        GettingMailingListDetailsResponse response = api.gettingMailingListDetails(format, mailingListID, apikey, withStatistics);

        // TODO: test validations
    }
    
    /**
     * Removing a custom field
     *
     * Removes a custom field definition from the specified mailing list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removingACustomFieldTest() throws ApiException {
        String format = null;
        String customFieldID = null;
        String apikey = null;
        String mailingListID = null;
        RemovingACustomFieldResponse response = api.removingACustomField(format, customFieldID, apikey, mailingListID);

        // TODO: test validations
    }
    
    /**
     * Updating a custom field
     *
     * Updates the properties of an existing custom field in the specified mailing list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatingACustomFieldTest() throws ApiException {
        String format = null;
        String customFieldID = null;
        String apikey = null;
        String mailingListID = null;
        UpdatingACustomFieldRequest body = null;
        UpdatingACustomFieldResponse response = api.updatingACustomField(format, customFieldID, apikey, mailingListID, body);

        // TODO: test validations
    }
    
    /**
     * Updating a mailing list
     *
     * Updates the properties of an existing mailing list.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatingAMailingListTest() throws ApiException {
        String format = null;
        String apikey = null;
        String mailingListID = null;
        UpdatingAMailingListRequest body = null;
        UpdatingAMailingListResponse response = api.updatingAMailingList(format, apikey, mailingListID, body);

        // TODO: test validations
    }
    
}
