-- Active: 1769969370886@@_@null
-- Admin Table
CREATE TABLE admin (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255),
    password VARCHAR(255)
);

-- Certificate Table
CREATE TABLE certificate (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    category VARCHAR(255),
    file_url VARCHAR(255)
);

-- Contact Message Table
CREATE TABLE contact_message (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    message TEXT
);

-- Profile Table
CREATE TABLE profile (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    bio TEXT,
    image_url VARCHAR(255)
);

-- Project Table
CREATE TABLE project (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    description TEXT,
    certificate_url VARCHAR(255)
);

-- Skill Table
CREATE TABLE skill (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    certificate_url VARCHAR(255)
);
    -- Experience Table
CREATE TABLE experience (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(255),
    role VARCHAR(255),
    start_date DATE,
    end_date DATE,
    description TEXT
);

-- Education Table
CREATE TABLE education (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    institution_name VARCHAR(255),
    degree VARCHAR(255),
    field_of_study VARCHAR(255),
    start_year YEAR,
    end_year YEAR,
    grade VARCHAR(50)
);

-- Social Links Table
CREATE TABLE social_link (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    platform_name VARCHAR(100),
    profile_url VARCHAR(255),
    icon_class VARCHAR(100)
);
