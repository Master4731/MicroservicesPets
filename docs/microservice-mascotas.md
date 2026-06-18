# Microservicio de Mascotas

Este microservicio representa la administración de mascotas disponibles para adopción.

## Atributos sugeridos

- `id`
- `nombre`
- `especie`
- `raza`
- `edad`
- `tamaño`
- `sexo`
- `estadoSalud`
- `estadoAdopcion`
- `descripcion`

## Funcionalidades requeridas

1. Registrar una mascota.
2. Consultar todas las mascotas.
3. Buscar mascota por ID.
4. Buscar mascotas por especie.
5. Buscar mascotas por estado de adopción.
6. Actualizar información de una mascota.
7. Cambiar estado de adopción de una mascota.
8. Eliminar una mascota por ID.

## Variables de ambiente usadas por el microservicio.

- **PORT default(9091)**: Representa el puerto donde se ejecuta el microservicio.
- **DB_IP default(localhost)**: Representa la dirección IP o el nombre de host donde se encuentra la base de datos.
- **DB_PORT default(3308)**: Representa el puerto de la base de datos.
- **DB_NAME default(microservicepet)**: Representa el nombre de la base de datos.
- **DB_USER default(root)**: Representa el usuario de la base de datos.
- **DB_PASSWORD default(root)**: Representa la contraseña de la base de datos.
- **EUREKA_IP default(localhost)**: Representa la dirección IP o el nombre de host donde se encuentra Eureka Server.
- **EUREKA_PORT default(9999)**: Representa el puerto de Eureka Server.