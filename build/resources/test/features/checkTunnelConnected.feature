Feature: Check Tunnel is connected
  Scenario: Check tunnel connection is established
    Given I unlock the phone and enter to Tunnel
    And I wait "10" seconds
    Then I check the msg "connected.." is displayed