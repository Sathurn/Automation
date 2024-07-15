Feature: Calendar Test

  Scenario Outline: User creates a calendar event
    Given User is logged in with email "<email>", password "<password>" and phone number "<phoneNumber>"
    When User navigates to the specific day "<date>"
    And User creates a new event "<eventText>"
    Then The event "<eventText>" is present in the calendar
    Examples:
    |email|password|phoneNumber|date|eventText|
    |   testuser2@email.com  |    1234    |       123456    |  2024-07-15  |     Training with Ana    |
    |   testuser4@email.com  |    2345    |       456789    |  2024-07-15  |     Training with Bob    |