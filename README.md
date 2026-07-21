# Capturas Practica 1

### 1. Captura de verificación de Java

Salida del comando `java -version.`

<img width="775" height="121" alt="image" src="https://github.com/user-attachments/assets/8e1e452c-4a1c-4218-8d10-40db7d3ca463" />

### 2. Captura del servidor Spring Boot ejecutándose

<img width="1276" height="872" alt="image" src="https://github.com/user-attachments/assets/0d72e2c2-978e-4898-9daf-24b17ea4c1f9" />

### 3. Captura del endpoint `/api/status` funcionando en el navegador o Postman o Bruno

<img width="1241" height="427" alt="image" src="https://github.com/user-attachments/assets/0d414ef7-a6f1-4547-a2d1-022b5d956cd4" />

### 4. Captura del siguiente comando en terminal

<img width="1271" height="267" alt="image" src="https://github.com/user-attachments/assets/90747226-c684-4e96-b48e-32f6f61ad41a" />

### 5. Explicación breve escrita por el estudiante

- ¿Que entendio sobre el funcionamiento del Endpoint y sobre la funcion general Spring Boot en la creaciion del servidor?

La creación del endpoint me permito comprobar que el servidor Spring Boot estaba funcionando correctamente ya que me devolvio un JSON con las parametros requeridos a su vez 
entendi que Spring Boot facilita el trabajo ya que no es necesario configurar manualmente esto nos permita crear y ejecutar aplicaciones web de manera facil y sencilla.

# Capturas practica 2

### Captura del IDE mostrando la estructura modular

<img width="492" height="1129" alt="image" src="https://github.com/user-attachments/assets/8dfa59cf-0d90-43be-8465-699f2d0f391b" />

### Captura del archivo Fundamentos01Application.java

<img width="1919" height="968" alt="image" src="https://github.com/user-attachments/assets/d1769866-d8f6-4ea9-b758-870596f7e9df" />

### Explicación breve

¿Por qué es importante tener módulos separados?

La organización modular permite separ responsabilidades dentro del proyecto ya que cada dominio contiene sus propies controladores, servicios y repositorios lo que facilita el mantenimiento y escalabilidad.

# Capturas practica 3

### Captura de consumo de endpoints de Products desde Postman.

- 1. `GET /api/products Con 3 preductos creados`

<img width="1230" height="633" alt="image" src="https://github.com/user-attachments/assets/dc58109d-c31e-44b3-92b0-6a2e128dd6ef" />

- 2. `GET /api/products/:id Con un producto existente`

<img width="1241" height="480" alt="image" src="https://github.com/user-attachments/assets/efb2e56c-8d81-4fa7-b17c-ed914edcece8" />

- 3. `DELETE /api/products/:id Eliminando un producto existente`

<img width="1228" height="416" alt="image" src="https://github.com/user-attachments/assets/2211974b-2ee9-4392-8778-5c53a0051446" />

- 4. `DELETE /api/products/:id Eliminando un producto que no existe`

<img width="1234" height="403" alt="image" src="https://github.com/user-attachments/assets/8571cd32-a9b2-4169-8008-be221c068b69" />

# Capturas practica 4

### Captura completa de ProductServiceImpl.java

<img width="1439" height="1099" alt="image" src="https://github.com/user-attachments/assets/c169a595-7cd1-483b-b164-cd86743b6c3f" />

### Captura de ProductsController.java

<img width="1431" height="1094" alt="image" src="https://github.com/user-attachments/assets/ef79e9cd-99bc-4296-9648-f0f2b3890ac1" />

- ¿Cómo se inyecta el servicio en el controlador?

El servicio se inyecta mediante el constructor del controlador, spring boot detecta que el controlador necesita un productServicey busca la implementacion marcada con @Service (ProductServiceImpl) crea una instancia y la pasa automáticamnete al controladr.

# Capturas practica 5

### Captura de 5 productos creados en PostgreSQL

<img width="1454" height="560" alt="image" src="https://github.com/user-attachments/assets/ee18547e-5b9b-4c87-8f99-a0557b2fdb8f" />

- 1. Explicar brevemente el flujo de datos desde la API REST hasta PostgreSQL y viceversa, destacando el uso de BaseEntity.

El flujo inicia cuando el cliente envía una petición HTTP al controlador, el controlador delega la operación al servicio, que utiliza el repositorio JPA para comunicarse con PostgreSQL y los datos se guardan en la tabla products como entidades que heredan de BaseEntity y al consultar el repositorio devuelve entidades, que se convierten en modelos y luego en DTOs de respuesta para el cliente.

