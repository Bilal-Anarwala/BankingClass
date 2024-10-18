# BankingClass

## Introduction

This project is a Java-based application designed to demonstrate and practice Object-Oriented Programming (OOP) concepts. It simulates basic ATM functionalities, providing a practical example of how OOP principles can be applied in real-world scenarios.

## Project Purpose

The primary goal of this project is to serve as a learning tool for Java developers looking to strengthen their understanding of OOP. By implementing a simplified ATM system, this project showcases:

1. Class design and implementation
2. Encapsulation of data and behaviors
3. Object relationships and interactions
4. Basic security concepts (e.g., PIN hashing)

## Project Structure

The project is organized into five main Java classes, each representing a key component of the ATM system:

1. `ATM.java`: The main class that runs the ATM simulation.
2. `Bank.java`: Represents the bank, managing users and accounts.
3. `User.java`: Represents a bank user with personal information and accounts.
4. `Account.java`: Represents a bank account with associated transactions.
5. `Transaction.java`: Represents individual financial transactions.

## Detailed Class Descriptions

### ATM Class
- **Purpose**: Serves as the entry point of the application and manages the user interface.
- **Key Methods**:
  - `main(String[] args)`: Initializes the system and runs the main program loop.
  - `mainMenuPrompt(Bank theBank, Scanner s)`: Handles the main menu interface for user login.
- **OOP Concepts Demonstrated**:
  - Static methods
  - Object composition (using Bank and User objects)

### Bank Class
- **Purpose**: Manages the overall banking system, including users and accounts.
- **Key Methods**:
  - `getNewUserUUID()` and `getNewAccountUUID()`: Generate unique identifiers for users and accounts.
  - `addUser(String firstName, String lastName, String pin)`: Creates a new user and a default savings account.
  - `userLogin(String userID, String pin)`: Authenticates users.
- **OOP Concepts Demonstrated**:
  - Encapsulation of user and account data
  - Object creation and management
  - Use of ArrayList for dynamic object storage

### User Class
- **Purpose**: Represents a bank customer with personal details and account information.
- **Key Methods**:
  - `validatePin(String aPin)`: Securely validates the user's PIN.
  - `addAccount(Account anAcct)`: Associates an account with the user.
- **OOP Concepts Demonstrated**:
  - Encapsulation of personal data
  - Use of MessageDigest for PIN hashing (basic security implementation)
  - Association relationship with Account class

### Account Class
- **Purpose**: Represents a bank account with its transactions.
- **Key Methods**:
  - `getUUID()`: Returns the unique identifier of the account.
- **OOP Concepts Demonstrated**:
  - Encapsulation of account data
  - Aggregation relationship with Transaction class

### Transaction Class
- **Purpose**: Represents individual financial transactions within an account.
- **Key Features**:
  - Stores transaction amount, timestamp, memo, and associated account.
- **OOP Concepts Demonstrated**:
  - Encapsulation of transaction data
  - Association relationship with Account class

## Object-Oriented Programming Concepts Showcase

This project demonstrates several key OOP concepts:

1. **Encapsulation**: Each class encapsulates its data and provides methods to interact with that data. For example, the User class encapsulates personal information and PIN validation.

2. **Abstraction**: The classes provide abstract representations of real-world entities (Bank, User, Account), hiding complex implementations behind simple interfaces.

3. **Association**: The project showcases various types of associations between classes. For example:
   - One-to-many relationship between Bank and User/Account
   - One-to-many relationship between User and Account
   - One-to-many relationship between Account and Transaction

4. **Composition**: The Bank class is composed of User and Account objects, demonstrating object composition.

5. **Method Overloading**: Demonstrated in the Transaction class with multiple constructors.

6. **Access Modifiers**: Proper use of private and public access modifiers to control access to class members.

7. **Static Methods**: Used in the ATM class for utility functions like `mainMenuPrompt`.

## Current State and Future Enhancements

The project is currently in a developmental stage with basic structure implemented. Future enhancements could include:

1. Implementing the `printUserMenu` method in the ATM class.
2. Adding functionality for deposits, withdrawals, and transfers.
3. Implementing balance checking and transaction history viewing.
4. Enhancing error handling and input validation.
5. Adding persistence (file or database storage).
6. Implementing more robust security measures.
