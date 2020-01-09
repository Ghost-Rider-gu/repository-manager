CREATE EXTENSION pgcrypto;
INSERT INTO users (name, password, active, role) VALUES ('David', crypt('david_password', gen_salt('bf')), TRUE, 'USER');
INSERT INTO users (name, password, active, role) VALUES ('Admin', crypt('admin_password', gen_salt('bf')), TRUE, 'ADMIN');
INSERT INTO users (name, password, active, role) VALUES ('Peter', crypt('peter_password', gen_salt('bf')), TRUE, 'USER');