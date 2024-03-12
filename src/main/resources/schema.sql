CREATE SEQUENCE IF NOT EXISTS "hibernate_sequence" START WITH 1000 INCREMENT BY 1 MINVALUE 1 MAXVALUE 99999999999999999 CACHE 1 CYCLE;

CREATE TABLE IF NOT EXISTS notification (
  id BIGINT NOT NULL,
   sms_notification BOOLEAN,
   email_notification BOOLEAN,
   push_notification BOOLEAN,
   CONSTRAINT pk_notification PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS delivery (
   id BIGINT NOT NULL,
   city VARCHAR(255),
   address VARCHAR(255),
   CONSTRAINT pk_delivery PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users (
   id BIGINT NOT NULL,
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   email VARCHAR(255),
   password VARCHAR(255),
   delivery_id BIGINT,
   notification_setting_id BIGINT,
   CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS categories (
   id BIGINT NOT NULL,
   title VARCHAR(255),
   parent_id BIGINT,
   CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS products (
   id BIGINT NOT NULL,
   title VARCHAR(255),
   price FLOAT,
   is_deleted BOOLEAN,
   category_id BIGINT NOT NULL,
   created_date TIMESTAMP WITHOUT TIME ZONE,
   quantity INTEGER,
   CONSTRAINT pk_products PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS cart (
    id BIGINT NOT NULL,
    product_id BIGINT NOT NULL,
    quantity INTEGER,
    CONSTRAINT pk_cart PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS order_items (
   id BIGINT NOT NULL,
   product_id BIGINT NOT NULL,
   quantity INTEGER,
   CONSTRAINT pk_order_items PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS orders (
   id BIGINT NOT NULL,
   created_date TIMESTAMP WITHOUT TIME ZONE,
   updated_status TIMESTAMP WITHOUT TIME ZONE,
   order_status VARCHAR(255),
   total_price FLOAT,
   CONSTRAINT pk_orders PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS order_user (
   id BIGINT NOT NULL,
   order_id BIGINT NOT NULL,
   user_id BIGINT NOT NULL,
   order_item_id BIGINT NOT NULL,
   CONSTRAINT pk_order_user PRIMARY KEY (id)
);
