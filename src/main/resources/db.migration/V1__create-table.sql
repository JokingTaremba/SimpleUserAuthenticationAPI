Table users {
  id BIGINT PRIMARY KEY NOT NULL,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  created_at TIMESTAMP,
  updated_at TIMESTAMP
}