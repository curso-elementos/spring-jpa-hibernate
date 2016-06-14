# spring-jpa-hibernate con Spring boot version 1.4.0. M3


## Propiedades importantes
En este archivo puedesn configurar las principales propiedades, en ellas vamos a configurar aspectos escenciales de nuestra aplicación, en el siguiente enlace podrás obtener muchas de esas propiedades las puedes ver en [siguiente link](http://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

En este caso sólo vamos a agregar algunas propiedades, que son las que se muestran en el siguiente codigo, el cual se genera en la carpeta de recursos de tu proyecto de netbeans y dentro del archivo application.properties


`
# ===============================
# Del datasource
# ===============================

# S

# Mysql
spring.datasource.url = jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull

#Oracle
#spring.datasource.url = jdbc:oracle:thin:@localhost:1521:orcl

# Usuario y password para mysql
spring.datasource.username = root
#Para Wamp Server comentar el password, si es que no lo tiene 
#spring.datasource.password = root

# Usuario y password para oracle
#spring.datasource.username = system
#spring.datasource.password = system

# Para mantener la conexion activa en produccion
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1

# ===============================
# = JPA / HIBERNATE
# ===============================

spring.jpa.show-sql = true
# Este es para que hibernate haga un update ante las operaciones
# CUD
# 
spring.jpa.hibernate.ddl-auto = update
# Estrategia de nombre de JPA
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
# Asignando el dialecto de la abse de datos. en este caso es para MySQL
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
#--------------------------------------------------
#PUERTO HTTP
#--------------------------------------------------
server.port=9999
 # Server HTTP port.

`
Se pueden agregar más parámetros pero con estos es suficientre para nuestro proyecto.


