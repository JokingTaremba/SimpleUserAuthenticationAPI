# Simple User Authentication API

The **Simple User Authentication API** is designed for user registration and authentication. It was developed as part of a challenge from the Onit platform.

## Features

- **User Registration**: Allows new users to register with a username, email, and password.
- **User Login**: Users can log in using their email and password.
- **Authentication Validation**: Checks if users are logged in, allowing retrieval of all users or a specific user by their ID.
- **User Logout**: Allows users to log out of their accounts.

## Getting Started

To start using the Simple User Authentication API, follow these steps:

### 1. Account Creation
To create a new user, simply fill in the username, password, and email fields correctly.

### 2. Login
After registration, to authenticate, the user needs to enter a valid email and password. After logging in, an access token will be returned. Copy the token and use it for authentication in subsequent requests.

### 3. Authentication Validation
After providing the token, the user can verify if they are authenticated by fetching a list of all users or retrieving a specific user by ID.

### 4. Logout
To log out, the user can manually clear the token or wait for it to expire, which occurs after 1 hour.

## Environment Setup

Ensure you have the following tools installed:

- **IntelliJ IDEA** 2024.1 or higher
- **Maven** (optional if you are not using IntelliJ)
- **Java** 17 or higher
- **PostgreSQL** (if you are not using Docker)

### Configuration Steps

#### 1. Clone the repository
```bash
git clone git@github.com:JokingTaremba/SimpleUserAuthenticationAPI.git
cd SimpleUserAuthenticationAPI
