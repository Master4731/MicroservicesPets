# Microservicio de Solicitudes de Adopción
Este microservicio representa la administración de solicitudes de adopción dentro del sistema.

La entidad principal será AdoptionRequest, la cual almacena la información necesaria para registrar qué adoptante desea adoptar una mascota.

## Entidad: AdoptionRequest
La entidad AdoptionRequest representa una solicitud realizada por un adoptante para iniciar el proceso de adopción de una mascota.

Este microservicio se comunica con:

- Microservicio de mascotas.
- Microservicio de adoptantes.

## Atributos sugeridos
- id
- adopterId
- petId
- emailAdopter
- namePet
- status

## Enum sugerido: AdoptionRequestStatus
El estado de la solicitud puede manejarse mediante un enum.

java
public enum AdoptionRequestStatus {
    PENDING,
    APPROVED,
    REJECTED
}


## Implementacion de Resilience4j
Al comunicarse con los microservicios de mascotas y adoptantes se deben implementar circuit breaker y rate limiter.

### Se agrega el siguiente starter
- Resilience4j de Spring cloud

## Variables de ambiente usadas por el microservicio.

- **PORT default(9093)**: Representa el puerto donde se ejecuta el microservicio.
- **DB_IP default(localhost)**: Representa la dirección IP o el nombre de host donde se encuentra la base de datos.
- **DB_PORT default(3308)**: Representa el puerto de la base de datos.
- **DB_NAME default(microserviceadoptionrequest)**: Representa el nombre de la base de datos.
- **DB_USER default(root)**: Representa el usuario de la base de datos.
- **DB_PASSWORD default(root)**: Representa la contraseña de la base de datos.
- **EUREKA_IP default(localhost)**: Representa la dirección IP o el nombre de host donde se encuentra Eureka Server.
- **EUREKA_PORT default(9999)**: Representa el puerto de Eureka Server.
- **CONFIG_IP default(localhost)**: Representa la dirección IP o el nombre de host donde se encuentra Config Server.
- **CONFIG_PORT default(7777)**: Representa el puerto de Config Server.