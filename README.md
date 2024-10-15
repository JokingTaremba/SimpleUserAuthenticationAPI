# Simple User Authentication API

The **Simple User Authentication API** is designed for user registration and authentication. It was developed as part of a challenge from the Onit platform.

## Features

- **User Registration**: Allows new users to register with a username, email, and password.
- **User Login**: Users can log in using their email and password.
- **Authentication Validation**: Checks if users are logged in, allowing retrieval of all users or a specific user by their ID.
- **User Logout**: Allows users to log out of their accounts.

## Getting Started

To start using the Simple User Authentication API, follow these steps:

1. **Account Creation**: To create a new user, simply fill in the username, password, and email fields correctly.
2. **Login**: After registration, to authenticate, the user needs to enter a valid email and password. After logging in, an access token will be returned. Copy the token and use it for authentication in subsequent requests.
3. **Authentication Validation**: After providing the token, the user can verify if they are authenticated by fetching a list of all users or retrieving a specific user by ID.
4. **Logout**: To log out, the user can manually clear the token or wait for it to expire, which occurs after 1 hour.

## Environment Setup

Ensure you have the following tools installed:

- **IntelliJ IDEA** 2024.1 or higher
- **Maven** (optional if you are not using IntelliJ)
- **Java** 17 or higher
- **PostgreSQL** (if you are not using Docker)

### Configuration Steps

1. **Clone the repository**: To clone the repository, use the following command:
   ```bash
   git clone git@github.com:JokingTaremba/SimpleUserAuthenticationAPI.git
   cd SimpleUserAuthenticationAPI

2. **Configure the application.properties**: Edit the application.properties file with your credentials::
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   app.secret.key=your_secret_key
   app.secret.expiration=3600


4. **Compile and run the application:**

      If you are using IntelliJ IDEA, you can start the application by clicking the "Run" button.
      
      If you are not using IntelliJ IDEA, you can compile and run the application from the command line:
      ```bash
      mvn clean install
      mvn spring-boot:run


## API Documentation
The complete API documentation, including all endpoints, can be accessed through Swagger. Once the application is running, you can view the interactive documentation at the following link:

**Swagger UI**: https://simpleuserauthenticationapi.onrender.com/swagger-ui/index.html
