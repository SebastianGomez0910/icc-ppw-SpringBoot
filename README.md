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
