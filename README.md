# CRUD Rápido con Spring Boot y MySQL

![Static Badge](https://img.shields.io/badge/Spring_Boot-%236DB33F?logo=Spring&logoColor=white) ![Static Badge](https://img.shields.io/badge/Mysql-%234479A1?logo=mysql&logoColor=white)

 [![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) [![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#) [![Static Badge](https://img.shields.io/badge/license-MIT-blue)](#)


Este proyecto es una aplicación CRUD básica desarrollada con Spring Boot y MySQL. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Borrar) en una entidad `Student`.


![springCRUDrapido](https://github.com/nandojmj/CRUD_Spring_Boot-_MySQL/assets/156966097/bca6df34-2672-44c0-90a1-43ea03cf835b)

![Captura5](https://github.com/nandojmj/CRUD_Spring_Boot-_MySQL/assets/156966097/c1784928-8010-438a-9982-26f0fe8539e5)

![postmancrud](https://github.com/nandojmj/CRUD_Spring_Boot-_MySQL/assets/156966097/ed038bb6-24b0-4bc4-adb9-8645118e9bb6)


## Configuración

1. Clona o descarga este repositorio.

2. Importa el proyecto en tu IDE preferido como un proyecto Maven.

3. Configura la base de datos MySQL:
   - Crea una base de datos llamada `crud_rapido`.
   - Verifica y, si es necesario, actualiza la configuración de la base de datos en el archivo `application.properties` ubicado en `src/main/resources`.

4. Ejecuta la aplicación:
   - Desde tu IDE, ejecuta la clase `CrudrapidoApplication.java`.
   - O desde la línea de comandos, ejecuta `mvn spring-boot:run`.

5. La aplicación estará disponible en `http://localhost:8080`.

## Uso

- **Obtener todos los estudiantes**: 
  - Método: `GET`
  - URL: `http://localhost:8080/api/v1/students/`

- **Obtener un estudiante por ID**:
  - Método: `GET`
  - URL: `http://localhost:8080/api/v1/students/{studentId}`

- **Agregar un nuevo estudiante**:
  - Método: `POST`
  - URL: `http://localhost:8080/api/v1/students/`
  - Body: JSON con los detalles del estudiante

- **Actualizar un estudiante existente**:
  - Método: `POST`
  - URL: `http://localhost:8080/api/v1/students/`
  - Body: JSON con los detalles actualizados del estudiante

- **Eliminar un estudiante por ID**:
  - Método: `DELETE`
  - URL: `http://localhost:8080/api/v1/students/{studentId}`

## Tecnologías Utilizadas

- Java
- Spring Boot
- MySQL
- Lombok

## Estructura del Proyecto

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── crudrapido/
│   │   │               ├── CrudrapidoApplication.java
│   │   │               ├── controller/
│   │   │               │   └── StudentController.java
│   │   │               ├── entity/
│   │   │               │   └── Studend.java
│   │   │               ├── repository/
│   │   │               │   └── StudentRepository.java
│   │   │               └── service/
│   │   │                   └── StudentService.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Contribuir

Las contribuciones son bienvenidas. Si tienes alguna sugerencia de mejora, por favor crea un *issue* o envía un *pull request*.

## Licencia

Este proyecto está bajo la Licencia MIT.
