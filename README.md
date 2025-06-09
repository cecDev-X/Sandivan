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
- Gestión de clientes registrados y su historial de compras.
- Reportes de ventas por día/semana/mes.
- Panel web para acceso remoto.
- Más tipos de usuario (como veterinario o encargado de stock).
- Respaldo automático de la base de datos.
- Integración con lector de códigos de barras.

## 👨‍💻 Autor

**Iván Páz Cruz**  
Estudiante de Ingeniería en Sistemas  
Facultad de Ciencias e Ingeniería  
Contacto: ivanpazcruz@gmail.com

---

> Este proyecto es parte de un esfuerzo académico y profesional para desarrollar soluciones tecnológicas que optimicen la operación de pequeñas y medianas empresas en el sector comercial.

