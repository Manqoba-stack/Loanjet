Peer-to-Peer Fiat Lending App
The Peer-to-Peer (P2P) Fiat Lending App is a Spring Boot application that enables users to lend and borrow fiat currency directly from one another. This README file provides an overview of the application, its features, and instructions for setting up and running the project.

Features
User Registration and Authentication
Lending and Borrowing Fiat Currency
Loan Management
Transaction History
Dashboard with Overview
Messaging System
User Profile Management
Getting Started
Prerequisites
Java Development Kit (JDK)
Apache Maven
MySQL Database
Git
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/your-username/peer-to-peer-fiat-lending-app.git
Navigate to the project directory:

bash
Copy code
cd peer-to-peer-fiat-lending-app
Configure the application properties by editing the application.properties file in the src/main/resources directory. Specify your MySQL database settings, including the database URL, username, and password.

Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
java -jar target/peer-to-peer-fiat-lending-app-1.0.jar
Access the application in your web browser at http://localhost:8080.

Usage
Register a new user or log in to an existing account.
Create lending or borrowing requests, specifying the loan amount, interest rate, and terms.
Browse and search for lending or borrowing opportunities.
Initiate loan agreements and manage active loans.
View transaction history and user profile information.
Communicate with other users via the messaging system.
Technologies Used
Spring Boot
Spring Security
Spring Data JPA
Thymeleaf (for templating)
MySQL
Maven (for project management)
Git (for version control)
Contributing
Contributions to the project are welcome. To contribute, please follow these steps:

Fork the repository on GitHub.
Create a new branch for your feature or bug fix.
Implement your changes and test them.
Commit your changes and create a pull request to the original repository.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
If you have any questions or need assistance, please contact Your Name.

Acknowledgments
Special thanks to the open-source community and all the libraries and tools that made this project possible.