# Capturas practica 6

### Error al crear producto con precio negativo

<img width="1241" height="413" alt="Captura de pantalla 2026-06-24 123013" src="https://github.com/user-attachments/assets/dc151dcd-ecbf-4188-a1c2-8d1491b671c1" />

### Error al actualizar producto eliminado

<img width="1236" height="415" alt="image" src="https://github.com/user-attachments/assets/7cb79243-ba64-436a-be02-478c06532a2e" />

### findAll no devuelve prodcutos eliminados 

<img width="1246" height="623" alt="image" src="https://github.com/user-attachments/assets/f9d00c64-86eb-430b-85e1-bd0c5c39cd92" />

# Capturas practica 7

### Producto inexistente

<img width="1222" height="399" alt="image" src="https://github.com/user-attachments/assets/c0d20931-272f-4415-944b-70ad17cfee8d" />

### Producto duplicado

<img width="1225" height="376" alt="image" src="https://github.com/user-attachments/assets/0ca05462-b333-494c-9f63-36748537d2f1" />

### Error por validación de DTO

<img width="1223" height="532" alt="image" src="https://github.com/user-attachments/assets/de5dfcb5-865f-4ea5-8570-f4d30860857a" />

# Capturas practica 8

### Tabla `products` en PostgreSQL

<img width="1474" height="466" alt="image" src="https://github.com/user-attachments/assets/03b5a98d-96b8-4d35-9fbb-4e60b36fd019" />

### Respuesta en bruno de la creación de Producto con sus relaciones

<img width="1228" height="668" alt="image" src="https://github.com/user-attachments/assets/f2f82efb-713c-4acc-b231-779e1d7313ca" />

### Captura de consulta de productos por categoría

<img width="1224" height="701" alt="image" src="https://github.com/user-attachments/assets/3a69099b-0661-4713-b9dc-48051de43f5c" />

### ¿Cómo se relaciona ProductEntity con UserEntity y CategoryEntity usando @ManyToOne y @JoinColumn?

ProductEntity establece una relación de tipo "Muchos a Uno" con UserEntity y CategoryEntity mediante la anotación @ManyToOne. Esto indica que, a nivel de negocio, múltiples productos pueden pertenecer a un mismo usuario o categoría.

A nivel de base de datos, la anotación @JoinColumn define explícitamente las columnas user_id y category_id dentro de la tabla products. Estas columnas actúan como claves foráneas, garantizando la integridad referencial al asegurar que cada producto esté vinculado obligatoriamente a registros existentes en las tablas users y categories.

# Capturas practica 11

###  registro exitoso

<img width="1224" height="602" alt="Captura de pantalla 2026-07-08 144641" src="https://github.com/user-attachments/assets/02ed310a-1ed0-435e-bf98-3bcf82e770ce" />

### login exitoso

<img width="1228" height="681" alt="Captura de pantalla 2026-07-08 144830" src="https://github.com/user-attachments/assets/09e67f3a-06cf-425d-a761-d3ae228d590a" />

### endpoint protegido sin token

<img width="1221" height="499" alt="Captura de pantalla 2026-07-08 144948" src="https://github.com/user-attachments/assets/ff4f1048-d644-4f49-a2c8-14041f85f410" />

### endpoint protegido con token

<img width="1232" height="873" alt="Captura de pantalla 2026-07-08 145110" src="https://github.com/user-attachments/assets/4dca0745-1fe8-4c98-a5c6-929cd19f3991" />

# Capturas Practica 13

### Creación de producto con usuario autenticado

<img width="1233" height="767" alt="image" src="https://github.com/user-attachments/assets/1a100164-8f63-48d2-97a5-8a2109444558" />

### Bloqueo por producto ajeno

<img width="1221" height="491" alt="image" src="https://github.com/user-attachments/assets/1430ea76-3291-4831-897c-71de997c7fc5" />

### Eliminación de producto ajeno bloqueada

<img width="1219" height="408" alt="image" src="https://github.com/user-attachments/assets/d1a79a0f-77da-4928-8cbb-4c189a3ff906" />

### ADMIN modificando producto ajeno

<img width="1219" height="790" alt="image" src="https://github.com/user-attachments/assets/e356d2df-3a6f-4568-9844-6717d201b160" />

# Capturas de la parctica 14

### Captura de login con refresh token

