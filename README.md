# 🐾 Sandivan - Punto de Venta para Tiendas de Animales

**Sandivan** es un sistema de punto de venta diseñado para gestionar eficientemente las operaciones en una tienda de animales. Su arquitectura modular, escalabilidad y enfoque en la seguridad lo convierten en una solución robusta para entornos comerciales que requieren control de inventario, administración de usuarios y registro de ventas.

## 🧩 Características Principales

### 🔐 Gestión de Acceso y Usuarios
- Inicio de sesión mediante **correo electrónico verificado**.
- Prevención de **usuarios duplicados** mediante validación en la base de datos.
- Manejo de múltiples tipos de usuario (actualmente `Administrador` y `Cajero`), con posibilidad de ampliar a nuevos roles en futuras versiones.
  
### 🧑‍💼 Panel de Administrador
- Alta y baja de usuarios del sistema.
- Registro, consulta y eliminación de animales disponibles en la tienda.
- Validación para evitar duplicidad de animales en el inventario.

### 💵 Panel de Cajero
- Registro de ventas detallado.
- **Verificación de stock disponible** antes de realizar la venta.
- Envío opcional de **ticket en formato PDF** al cliente mediante correo electrónico.
- Búsqueda eficiente de animales en el inventario para facilitar la operación del cajero.

## 🗃️ Base de Datos

El proyecto utiliza **PostgreSQL** como sistema de gestión de base de datos, lo cual permite:

- Almacenamiento seguro y estructurado de usuarios, animales y transacciones.
- Integridad de datos garantizada mediante llaves primarias y foráneas.
- Consultas eficientes para búsquedas, validaciones y reportes.

## 🧪 Tecnologías Utilizadas

- **Java** (Swing) para la interfaz gráfica de usuario.
- **PostgreSQL** para la gestión de datos.
- **JDBC** para la conexión entre Java y la base de datos.
- **iText** (u otra librería similar) para la generación de tickets en formato PDF.
- **Git** y **GitHub** para control de versiones y colaboración.

## 📦 Futuras Funcionalidades (en desarrollo o previstas)
- Gestión de clientes registrados.
- Panel web para acceso remoto.
- Más tipos de usuario (como veterinario o encargado de stock).
- Respaldo automático de la base de datos.

##Demostracionde uso##
-Esta la parte del login donde se loguea tanto el administrador o cajero(por ahora)
![image](https://github.com/user-attachments/assets/36474fe4-7677-401d-9298-205fdc63fff7)

-En este panel se esta entrando como administrador el cual tiene privilegios de eliminar y agregar tanto animales como usuarios
![image](https://github.com/user-attachments/assets/7999ec24-7a02-4eaa-a668-9d708051d00d)

-En la siguiente parte se ve como se entra como cajero y las opciones que se tienen 
![image](https://github.com/user-attachments/assets/8163ff10-70df-48cc-9a03-4c3748982a4c)

##Esto es una pequeña demostracion de como funcionan nuestro punto de venta de manera muy general"

**A continuacion se les deja un link en la plataforma de youtube para una mejor demostracion.


## 👨‍💻 Autor

**Iván Páz Cruz**  
**Eduardo **
Estudiante de Ingeniería en Sistemas  



---

> Este proyecto es parte de un esfuerzo académico y profesional para desarrollar soluciones tecnológicas que optimicen la operación de pequeñas y medianas empresas en el sector comercial.

