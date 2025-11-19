Feature: Validating place API's

Scenario: Verify if place is being added by AdddPlaceAPI
Given Add Place Payload
When user calls "AddPlaceAPI" with post method http request
Then the API call got success with status code 200
And "status" in response body is "OK"