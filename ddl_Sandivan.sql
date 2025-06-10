CREATE SCHEMA sandivan;
SET search_path TO sandivan;

CREATE TABLE proveedor (
    id_proveedor SERIAL PRIMARY KEY,
    nombre_empresa VARCHAR(50) NOT NULL,
    contacto VARCHAR(50),
    ubicacion VARCHAR(100)
);

CREATE TABLE habitat (
    codigo_habitat VARCHAR(10) PRIMARY KEY,
    descripcion VARCHAR(100)
);

CREATE TABLE rol (
    id_rol SERIAL PRIMARY KEY,
    descrip VARCHAR(30)
);

CREATE TABLE usuario (
    rfc VARCHAR(13) PRIMARY KEY,
    nombres VARCHAR(50),
    apellidos VARCHAR(50),
    telefono VARCHAR(15),
    direccion VARCHAR(50),
    correo VARCHAR(35),
    clavesita VARCHAR(255),
    id_rol INTEGER REFERENCES rol(id_rol)
);

CREATE TABLE animal (
    id_animal SERIAL PRIMARY KEY,
    nombre_comun VARCHAR(100) NOT NULL,
    edad INTEGER CHECK (edad >= 0),
    sexo CHAR(1) CHECK (sexo IN ('M', 'H', 'F')),
    precio NUMERIC(10,2) CHECK (precio >= 0),
    stock_disponible INTEGER CHECK (stock_disponible >= 0),
    codigo_habitat VARCHAR(10) REFERENCES habitat(codigo_habitat),
    codigo_proveedor INTEGER REFERENCES proveedor(id_proveedor)
);

CREATE TABLE pedido (
    id_pedido SERIAL PRIMARY KEY,
    rfc_cliente VARCHAR(13) REFERENCES usuario(rfc),
    fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20),
    metodo_pago VARCHAR(30)
);

CREATE TABLE detalle_pedido (
    id_animal INTEGER REFERENCES animal(id_animal),
    id_pedido INTEGER REFERENCES pedido(id_pedido),
    cantidad INTEGER
);

CREATE TABLE documentacion (
    id_documento INTEGER PRIMARY KEY,
    tipo VARCHAR(30),
    archivo VARCHAR(255),
    id_animal INTEGER REFERENCES animal(id_animal)
);

CREATE TABLE envio (
    id_envio INTEGER PRIMARY KEY,
    id_pedido INTEGER REFERENCES pedido(id_pedido),
    num_seguimiento VARCHAR(30),
    paqueteria VARCHAR(30),
    fecha_entrega DATE,
    direccion_envio VARCHAR(100)
);