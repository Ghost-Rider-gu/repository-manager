INSERT INTO user VALUES ('David', crypt('david_password', gen_salt('bf')), TRUE, 'USER');
INSERT INTO user VALUES ('Admin', crypt('admin_password', gen_salt('bf')), TRUE, 'ADMIN');
INSERT INTO user VALUES ('Peter', crypt('peter_password', gen_salt('bf')), TRUE, 'USER');