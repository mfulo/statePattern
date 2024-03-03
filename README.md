## Problem Scenario
A bank needs to manage different states of customer accounts, including active, suspended, and closed. Each state has specific rules and restrictions regarding allowed operations, and accounts have associated attributes like account number and balance.
* Active accounts: Allow deposits and withdrawals. <br>
* Suspended accounts: Disallow deposits and withdrawals transactions, but allow viewing account information. <br>
* Closed accounts: Disallow all transactions and viewing of account information. 

<br>

Currently, the system relies on conditional statements within the Account class to check the account state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows. Implement the State pattern to improve code maintainability and flexibility:
* Define Account States: Create separate classes representing different account states: ActiveState, SuspendedState, and ClosedState. <br>
* Implement State Interface: Define an interface AccountState with methods for common actions like deposit, withdraw, activate, suspend, and close. <br>
* Implement State Behaviors: Each concrete state class implements the AccountState interface, providing specific behavior for its respective state. For example, the ActiveState class would allow deposits and withdrawals, while the ClosedState wouldn't allow any transactions. <br>
* Update Account Class: <br>
  * Include attributes for accountNumber and balance. <br>
  * Remove state-specific logic from the Account class.
  * Introduce a reference to the current AccountState object.
  * Delegate actions like deposit, withdraw, activate, suspend, and close to the current state object through its corresponding methods.
 
## UML Diagram

## Sample Output
![image](https://github.com/mfulo/statePattern/assets/142382665/a0dde9c5-2ee7-4ca9-8448-8124d4f65c0f)
![image](https://github.com/mfulo/statePattern/assets/142382665/ff0bd79b-5c21-4f84-8640-1cd20000ce82)

