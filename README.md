# SoapWebService

SoapWebService es una aplicación de ejemplo que demuestra la creación de un servicio web SOAP utilizando Java y Spring Boot.

## Descripción del Proyecto

Este proyecto utiliza Spring Boot para configurar un servicio web SOAP simple. Proporciona un punto de acceso para obtener información sobre un país a través de solicitudes SOAP.

## Requisitos

- Java 8 o superior
- Maven o Gradle

## Configuración del Proyecto

### Configuración de Maven (pom.xml)

Asegúrate de tener las siguientes dependencias en tu archivo `pom.xml`:

```xml
<!-- Para Maven -->
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web-services</artifactId>
    </dependency>
    <!-- Otras dependencias -->
</dependencies>

 ## Uso del Servicio Web SOAP
El servicio web está disponible en http://localhost:8080/ws. Puedes probar el servicio utilizando herramientas como SoapUI o curl.
curl -X POST \
  http://localhost:8080/ws \
  -H 'Content-Type: text/xml' \
  -d '
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:web="http://example.org/soapweb/generated">
   <soapenv:Header/>
   <soapenv:Body>
      <web:getCountryRequest>
         <web:name>United States</web:name>
      </web:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>'
