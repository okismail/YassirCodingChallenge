**Yassir Coding Challenge** 
-
Part 1
-

**Proposed Testcases**

**Weather:**

1- Check the response for a valid location

2- Check the response for an invalid location

3- Check the response without sending the "query" parameter

4- Check the response without sending the "access_key" parameter

5- Check the response while sending an invalid "access_key"
___

**Random Advice:**

1- Check that the advice is displayed and the response is not null

2- Check the response when sending the incorrect field name

___
The project is divided in 2 parts, the "main" folder which has the setup and the BaseURI in "BaseTest" and the test case in the "test" folder. 
Each test case is in a separate class so that it can be enabled, disabled, updated or deleted as needed. All the test cases are run from the "TestNG" file
___
Part 3
-

1. The actions that I would take will be:
    1. Check the web and mobile use cases and test cases
    2. Determine the cases that should be automated
    3. Check the existing Automation framework and understand it (through documents, reviewing the code and discussion
       with QA members)
    4. Check the existing test case coverage
    5. If there is a pipeline (CI/CD) then I will check the history of the previous runs
    6. Check the performance/runtime of the automation
    7. Discuss with team member how to improve/enhance the API automation

___

2. I have never used contract testing before, but I searched about it and this is what I would do
    1. I would use Pact as a contract testing tool
    2. Scenario: User has some items in the cart and should pay. We will have 2 contracts:
        1. The first contract is for the order, to verify what the Payment should provide. This test will verify that
           the order expects a specific contract from the payment
        2. The second contract is for the payment, will validate by ensuring it responds in the way the order expects.
           This test ensures that the payment correctly handles the contract by receiving the expected requests and
           providing the correct responses.