<img width="1611" height="654" alt="image" src="https://github.com/user-attachments/assets/0473f886-130e-4305-b89d-3447472a5747" />

### Captura de refresh exitoso

<img width="1615" height="632" alt="image" src="https://github.com/user-attachments/assets/68f44128-3bc5-4073-9e89-4c03cf80d78c" />

### Captura de logout

<img width="1609" height="491" alt="image" src="https://github.com/user-attachments/assets/c3ec3726-9059-4d77-94f4-8209f262bb66" />

### Captura de refresh después de logout

<img width="1610" height="544" alt="image" src="https://github.com/user-attachments/assets/69075212-c676-4a25-a9a9-2433b5c72fe8" />

### ¿Cuál es la diferencia entre access token y refresh token?

El Access Token es un token de corta duración que viaja en el Header HTTP y se utiliza para dar acceso inmediato a endpoints protegidos de la API. El Refresh Token es un token de larga duración que viaja en el cuerpo de peticiones específicas del endpoint de autenticación /auth/refresh únicamente para solicitar nuevos pares de tokens cuando el Access Token expira.

### ¿Por qué el refresh token no debe usarse en Authorization: Bearer?

Por razones de seguridad y diseño. Si un Refresh Token viajara en cada petición HTTP dentro de los Headers, estaría expuesto constantemente a intercepciones en la red. Al restringir su uso exclusivamente a peticiones POST hacia /auth/refresh, minimizamos su exposición y evitamos que un Refresh Token comprometido pueda ser usado para alterar directamente recursos del backend.

### ¿Qué significa rotar un refresh token?

Significa que cada vez que un cliente envía un Refresh Token para renovar su sesión, el servidor lo invalida inmediatamente de la base de datos y le devuelve al cliente un nuevo Refresh Token junto con el nuevo Access Token. Esto evita que si un atacante roba un Refresh Token de forma silenciosa, pueda usarlo indefinidamente para generar nuevos accesos.

# Capturas de la practica 15

### Captura de docker ps de Ubuntu Server mostrando ambos contenedores en ejecución.

<img width="1919" height="150" alt="image" src="https://github.com/user-attachments/assets/3eb3c016-915a-498f-ac30-11eebf187b1a" />

### Captura de curl de /api/actuator/health desde Ubuntu Server.

<img width="1919" height="251" alt="Captura de pantalla 2026-07-17 153405" src="https://github.com/user-attachments/assets/1663ae92-cec4-4902-b8cc-33a3500b92ec" />

### Captura de curl de /api/actuator/health desde la máquina anfitriona.

<img width="1919" height="140" alt="image" src="https://github.com/user-attachments/assets/d7b8cc1b-1aad-4509-86de-d7a4545bc49f" />

### Explicación de la conexión a PostgreSQL externo o evidencia de fallback utilizado.

Para permitir que el contenedor de la API se comunique con la base de datos PostgreSQL instalada en la máquina anfitriona, se implementó la siguiente arquitectura de red y seguridad:

Arquitectura de Red: Se configuró una red de tipo Host-Only en VirtualBox para establecer un segmento de red privado entre el anfitrión y el servidor invitado Ubuntu. Dentro de Ubuntu se creó una red de Docker (app-network) mediante el comando docker network create app-network, aislando el tráfico de la API de la red pública.

Configuración del Servidor: Se modificó el archivo postgresql.conf en el anfitrión para permitir que el servicio PostgreSQL escuche peticiones en la interfaz de red privada, configurando listen_addresses = 'localhost,192.168.56.1'.

Seguridad y Acceso (pg_hba.conf): Para autorizar la conexión proveniente del contenedor, se actualizó el archivo pg_hba.conf del anfitrión, se añadió una regla que permite el acceso al usuario ups desde el rango de red de Docker para asegurar que los contenedores autorizados tengan acceso a la base de datos devdb:
host devdb ups 172.16.0.0/12 scram-sha-256

Configuración de la API: La aplicación Spring Boot utiliza la variable de entorno DATABASE_URL para conectarse a la dirección IP del anfitrión. Esta configuración permite mantener el código fuente independiente del entorno, facilitando la portabilidad del contenedor hacia otros ambientes como Render sin necesidad de recompilación.

### Captura consumo de login desde la máquina anfitriona con Bruno o Postman.

<img width="1229" height="675" alt="image" src="https://github.com/user-attachments/assets/e5eb7ff2-4f5f-4efe-8ebb-f539446d506d" />
