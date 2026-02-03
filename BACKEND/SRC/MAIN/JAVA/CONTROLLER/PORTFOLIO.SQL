CREATE DATABASE IF NOT EXISTS portfolio_db;
USE portfolio_db;

CREATE TABLE IF NOT EXISTS admin (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS profile (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    bio TEXT,
    image_url VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS skill (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    proficiency VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS project (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    link VARCHAR(255),
    image_url VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS certificate (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    issuer VARCHAR(255),
    date_issued DATE,
    link VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS contact_message (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO admin (username, password) VALUES ('admin', 'admin123');
INSERT INTO profile (name, bio, image_url) VALUES ('Nithish GS', 'Full Stack Developer', '../ASSETS/IMAGES/PROFILE.JPG');