
CREATE TABLE aircraft (
                          id BIGSERIAL PRIMARY KEY,

                          registration_number VARCHAR(20) NOT NULL UNIQUE,

                          manufacturer VARCHAR(50) NOT NULL,

                          model VARCHAR(50) NOT NULL,

                          status VARCHAR(30) NOT NULL,

                          created_at TIMESTAMP NOT NULL
);



