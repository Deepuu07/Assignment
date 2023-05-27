# Assignment
Posted For Assignment:

Test Cases:

Test Case 1: Scenario: Successful payment and order placement for
five items.

1. Preconditions:

• User is logged in to Amazon.

• User has added items x, y, z, a, and b to the cart.

• User is on the checkout page.

2. Steps:

• Select delivery address and click use this address button.

• Select payment method (Cash on Delivery/Pay on Delivery) and click Use this

payment method button.

• Review items and delivery.

• Click on the "Place Order" button.

3. Expected Results:

• The order is successfully placed.

• User receives an order confirmation message or email.

• User is redirected to the order confirmation page.

• The order status should show like “Order placed, thank you”.

Test Case 2: Scenario: Amazon cart should be empty after Successful
order.

1. Preconditions:

• User is logged in to Amazon.

• User has added items x, y, z, a, and b to the cart.

• User has successfully placed the order.

2. Steps:

• Navigate to the cart.

• Verify Items (x, y, z, a, and b) are removed from the user's cart.

• Verify the amazon cart is empty or not.

3. Expected Results:

• The amazon cart should be empty.

• It should show a message like “Your Amazon Cart is empty”

Test Case 3: Scenario: proceed to buy orders in empty cart

1. Preconditions:

• User is logged in to Amazon.

• User should have an Empty cart.

2. Steps:

• If available try to Click Proceed to buy button.

3. Expected Results:

• The page should stay on the same page.

• Proceed to buy button should not present on the page.

Click to see the code: https://github.com/Deepuu07/Assignment/blob/main/src/main/java/base/java/Base.java

Click to see the code: https://github.com/Deepuu07/Assignment/blob/main/src/test/java/amazontest/TC001.java





