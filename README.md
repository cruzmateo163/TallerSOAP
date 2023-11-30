# SoapWebService

SoapWebService es una aplicación de ejemplo que demuestra la creación de un servicio web SOAP utilizando Java y Spring Boot.

## Descripción del Proyecto

Este proyecto utiliza Spring Boot para configurar un servicio web SOAP simple. Proporciona un punto de acceso para obtener información sobre un país a través de solicitudes SOAP.

## Requisitos

- Java 8 o superior
- Maven o Gradle

# Uso del Servicio Web SOAP

El servicio web SOAP proporcionado por esta aplicación está disponible en http://localhost:8080/ws. A continuación, se detallan las instrucciones sobre cómo probar y utilizar este servicio.

## Herramientas de Prueba

Puedes utilizar varias herramientas para probar el servicio web SOAP, entre las cuales se incluyen:

1. **SoapUI:** Una herramienta de prueba de servicios web muy popular.

2. **curl:** Una herramienta de línea de comandos para realizar solicitudes HTTP.

## Ejemplo de Solicitud con curl

Aquí hay un ejemplo de cómo realizar una solicitud al servicio web utilizando curl:

```bash
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



 
