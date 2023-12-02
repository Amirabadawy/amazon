Feature: Check Product Search and Add to Cart Functionality

  Scenario Outline: Validate E2E scenario for creating an order
    Given click on sign up button in home page
    And enter phone number "<phoneNumber>" in sign up form
    And click on continue button in sign up form
    And enter password "<password>" in sign up form
    And click on submit button in sign up form
    When enter search text "<searchText>" on search bar in home page
    And click on search button in home page
    And select product from the search results in home page
    And add the product to the cart in home page
    And click on cart button in home page
    And click on proceed checkout button in cart page
    Then place order button should be displayed
    And product "<product>" should be displayed


    Examples:
      | phoneNumber | password   | searchText        | product |
      | 01015708282 | am123456   | iphone 15 pro max |    اي اس ار جراب لموبايل ايفون 15 برو ماكس، متوافق مع ماج سيف، حماية من الدرجة العسكرية، مقاوم للاصفرار، ظهر مقاوم للخدش، جراب موبايل مغناطيسي لموبايل ايفون 15 برو ماكس، سلسلة كلاسيكية، شفاف |

